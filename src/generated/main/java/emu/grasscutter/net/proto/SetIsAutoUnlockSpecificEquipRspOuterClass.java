// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetIsAutoUnlockSpecificEquipRsp.proto

package emu.grasscutter.net.proto;

public final class SetIsAutoUnlockSpecificEquipRspOuterClass {
  private SetIsAutoUnlockSpecificEquipRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetIsAutoUnlockSpecificEquipRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetIsAutoUnlockSpecificEquipRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code SetIsAutoUnlockSpecificEquipRsp}
   */
  public static final class SetIsAutoUnlockSpecificEquipRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetIsAutoUnlockSpecificEquipRsp)
      SetIsAutoUnlockSpecificEquipRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetIsAutoUnlockSpecificEquipRsp.newBuilder() to construct.
    private SetIsAutoUnlockSpecificEquipRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetIsAutoUnlockSpecificEquipRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetIsAutoUnlockSpecificEquipRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetIsAutoUnlockSpecificEquipRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.internal_static_SetIsAutoUnlockSpecificEquipRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.class, emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code SetIsAutoUnlockSpecificEquipRsp.DNPEDMFMCLL}
     */
    public enum DNPEDMFMCLL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 638;</code>
       */
      PEPPOHPHJOJ(1, 638),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DNPEDMFMCLL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 638;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 638;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DNPEDMFMCLL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DNPEDMFMCLL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 638: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DNPEDMFMCLL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DNPEDMFMCLL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DNPEDMFMCLL>() {
              public DNPEDMFMCLL findValueByNumber(int number) {
                return DNPEDMFMCLL.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final DNPEDMFMCLL[] VALUES = getStaticValuesArray();
      private static DNPEDMFMCLL[] getStaticValuesArray() {
        return new DNPEDMFMCLL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DNPEDMFMCLL valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private DNPEDMFMCLL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetIsAutoUnlockSpecificEquipRsp.DNPEDMFMCLL)
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp other = (emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SetIsAutoUnlockSpecificEquipRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetIsAutoUnlockSpecificEquipRsp)
        emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.internal_static_SetIsAutoUnlockSpecificEquipRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.class, emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp build() {
        emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp buildPartial() {
        emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp result = new emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp(this);
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp other) {
        if (other == emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetIsAutoUnlockSpecificEquipRsp)
    }

    // @@protoc_insertion_point(class_scope:SetIsAutoUnlockSpecificEquipRsp)
    private static final emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp();
    }

    public static emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetIsAutoUnlockSpecificEquipRsp>() {
      @java.lang.Override
      public SetIsAutoUnlockSpecificEquipRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetIsAutoUnlockSpecificEquipRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetIsAutoUnlockSpecificEquipRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetIsAutoUnlockSpecificEquipRspOuterClass.SetIsAutoUnlockSpecificEquipRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetIsAutoUnlockSpecificEquipRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SetIsAutoUnlockSpecificEquipRsp.proto\"" +
      "\203\001\n\037SetIsAutoUnlockSpecificEquipRsp\022\017\n\007r" +
      "etcode\030\010 \001(\005\"O\n\013DNPEDMFMCLL\022\010\n\004NONE\020\000\022\020\n" +
      "\013PEPPOHPHJOJ\020\376\004\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBK" +
      "OLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetIsAutoUnlockSpecificEquipRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetIsAutoUnlockSpecificEquipRsp_descriptor,
        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}