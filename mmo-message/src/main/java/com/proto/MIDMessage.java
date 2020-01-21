// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MIDMessage.proto

package com.proto;

public final class MIDMessage {
  private MIDMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ProtoMessage.MID}
   */
  public enum MID
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *服务器内部消息
     * </pre>
     *
     * <code>ServerRegisterUpdateReq = 110001;</code>
     */
    ServerRegisterUpdateReq(110001),
    /**
     * <pre>
     * 服务器间请求游戏服务器列表
     * </pre>
     *
     * <code>ServerListReq = 110003;</code>
     */
    ServerListReq(110003),
    /**
     * <pre>
     * 服务器间响应游戏服务器列表
     * </pre>
     *
     * <code>ServerListRes = 110004;</code>
     */
    ServerListRes(110004),
    ;

    /**
     * <pre>
     *服务器内部消息
     * </pre>
     *
     * <code>ServerRegisterUpdateReq = 110001;</code>
     */
    public static final int ServerRegisterUpdateReq_VALUE = 110001;
    /**
     * <pre>
     * 服务器间请求游戏服务器列表
     * </pre>
     *
     * <code>ServerListReq = 110003;</code>
     */
    public static final int ServerListReq_VALUE = 110003;
    /**
     * <pre>
     * 服务器间响应游戏服务器列表
     * </pre>
     *
     * <code>ServerListRes = 110004;</code>
     */
    public static final int ServerListRes_VALUE = 110004;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static MID valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MID forNumber(int value) {
      switch (value) {
        case 110001: return ServerRegisterUpdateReq;
        case 110003: return ServerListReq;
        case 110004: return ServerListRes;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MID>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MID> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MID>() {
            public MID findValueByNumber(int number) {
              return MID.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.proto.MIDMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final MID[] VALUES = values();

    public static MID valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MID(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ProtoMessage.MID)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020MIDMessage.proto\022\014ProtoMessage*N\n\003MID\022" +
      "\035\n\027ServerRegisterUpdateReq\020\261\333\006\022\023\n\rServer" +
      "ListReq\020\263\333\006\022\023\n\rServerListRes\020\264\333\006B\013\n\tcom." +
      "proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
