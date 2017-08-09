package io.vertx.ceylon.auth.jwt;

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
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@Name("jwtAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jwtAuth_ implements ReifiedType {

  private static final jwtAuth_ instance = new jwtAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jwtAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.jwt::jwtAuth")
  public static jwtAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a JWT auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.jwt::JWTAuth")
  public JWTAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the Vertx instance\n") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.auth.jwt::JWTAuthOptions") @Name("config")@DocAnnotation$annotation$(description = "the config\n") io.vertx.ceylon.auth.jwt.JWTAuthOptions config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.jwt.JWTAuthOptions arg_1 = config == null ? null : new io.vertx.ext.auth.jwt.JWTAuthOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(config.toJson()));
    JWTAuth ret = io.vertx.ceylon.auth.jwt.JWTAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.jwt.JWTAuth.create(arg_0, arg_1));
    return ret;
  }

}
