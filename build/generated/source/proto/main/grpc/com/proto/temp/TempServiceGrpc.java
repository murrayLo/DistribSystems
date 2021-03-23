package com.proto.temp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: temp.proto")
public final class TempServiceGrpc {

  private TempServiceGrpc() {}

  public static final String SERVICE_NAME = "temp.TempService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.temp.TempRequest,
      com.proto.temp.TempResponse> getTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Temp",
      requestType = com.proto.temp.TempRequest.class,
      responseType = com.proto.temp.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.temp.TempRequest,
      com.proto.temp.TempResponse> getTempMethod() {
    io.grpc.MethodDescriptor<com.proto.temp.TempRequest, com.proto.temp.TempResponse> getTempMethod;
    if ((getTempMethod = TempServiceGrpc.getTempMethod) == null) {
      synchronized (TempServiceGrpc.class) {
        if ((getTempMethod = TempServiceGrpc.getTempMethod) == null) {
          TempServiceGrpc.getTempMethod = getTempMethod =
              io.grpc.MethodDescriptor.<com.proto.temp.TempRequest, com.proto.temp.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Temp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.temp.TempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.temp.TempResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TempServiceMethodDescriptorSupplier("Temp"))
              .build();
        }
      }
    }
    return getTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TempServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TempServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TempServiceStub>() {
        @java.lang.Override
        public TempServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TempServiceStub(channel, callOptions);
        }
      };
    return TempServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TempServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TempServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TempServiceBlockingStub>() {
        @java.lang.Override
        public TempServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TempServiceBlockingStub(channel, callOptions);
        }
      };
    return TempServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TempServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TempServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TempServiceFutureStub>() {
        @java.lang.Override
        public TempServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TempServiceFutureStub(channel, callOptions);
        }
      };
    return TempServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TempServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary service
     * </pre>
     */
    public void temp(com.proto.temp.TempRequest request,
        io.grpc.stub.StreamObserver<com.proto.temp.TempResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTempMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTempMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.temp.TempRequest,
                com.proto.temp.TempResponse>(
                  this, METHODID_TEMP)))
          .build();
    }
  }

  /**
   */
  public static final class TempServiceStub extends io.grpc.stub.AbstractAsyncStub<TempServiceStub> {
    private TempServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TempServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary service
     * </pre>
     */
    public void temp(com.proto.temp.TempRequest request,
        io.grpc.stub.StreamObserver<com.proto.temp.TempResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTempMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TempServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TempServiceBlockingStub> {
    private TempServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TempServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary service
     * </pre>
     */
    public com.proto.temp.TempResponse temp(com.proto.temp.TempRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTempMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TempServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TempServiceFutureStub> {
    private TempServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TempServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.temp.TempResponse> temp(
        com.proto.temp.TempRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTempMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEMP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TempServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TempServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEMP:
          serviceImpl.temp((com.proto.temp.TempRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.temp.TempResponse>) responseObserver);
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

  private static abstract class TempServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TempServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.temp.Temp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TempService");
    }
  }

  private static final class TempServiceFileDescriptorSupplier
      extends TempServiceBaseDescriptorSupplier {
    TempServiceFileDescriptorSupplier() {}
  }

  private static final class TempServiceMethodDescriptorSupplier
      extends TempServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TempServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TempServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TempServiceFileDescriptorSupplier())
              .addMethod(getTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
