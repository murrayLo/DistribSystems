package com.proto.radio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: radio.proto")
public final class RadioServiceGrpc {

  private RadioServiceGrpc() {}

  public static final String SERVICE_NAME = "radio.RadioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.radio.RadioRequest,
      com.proto.radio.RadioResponse> getRadioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Radio",
      requestType = com.proto.radio.RadioRequest.class,
      responseType = com.proto.radio.RadioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.radio.RadioRequest,
      com.proto.radio.RadioResponse> getRadioMethod() {
    io.grpc.MethodDescriptor<com.proto.radio.RadioRequest, com.proto.radio.RadioResponse> getRadioMethod;
    if ((getRadioMethod = RadioServiceGrpc.getRadioMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioMethod = RadioServiceGrpc.getRadioMethod) == null) {
          RadioServiceGrpc.getRadioMethod = getRadioMethod =
              io.grpc.MethodDescriptor.<com.proto.radio.RadioRequest, com.proto.radio.RadioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Radio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.radio.RadioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.radio.RadioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("Radio"))
              .build();
        }
      }
    }
    return getRadioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.radio.RadioStreamRequest,
      com.proto.radio.RadioStreamResponse> getRadioStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RadioStream",
      requestType = com.proto.radio.RadioStreamRequest.class,
      responseType = com.proto.radio.RadioStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.radio.RadioStreamRequest,
      com.proto.radio.RadioStreamResponse> getRadioStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.radio.RadioStreamRequest, com.proto.radio.RadioStreamResponse> getRadioStreamMethod;
    if ((getRadioStreamMethod = RadioServiceGrpc.getRadioStreamMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioStreamMethod = RadioServiceGrpc.getRadioStreamMethod) == null) {
          RadioServiceGrpc.getRadioStreamMethod = getRadioStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.radio.RadioStreamRequest, com.proto.radio.RadioStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RadioStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.radio.RadioStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.radio.RadioStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("RadioStream"))
              .build();
        }
      }
    }
    return getRadioStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RadioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RadioServiceStub>() {
        @java.lang.Override
        public RadioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RadioServiceStub(channel, callOptions);
        }
      };
    return RadioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RadioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RadioServiceBlockingStub>() {
        @java.lang.Override
        public RadioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RadioServiceBlockingStub(channel, callOptions);
        }
      };
    return RadioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RadioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RadioServiceFutureStub>() {
        @java.lang.Override
        public RadioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RadioServiceFutureStub(channel, callOptions);
        }
      };
    return RadioServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RadioServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void radio(com.proto.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<com.proto.radio.RadioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRadioMethod(), responseObserver);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public void radioStream(com.proto.radio.RadioStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.radio.RadioStreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRadioStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRadioMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.radio.RadioRequest,
                com.proto.radio.RadioResponse>(
                  this, METHODID_RADIO)))
          .addMethod(
            getRadioStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.radio.RadioStreamRequest,
                com.proto.radio.RadioStreamResponse>(
                  this, METHODID_RADIO_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class RadioServiceStub extends io.grpc.stub.AbstractAsyncStub<RadioServiceStub> {
    private RadioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RadioServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void radio(com.proto.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<com.proto.radio.RadioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRadioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public void radioStream(com.proto.radio.RadioStreamRequest request,
        io.grpc.stub.StreamObserver<com.proto.radio.RadioStreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRadioStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadioServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RadioServiceBlockingStub> {
    private RadioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RadioServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.proto.radio.RadioResponse radio(com.proto.radio.RadioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRadioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public java.util.Iterator<com.proto.radio.RadioStreamResponse> radioStream(
        com.proto.radio.RadioStreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRadioStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadioServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RadioServiceFutureStub> {
    private RadioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RadioServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.radio.RadioResponse> radio(
        com.proto.radio.RadioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRadioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RADIO = 0;
  private static final int METHODID_RADIO_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RADIO:
          serviceImpl.radio((com.proto.radio.RadioRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.radio.RadioResponse>) responseObserver);
          break;
        case METHODID_RADIO_STREAM:
          serviceImpl.radioStream((com.proto.radio.RadioStreamRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.radio.RadioStreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.radio.Radio.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadioService");
    }
  }

  private static final class RadioServiceFileDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier {
    RadioServiceFileDescriptorSupplier() {}
  }

  private static final class RadioServiceMethodDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadioServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RadioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadioServiceFileDescriptorSupplier())
              .addMethod(getRadioMethod())
              .addMethod(getRadioStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
