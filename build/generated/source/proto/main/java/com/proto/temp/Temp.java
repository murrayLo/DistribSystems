// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temp.proto

package com.proto.temp;

public final class Temp {
  private Temp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temp_Temperature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temp_Temperature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temp_TempRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temp_TempRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temp_TempResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temp_TempResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntemp.proto\022\004temp\"\"\n\013Temperature\022\023\n\013cur" +
      "rentTemp\030\001 \001(\t\"5\n\013TempRequest\022&\n\013tempera" +
      "ture\030\001 \001(\0132\021.temp.Temperature\"\036\n\014TempRes" +
      "ponse\022\016\n\006result\030\001 \001(\t2>\n\013TempService\022/\n\004" +
      "Temp\022\021.temp.TempRequest\032\022.temp.TempRespo" +
      "nse\"\000B\022\n\016com.proto.tempP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_temp_Temperature_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_temp_Temperature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temp_Temperature_descriptor,
        new java.lang.String[] { "CurrentTemp", });
    internal_static_temp_TempRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_temp_TempRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temp_TempRequest_descriptor,
        new java.lang.String[] { "Temperature", });
    internal_static_temp_TempResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_temp_TempResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temp_TempResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
