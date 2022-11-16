// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: danmaku.proto

package com.muedsa.bilibililiveapiclient.model.danmaku;

/**
 * Protobuf type {@code com.muedsa.bilibililiveapiclient.model.DmSegMobileReply}
 */
public final class DmSegMobileReply extends
        com.google.protobuf.GeneratedMessageLite<
                DmSegMobileReply, DmSegMobileReply.Builder> implements
        // @@protoc_insertion_point(message_implements:com.muedsa.bilibililiveapiclient.model.DmSegMobileReply)
        DmSegMobileReplyOrBuilder {
    private DmSegMobileReply() {
        elems_ = emptyProtobufList();
    }

    public static final int ELEMS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<DanmakuElem> elems_;

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    @Override
    public java.util.List<DanmakuElem> getElemsList() {
        return elems_;
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    public java.util.List<? extends DanmakuElemOrBuilder>
    getElemsOrBuilderList() {
        return elems_;
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    @Override
    public int getElemsCount() {
        return elems_.size();
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    @Override
    public DanmakuElem getElems(int index) {
        return elems_.get(index);
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    public DanmakuElemOrBuilder getElemsOrBuilder(
            int index) {
        return elems_.get(index);
    }

    private void ensureElemsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<DanmakuElem> tmp = elems_;
        if (!tmp.isModifiable()) {
            elems_ =
                    com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void setElems(
            int index, DanmakuElem value) {
        value.getClass();
        ensureElemsIsMutable();
        elems_.set(index, value);
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void addElems(DanmakuElem value) {
        value.getClass();
        ensureElemsIsMutable();
        elems_.add(value);
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void addElems(
            int index, DanmakuElem value) {
        value.getClass();
        ensureElemsIsMutable();
        elems_.add(index, value);
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void addAllElems(
            Iterable<? extends DanmakuElem> values) {
        ensureElemsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll(
                values, elems_);
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void clearElems() {
        elems_ = emptyProtobufList();
    }

    /**
     * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
     */
    private void removeElems(int index) {
        ensureElemsIsMutable();
        elems_.remove(index);
    }

    public static DmSegMobileReply parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static DmSegMobileReply parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static DmSegMobileReply parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static DmSegMobileReply parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static DmSegMobileReply parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static DmSegMobileReply parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static DmSegMobileReply parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static DmSegMobileReply parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static DmSegMobileReply parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static DmSegMobileReply parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static DmSegMobileReply parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static DmSegMobileReply parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DmSegMobileReply prototype) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.muedsa.bilibililiveapiclient.model.DmSegMobileReply}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    DmSegMobileReply, Builder> implements
            // @@protoc_insertion_point(builder_implements:com.muedsa.bilibililiveapiclient.model.DmSegMobileReply)
            DmSegMobileReplyOrBuilder {
        // Construct using com.muedsa.bilibililiveapiclient.model.danmaku.DmSegMobileReply.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        @Override
        public java.util.List<DanmakuElem> getElemsList() {
            return java.util.Collections.unmodifiableList(
                    instance.getElemsList());
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        @Override
        public int getElemsCount() {
            return instance.getElemsCount();
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        @Override
        public DanmakuElem getElems(int index) {
            return instance.getElems(index);
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder setElems(
                int index, DanmakuElem value) {
            copyOnWrite();
            instance.setElems(index, value);
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder setElems(
                int index, DanmakuElem.Builder builderForValue) {
            copyOnWrite();
            instance.setElems(index,
                    builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder addElems(DanmakuElem value) {
            copyOnWrite();
            instance.addElems(value);
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder addElems(
                int index, DanmakuElem value) {
            copyOnWrite();
            instance.addElems(index, value);
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder addElems(
                DanmakuElem.Builder builderForValue) {
            copyOnWrite();
            instance.addElems(builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder addElems(
                int index, DanmakuElem.Builder builderForValue) {
            copyOnWrite();
            instance.addElems(index,
                    builderForValue.build());
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder addAllElems(
                Iterable<? extends DanmakuElem> values) {
            copyOnWrite();
            instance.addAllElems(values);
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder clearElems() {
            copyOnWrite();
            instance.clearElems();
            return this;
        }

        /**
         * <code>repeated .com.muedsa.bilibililiveapiclient.model.DanmakuElem elems = 1;</code>
         */
        public Builder removeElems(int index) {
            copyOnWrite();
            instance.removeElems(index);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:com.muedsa.bilibililiveapiclient.model.DmSegMobileReply)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new DmSegMobileReply();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{
                        "elems_",
                        DanmakuElem.class,
                };
                String info =
                        "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<DmSegMobileReply> parser = PARSER;
                if (parser == null) {
                    synchronized (DmSegMobileReply.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<DmSegMobileReply>(
                                            DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            }
            case GET_MEMOIZED_IS_INITIALIZED: {
                return (byte) 1;
            }
            case SET_MEMOIZED_IS_INITIALIZED: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.muedsa.bilibililiveapiclient.model.DmSegMobileReply)
    private static final DmSegMobileReply DEFAULT_INSTANCE;

    static {
        DmSegMobileReply defaultInstance = new DmSegMobileReply();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                DmSegMobileReply.class, defaultInstance);
    }

    public static DmSegMobileReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DmSegMobileReply> PARSER;

    public static com.google.protobuf.Parser<DmSegMobileReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

