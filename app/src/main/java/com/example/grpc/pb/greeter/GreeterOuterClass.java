// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeter/greeter.proto

package com.example.grpc.pb.greeter;

public final class GreeterOuterClass {
  private GreeterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HelloReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataStruct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DataStruct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025greeter/greeter.proto\"7\n\014HelloRequest\022" +
      "\014\n\004name\030\001 \001(\t\022\031\n\004data\030\002 \003(\0132\013.DataStruct" +
      "\"8\n\nHelloReply\022\017\n\007message\030\001 \001(\t\022\031\n\004data\030" +
      "\002 \003(\0132\013.DataStruct\"\035\n\nDataStruct\022\017\n\007mess" +
      "age\030\001 \003(\t23\n\007Greeter\022(\n\010SayHello\022\r.Hello" +
      "Request\032\013.HelloReply\"\000B*\n\033com.example.gr" +
      "pc.pb.greeterP\001Z\t./greeterb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Data", });
    internal_static_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HelloReply_descriptor,
        new java.lang.String[] { "Message", "Data", });
    internal_static_DataStruct_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_DataStruct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DataStruct_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
