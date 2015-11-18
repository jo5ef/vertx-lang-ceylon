package io.vertx.ceylon.web.handler;

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
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("timeoutHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class timeoutHandler_ {

  private static final timeoutHandler_ instance = new timeoutHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::timeoutHandler")
  public static timeoutHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::TimeoutHandler")
  public static TimeoutHandler create() {
    TimeoutHandler ret = io.vertx.ceylon.web.handler.TimeoutHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.TimeoutHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::TimeoutHandler")
  public static TimeoutHandler create(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "todo") long timeout) {
    long arg_0 = timeout;
    TimeoutHandler ret = io.vertx.ceylon.web.handler.TimeoutHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.TimeoutHandler.create(arg_0));
    return ret;
  }

}
