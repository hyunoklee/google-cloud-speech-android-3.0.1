package com.example.hyunok.myapplication5;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_MESSAGE_DIALOG = "message_dialog";

    private static final String STATE_RESULTS = "results";

    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 1;

    private SpeechService mSpeechService;

    private VoiceRecorder mVoiceRecorder;
    private String TAG = "cloud_speech" ;
    private TextView state ;
    private TextView content_ing ;
    private TextView content_finish ;
    private Button button1;
    private Boolean operating = false ;
    private Handler mHandler = new Handler();

    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder binder) {
            mSpeechService = SpeechService.from(binder);
            mSpeechService.addListener(mSpeechServiceListener);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mSpeechService = null;
        }

    };

    private final VoiceRecorder.Callback mVoiceCallback = new VoiceRecorder.Callback() {

        @Override
        public void onVoiceStart() {
            mSpeechService.startRecognizing(mVoiceRecorder.getSampleRate());
            Log.d(TAG, "onVoiceStart");
            uiTextChagne(state,"onVoiceStart");
        }

        @Override
        public void onVoice(byte[] data, int size) {
            if (mSpeechService != null) {
                mSpeechService.recognize(data, size);
                Log.d(TAG, "onVoice");
                uiTextChagne(state,"onVoice");
            }
        }

        @Override
        public void onVoiceEnd() {
            showStatus(false);
            if (mSpeechService != null) {
                mSpeechService.finishRecognizing();
                Log.d(TAG, "onVoiceEnd");
                uiTextChagne(state,"onVoiceEnd");

            }
        }

    };

    private final SpeechService.Listener mSpeechServiceListener =
            new SpeechService.Listener() {
                @Override
                public void onSpeechRecognized(final String text, final boolean isFinal) {
                    if (isFinal) {
                        mVoiceRecorder.dismiss();
                        uiTextChagne(content_finish,text);
                        Log.d(TAG, "isFinal : " + isFinal  + "," + text );
                        stopVoiceRecorder();
                        if (mSpeechService != null) {
                            mSpeechService.finishRecognizing();
                            Log.d(TAG, "onVoiceEnd");
                            uiTextChagne(state,"onVoiceEnd");

                        }

                    }else{
                        uiTextChagne(content_ing,text);
                        Log.d(TAG, "isFinal : " + isFinal  + "," + text );
                    }

                }
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        state = (TextView) findViewById(R.id.state) ;
        content_ing = (TextView) findViewById(R.id.content_ing);
        content_finish = (TextView) findViewById(R.id.content_finish);
        button1 = (Button) findViewById(R.id.button1) ;
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                /*operating = true;
                mSpeechService.startRecognizing(mVoiceRecorder.getSampleRate());
                Log.d(TAG, "onVoiceStart");
                state.setText( "onVoiceStart");*/
                startVoiceRecorder();
                uiTextChagne(state,"onVoiceStart");
            }
        });

        operating = false ;

    }

    @Override
    protected void onStart() {
        super.onStart();

        // Prepare Cloud Speech API
        bindService(new Intent(this, SpeechService.class), mServiceConnection, BIND_AUTO_CREATE);

        // Start listening to voices
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                == PackageManager.PERMISSION_GRANTED) {
            //startVoiceRecorder();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.RECORD_AUDIO)) {
            showPermissionMessageDialog();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO},
                    REQUEST_RECORD_AUDIO_PERMISSION);
        }
    }

    void uiTextChagne(final TextView state , final String command ){

        mHandler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                state.setText(command);
            }
        },0);

    }


    @Override
    protected void onStop() {
        // Stop listening to voice
        stopVoiceRecorder();

        // Stop Cloud Speech API
        mSpeechService.removeListener(mSpeechServiceListener);
        unbindService(mServiceConnection);
        mSpeechService = null;
        mHandler.removeCallbacks(null);

        super.onStop();
    }

    private void startVoiceRecorder() {
        if (mVoiceRecorder != null) {
            mVoiceRecorder.stop();
        }
        mVoiceRecorder = new VoiceRecorder(mVoiceCallback);
        mVoiceRecorder.start();
    }

    private void stopVoiceRecorder() {
        if (mVoiceRecorder != null) {
            mVoiceRecorder.stop();
            mVoiceRecorder = null;
        }
    }

    private void showPermissionMessageDialog() {
        MessageDialogFragment
                .newInstance(getString(R.string.permission_message))
                .show(getSupportFragmentManager(), FRAGMENT_MESSAGE_DIALOG);
    }

    private void showStatus(final boolean hearingVoice) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //mStatus.setTextColor(hearingVoice ? mColorHearing : mColorNotHearing);
            }
        });
    }
}
