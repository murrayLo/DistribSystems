package com.proto.windows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: windows.proto")
public final class WindowServiceGrpc {

  private WindowServiceGrpc() {}

  public static final String SERVICE_NAME = "window.WindowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.windows.WindowRequest,
      com.proto.windows.WindowResponse> getWindowUnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WindowUn",
      requestType = com.proto.windows.WindowRequest.class,
      responseType = com.proto.windows.WindowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.windows.WindowRequest,
      com.proto.windows.WindowResponse> getWindowUnMethod() {
    io.grpc.MethodDescriptor<com.proto.windows.WindowRequest, com.proto.windows.WindowResponse> getWindowUnMethod;
    if ((getWindowUnMethod = WindowServiceGrpc.getWindowUnMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getWindowUnMethod = WindowServiceGrpc.getWindowUnMethod) == null) {
          WindowServiceGrpc.getWindowUnMethod = getWindowUnMethod =
              io.grpc.MethodDescriptor.<com.proto.windows.WindowRequest, com.proto.windows.WindowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WindowUn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("WindowUn"))
              .build();
        }
      }
    }
    return getWindowUnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.windows.WindowClRequest,
      com.proto.windows.WindowClResponse> getWindowClStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WindowClStream",
      requestType = com.proto.windows.WindowClRequest.class,
      responseType = com.proto.windows.WindowClResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.windows.WindowClRequest,
      com.proto.windows.WindowClResponse> getWindowClStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.windows.WindowClRequest, com.proto.windows.WindowClResponse> getWindowClStreamMethod;
    if ((getWindowClStreamMethod = WindowServiceGrpc.getWindowClStreamMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getWindowClStreamMethod = WindowServiceGrpc.getWindowClStreamMethod) == null) {
          WindowServiceGrpc.getWindowClStreamMethod = getWindowClStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.windows.WindowClRequest, com.proto.windows.WindowClResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WindowClStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowClRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowClResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("WindowClStream"))
              .build();
        }
      }
    }
    return getWindowClStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.windows.WindowSvrRequest,
      com.proto.windows.WindowSvrResponse> getWindowSvrStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WindowSvrStream",
      requestType = com.proto.windows.WindowSvrRequest.class,
      responseType = com.proto.windows.WindowSvrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.windows.WindowSvrRequest,
      com.proto.windows.WindowSvrResponse> getWindowSvrStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.windows.WindowSvrRequest, com.proto.windows.WindowSvrResponse> getWindowSvrStreamMethod;
    if ((getWindowSvrStreamMethod = WindowServiceGrpc.getWindowSvrStreamMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getWindowSvrStreamMethod = WindowServiceGrpc.getWindowSvrStreamMethod) == null) {
          WindowServiceGrpc.getWindowSvrStreamMethod = getWindowSvrStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.windows.WindowSvrRequest, com.proto.windows.WindowSvrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WindowSvrStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowSvrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowSvrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("WindowSvrStream"))
              .build();
        }
      }
    }
    return getWindowSvrStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.windows.WindowStreamingRequest,
      com.proto.windows.WindowStreamingResponse> getWindowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Windows",
      requestType = com.proto.windows.WindowStreamingRequest.class,
      responseType = com.proto.windows.WindowStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.windows.WindowStreamingRequest,
      com.proto.windows.WindowStreamingResponse> getWindowsMethod() {
    io.grpc.MethodDescriptor<com.proto.windows.WindowStreamingRequest, com.proto.windows.WindowStreamingResponse> getWindowsMethod;
    if ((getWindowsMethod = WindowServiceGrpc.getWindowsMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getWindowsMethod = WindowServiceGrpc.getWindowsMethod) == null) {
          WindowServiceGrpc.getWindowsMethod = getWindowsMethod =
              io.grpc.MethodDescriptor.<com.proto.windows.WindowStreamingRequest, com.proto.windows.WindowStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Windows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.windows.WindowStreamingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("Windows"))
              .build();
        }
      }
    }
    return getWindowsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WindowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub>() {
        @java.lang.Override
        public WindowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceStub(channel, callOptions);
        }
      };
    return WindowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WindowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub>() {
        @java.lang.Override
        public WindowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceBlockingStub(channel, callOptions);
        }
      };
    return WindowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WindowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub>() {
        @java.lang.Override
        public WindowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceFutureStub(channel, callOptions);
        }
      };
    return WindowServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WindowServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *UNARY
     * </pre>
     */
    public void windowUn(com.proto.windows.WindowRequest request,
        io.grpc.stub.StreamObserver<com.proto.windows.WindowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWindowUnMethod(), responseObserver);
    }

    /**
     * <pre>
     *CLIENT STREAMING
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.windows.WindowClRequest> windowClStream(
        io.grpc.stub.StreamObserver<com.proto.windows.WindowClResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWindowClStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public void windowSvrStream(com.proto.windows.WindowSvrRequest request,
        io.grpc.stub.StreamObserver<com.proto.windows.WindowSvrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWindowSvrStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *BiDi STREAMING
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.windows.WindowStreamingRequest> windows(
        io.grpc.stub.StreamObserver<com.proto.windows.WindowStreamingResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWindowsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWindowUnMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.windows.WindowRequest,
                com.proto.windows.WindowResponse>(
                  this, METHODID_WINDOW_UN)))
          .addMethod(
            getWindowClStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.windows.WindowClRequest,
                com.proto.windows.WindowClResponse>(
                  this, METHODID_WINDOW_CL_STREAM)))
          .addMethod(
            getWindowSvrStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.windows.WindowSvrRequest,
                com.proto.windows.WindowSvrResponse>(
                  this, METHODID_WINDOW_SVR_STREAM)))
          .addMethod(
            getWindowsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.windows.WindowStreamingRequest,
                com.proto.windows.WindowStreamingResponse>(
                  this, METHODID_WINDOWS)))
          .build();
    }
  }

  /**
   */
  public static final class WindowServiceStub extends io.grpc.stub.AbstractAsyncStub<WindowServiceStub> {
    private WindowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *UNARY
     * </pre>
     */
    public void windowUn(com.proto.windows.WindowRequest request,
        io.grpc.stub.StreamObserver<com.proto.windows.WindowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWindowUnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CLIENT STREAMING
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.windows.WindowClRequest> windowClStream(
        io.grpc.stub.StreamObserver<com.proto.windows.WindowClResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWindowClStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public void windowSvrStream(com.proto.windows.WindowSvrRequest request,
        io.grpc.stub.StreamObserver<com.proto.windows.WindowSvrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWindowSvrStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *BiDi STREAMING
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.windows.WindowStreamingRequest> windows(
        io.grpc.stub.StreamObserver<com.proto.windows.WindowStreamingResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getWindowsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WindowServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WindowServiceBlockingStub> {
    private WindowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *UNARY
     * </pre>
     */
    public com.proto.windows.WindowResponse windowUn(com.proto.windows.WindowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWindowUnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *SERVER STREAMING
     * </pre>
     */
    public java.util.Iterator<com.proto.windows.WindowSvrResponse> windowSvrStream(
        com.proto.windows.WindowSvrRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWindowSvrStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WindowServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WindowServiceFutureStub> {
    private WindowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *UNARY
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.windows.WindowResponse> windowUn(
        com.proto.windows.WindowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWindowUnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WINDOW_UN = 0;
  private static final int METHODID_WINDOW_SVR_STREAM = 1;
  private static final int METHODID_WINDOW_CL_STREAM = 2;
  private static final int METHODID_WINDOWS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WindowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WindowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WINDOW_UN:
          serviceImpl.windowUn((com.proto.windows.WindowRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.windows.WindowResponse>) responseObserver);
          break;
        case METHODID_WINDOW_SVR_STREAM:
          serviceImpl.windowSvrStream((com.proto.windows.WindowSvrRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.windows.WindowSvrResponse>) responseObserver);
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
        case METHODID_WINDOW_CL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.windowClStream(
              (io.grpc.stub.StreamObserver<com.proto.windows.WindowClResponse>) responseObserver);
        case METHODID_WINDOWS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.windows(
              (io.grpc.stub.StreamObserver<com.proto.windows.WindowStreamingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WindowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.windows.Windows.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WindowService");
    }
  }

  private static final class WindowServiceFileDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier {
    WindowServiceFileDescriptorSupplier() {}
  }

  private static final class WindowServiceMethodDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WindowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WindowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WindowServiceFileDescriptorSupplier())
              .addMethod(getWindowUnMethod())
              .addMethod(getWindowClStreamMethod())
              .addMethod(getWindowSvrStreamMethod())
              .addMethod(getWindowsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
