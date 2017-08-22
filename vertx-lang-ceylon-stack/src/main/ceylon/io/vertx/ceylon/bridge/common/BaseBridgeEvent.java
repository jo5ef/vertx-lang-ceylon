package io.vertx.ceylon.bridge.common;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.Future;
import java.util.function.Function;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents an event that occurs on the event bus bridge.\n <p>\n Please consult the documentation for a full explanation.\n")
public class BaseBridgeEvent extends Future<ceylon.language.Boolean> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.bridge.BaseBridgeEvent, BaseBridgeEvent> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.bridge.BaseBridgeEvent, BaseBridgeEvent>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.bridge.BaseBridgeEvent, BaseBridgeEvent> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.bridge.BaseBridgeEvent, BaseBridgeEvent>() {
        public BaseBridgeEvent convert(io.vertx.ext.bridge.BaseBridgeEvent src) {
          return new BaseBridgeEvent(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<BaseBridgeEvent, io.vertx.ext.bridge.BaseBridgeEvent> TO_JAVA = new io.vertx.lang.ceylon.Converter<BaseBridgeEvent, io.vertx.ext.bridge.BaseBridgeEvent>() {
    public io.vertx.ext.bridge.BaseBridgeEvent convert(BaseBridgeEvent src) {
      return src.delegate;
    }
  };

  @Ignore private Callable<?> cached_completer;
  @Ignore private io.vertx.ceylon.bridge.common.BridgeEventType cached_type;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(BaseBridgeEvent.class), io.vertx.ext.bridge.BaseBridgeEvent.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.bridge.BaseBridgeEvent delegate;

  public BaseBridgeEvent(io.vertx.ext.bridge.BaseBridgeEvent delegate) {
    super(TypeDescriptor.klass(java.lang.Boolean.class), delegate);
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("arg0") Callable<?> arg0) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_0 = arg0 == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(arg0) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.setHandler(arg_0));
    return this;
  }

  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("ceylon.language::Boolean") @Name("arg0") ceylon.language.Boolean arg0) {
    java.lang.Boolean arg_0 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(arg0);
    delegate.complete(arg_0);
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean tryComplete(
    final @TypeInfo("ceylon.language::Boolean") @Name("arg0") ceylon.language.Boolean arg0) {
    java.lang.Boolean arg_0 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(arg0);
    boolean ret = delegate.tryComplete(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public ceylon.language.Boolean result() {
    ceylon.language.Boolean ret = io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(delegate.result());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean)") @Name("handler") Callable<?> handler, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>") @Name("next") Future<U> next) {
    io.vertx.core.Handler<java.lang.Boolean> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Boolean>() {
      public void handle(java.lang.Boolean event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event));
      }
    };
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(next);
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>(ceylon.language::Boolean)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Boolean,io.vertx.core.Future<java.lang.Object>> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Boolean,io.vertx.core.Future<java.lang.Object>>() {
      public io.vertx.core.Future<java.lang.Object> apply(java.lang.Boolean arg) {
        Future<Object> ret = (Future<Object>)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(arg));
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> map(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?(ceylon.language::Boolean)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Boolean,java.lang.Object> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Boolean,java.lang.Object>() {
      public java.lang.Object apply(java.lang.Boolean arg) {
        Object ret = (Object)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.map(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)")
  public Callable<?> completer() {
    if (cached_completer != null) {
      return cached_completer;
    }
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.lang.ceylon.ToJava.Boolean, delegate.completer());
    cached_completer = ret;
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> recover(
    final @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>(ceylon.language::Throwable)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Throwable,io.vertx.core.Future<java.lang.Boolean>> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Throwable,io.vertx.core.Future<java.lang.Boolean>>() {
      public io.vertx.core.Future<java.lang.Boolean> apply(java.lang.Throwable arg) {
        Future<ceylon.language.Boolean> ret = (Future<ceylon.language.Boolean>)mapper.$call$((Object)arg);
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.recover(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> otherwise(
    final @TypeInfo("ceylon.language::Boolean(ceylon.language::Throwable)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Throwable,java.lang.Boolean> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Throwable,java.lang.Boolean>() {
      public java.lang.Boolean apply(java.lang.Throwable arg) {
        ceylon.language.Boolean ret = (ceylon.language.Boolean)mapper.$call$((Object)arg);
        return io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(ret);
      }
    };
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.otherwise(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> otherwise(
    final @TypeInfo("ceylon.language::Boolean") @Name("value") ceylon.language.Boolean value) {
    java.lang.Boolean arg_0 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(value);
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.otherwise(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> otherwiseEmpty() {
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.otherwiseEmpty());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.bridge.common::BridgeEventType")
  public io.vertx.ceylon.bridge.common.BridgeEventType type() {
    if (cached_type != null) {
      return cached_type;
    }
    io.vertx.ceylon.bridge.common.BridgeEventType ret = io.vertx.ceylon.bridge.common.bridgeEventType_.get_().getToCeylon().safeConvert(delegate.type());
    cached_type = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is\n no message involved. If the returned message is modified, [setRawMessage](BaseBridgeEvent.type.html#setRawMessage) should be called with the\n new message.\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object $getRawMessage() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.getRawMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is\n no message involved.\n")
  @TypeInfo("io.vertx.ceylon.bridge.common::BaseBridgeEvent")
  public BaseBridgeEvent setRawMessage(
    final @TypeInfo("ceylon.json::Object") @Name("message")@DocAnnotation$annotation$(description = "the raw message\n") ceylon.json.Object message) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(message);
    BaseBridgeEvent ret = io.vertx.ceylon.bridge.common.BaseBridgeEvent.TO_CEYLON.converter().safeConvert(delegate.setRawMessage(arg_0));
    return this;
  }

}
