package io.vertx.ceylon.core;

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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import java.util.function.Function;

@Ceylon(major = 8)
@Name("future")
@com.redhat.ceylon.compiler.java.metadata.Object
public class future_ implements ReifiedType {

  private static final future_ instance = new future_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(future_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::future")
  public static future_ get_() {
    return instance;
  }


  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a future that hasn't completed yet and that is passed to the <code>handler</code> before it is returned.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> future(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<T?>)") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Object>>() {
      public void handle(io.vertx.core.Future<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(event));
      }
    };
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.future(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a future that hasn't completed yet\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> future(final @Ignore TypeDescriptor $reified$T) {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.future());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a succeeded future with a null result\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> succeededFuture(final @Ignore TypeDescriptor $reified$T) {
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.succeededFuture());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Created a succeeded future with the specified result.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> succeededFuture(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("T?") @Name("result")@DocAnnotation$annotation$(description = "the result\n") T result) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(result);
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.succeededFuture(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a failed future with the specified failure cause.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> failedFuture(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::Throwable") @Name("t")@DocAnnotation$annotation$(description = "the failure cause as a Throwable\n") Throwable t) {
    java.lang.Throwable arg_0 = t;
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.failedFuture(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a failed future with the specified failure message.\n")
  @TypeInfo("io.vertx.ceylon.core::Future<T?>")
  public <T> Future<T> failedFuture(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("failureMessage")@DocAnnotation$annotation$(description = "the failure message\n") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(failureMessage);
    Future<T> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$T)).safeConvert(io.vertx.core.Future.failedFuture(arg_0));
    return ret;
  }

}
