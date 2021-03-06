// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/money.proto

package com.google.type;

/**
 * <pre>
 * Represents an amount of money with its currency type.
 * </pre>
 *
 * Protobuf type {@code google.type.Money}
 */
public  final class Money extends
    com.google.protobuf.GeneratedMessageLite<
        Money, Money.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.Money)
    MoneyOrBuilder {
  private Money() {
    currencyCode_ = "";
  }
  public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
  private java.lang.String currencyCode_;
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>optional string currency_code = 1;</code>
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode_;
  }
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>optional string currency_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(currencyCode_);
  }
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>optional string currency_code = 1;</code>
   */
  private void setCurrencyCode(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    currencyCode_ = value;
  }
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>optional string currency_code = 1;</code>
   */
  private void clearCurrencyCode() {
    
    currencyCode_ = getDefaultInstance().getCurrencyCode();
  }
  /**
   * <pre>
   * The 3-letter currency code defined in ISO 4217.
   * </pre>
   *
   * <code>optional string currency_code = 1;</code>
   */
  private void setCurrencyCodeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    currencyCode_ = value.toStringUtf8();
  }

  public static final int UNITS_FIELD_NUMBER = 2;
  private long units_;
  /**
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>optional int64 units = 2;</code>
   */
  public long getUnits() {
    return units_;
  }
  /**
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>optional int64 units = 2;</code>
   */
  private void setUnits(long value) {
    
    units_ = value;
  }
  /**
   * <pre>
   * The whole units of the amount.
   * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
   * </pre>
   *
   * <code>optional int64 units = 2;</code>
   */
  private void clearUnits() {
    
    units_ = 0L;
  }

  public static final int NANOS_FIELD_NUMBER = 3;
  private int nanos_;
  /**
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>optional int32 nanos = 3;</code>
   */
  public int getNanos() {
    return nanos_;
  }
  /**
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>optional int32 nanos = 3;</code>
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <pre>
   * Number of nano (10^-9) units of the amount.
   * The value must be between -999,999,999 and +999,999,999 inclusive.
   * If `units` is positive, `nanos` must be positive or zero.
   * If `units` is zero, `nanos` can be positive, zero, or negative.
   * If `units` is negative, `nanos` must be negative or zero.
   * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * </pre>
   *
   * <code>optional int32 nanos = 3;</code>
   */
  private void clearNanos() {
    
    nanos_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!currencyCode_.isEmpty()) {
      output.writeString(1, getCurrencyCode());
    }
    if (units_ != 0L) {
      output.writeInt64(2, units_);
    }
    if (nanos_ != 0) {
      output.writeInt32(3, nanos_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!currencyCode_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCurrencyCode());
    }
    if (units_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, units_);
    }
    if (nanos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nanos_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.type.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Money parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.type.Money prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Represents an amount of money with its currency type.
   * </pre>
   *
   * Protobuf type {@code google.type.Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.Money, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Money)
      com.google.type.MoneyOrBuilder {
    // Construct using com.google.type.Money.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>optional string currency_code = 1;</code>
     */
    public java.lang.String getCurrencyCode() {
      return instance.getCurrencyCode();
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>optional string currency_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      return instance.getCurrencyCodeBytes();
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>optional string currency_code = 1;</code>
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setCurrencyCode(value);
      return this;
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>optional string currency_code = 1;</code>
     */
    public Builder clearCurrencyCode() {
      copyOnWrite();
      instance.clearCurrencyCode();
      return this;
    }
    /**
     * <pre>
     * The 3-letter currency code defined in ISO 4217.
     * </pre>
     *
     * <code>optional string currency_code = 1;</code>
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCurrencyCodeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>optional int64 units = 2;</code>
     */
    public long getUnits() {
      return instance.getUnits();
    }
    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>optional int64 units = 2;</code>
     */
    public Builder setUnits(long value) {
      copyOnWrite();
      instance.setUnits(value);
      return this;
    }
    /**
     * <pre>
     * The whole units of the amount.
     * For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar.
     * </pre>
     *
     * <code>optional int64 units = 2;</code>
     */
    public Builder clearUnits() {
      copyOnWrite();
      instance.clearUnits();
      return this;
    }

    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>optional int32 nanos = 3;</code>
     */
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>optional int32 nanos = 3;</code>
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <pre>
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999 inclusive.
     * If `units` is positive, `nanos` must be positive or zero.
     * If `units` is zero, `nanos` can be positive, zero, or negative.
     * If `units` is negative, `nanos` must be negative or zero.
     * For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
     * </pre>
     *
     * <code>optional int32 nanos = 3;</code>
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.Money)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.Money();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.type.Money other = (com.google.type.Money) arg1;
        currencyCode_ = visitor.visitString(!currencyCode_.isEmpty(), currencyCode_,
            !other.currencyCode_.isEmpty(), other.currencyCode_);
        units_ = visitor.visitLong(units_ != 0L, units_,
            other.units_ != 0L, other.units_);
        nanos_ = visitor.visitInt(nanos_ != 0, nanos_,
            other.nanos_ != 0, other.nanos_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                currencyCode_ = s;
                break;
              }
              case 16: {

                units_ = input.readInt64();
                break;
              }
              case 24: {

                nanos_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.type.Money.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.type.Money)
  private static final com.google.type.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Money();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.type.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Money> PARSER;

  public static com.google.protobuf.Parser<Money> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

