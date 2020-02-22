// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package org.mmo.message;

public final class ServerMessage {
  private ServerMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoMessage_ServerListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoMessage_ServerListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoMessage_ServerListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoMessage_ServerListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoMessage_ServerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoMessage_ServerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoMessage_ServerRegisterUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoMessage_ServerRegisterUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProtoMessage_ServerRegisterUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProtoMessage_ServerRegisterUpdateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ServerMessage.proto\022\014ProtoMessage\032\020MID" +
      "Message.proto\"C\n\021ServerListRequest\022 \n\005ms" +
      "gID\030\001 \001(\0162\021.ProtoMessage.MID\022\014\n\004type\030\002 \001" +
      "(\005\"`\n\022ServerListResponse\022 \n\005msgID\030\001 \001(\0162" +
      "\021.ProtoMessage.MID\022(\n\006server\030\002 \003(\0132\030.Pro" +
      "toMessage.ServerInfo\"\200\002\n\nServerInfo\022\n\n\002i" +
      "d\030\001 \001(\005\022\020\n\010belongID\030\002 \001(\005\022\n\n\002ip\030\003 \001(\t\022\014\n" +
      "\004type\030\004 \001(\005\022\014\n\004port\030\005 \001(\005\022\r\n\005state\030\006 \001(\005" +
      "\022\017\n\007version\030\007 \001(\t\022\017\n\007content\030\010 \001(\t\022\016\n\006on" +
      "line\030\013 \001(\005\022\024\n\014maxUserCount\030\014 \001(\005\022\020\n\010http" +
      "Port\030\r \001(\005\022\020\n\010openTime\030\016 \001(\t\022\024\n\014maintain" +
      "Time\030\017 \001(\t\022\014\n\004name\030\020 \001(\t\022\r\n\005wwwip\030\021 \001(\t\"" +
      "m\n\033ServerRegisterUpdateRequest\022 \n\005msgID\030" +
      "\001 \001(\0162\021.ProtoMessage.MID\022,\n\nserverInfo\030\002" +
      " \001(\0132\030.ProtoMessage.ServerInfo\"P\n\034Server" +
      "RegisterUpdateResponse\022 \n\005msgID\030\001 \001(\0162\021." +
      "ProtoMessage.MID\022\016\n\006status\030\002 \001(\0052\260\002\n\rSer" +
      "verService\022g\n\016ServerRegister\022).ProtoMess" +
      "age.ServerRegisterUpdateRequest\032*.ProtoM" +
      "essage.ServerRegisterUpdateResponse\022e\n\014S" +
      "erverUpdate\022).ProtoMessage.ServerRegiste" +
      "rUpdateRequest\032*.ProtoMessage.ServerRegi" +
      "sterUpdateResponse\022O\n\nServerList\022\037.Proto" +
      "Message.ServerListRequest\032 .ProtoMessage" +
      ".ServerListResponseB+\n\017org.mmo.messageB\r" +
      "ServerMessageP\001Z\007messageb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mmo.message.MIDMessage.getDescriptor(),
        });
    internal_static_ProtoMessage_ServerListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProtoMessage_ServerListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoMessage_ServerListRequest_descriptor,
        new java.lang.String[] { "MsgID", "Type", });
    internal_static_ProtoMessage_ServerListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ProtoMessage_ServerListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoMessage_ServerListResponse_descriptor,
        new java.lang.String[] { "MsgID", "Server", });
    internal_static_ProtoMessage_ServerInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ProtoMessage_ServerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoMessage_ServerInfo_descriptor,
        new java.lang.String[] { "Id", "BelongID", "Ip", "Type", "Port", "State", "Version", "Content", "Online", "MaxUserCount", "HttpPort", "OpenTime", "MaintainTime", "Name", "Wwwip", });
    internal_static_ProtoMessage_ServerRegisterUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ProtoMessage_ServerRegisterUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoMessage_ServerRegisterUpdateRequest_descriptor,
        new java.lang.String[] { "MsgID", "ServerInfo", });
    internal_static_ProtoMessage_ServerRegisterUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ProtoMessage_ServerRegisterUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProtoMessage_ServerRegisterUpdateResponse_descriptor,
        new java.lang.String[] { "MsgID", "Status", });
    org.mmo.message.MIDMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
