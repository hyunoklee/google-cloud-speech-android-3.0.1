// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface ListMonitoredResourceDescriptorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  java.util.List<com.google.api.MonitoredResourceDescriptor> 
      getResourceDescriptorsList();
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index);
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  int getResourceDescriptorsCount();

  /**
   * <pre>
   * If there are more results than were returned, then `nextPageToken` is
   * returned in the response.  To get the next batch of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If there are more results than were returned, then `nextPageToken` is
   * returned in the response.  To get the next batch of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>optional string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
