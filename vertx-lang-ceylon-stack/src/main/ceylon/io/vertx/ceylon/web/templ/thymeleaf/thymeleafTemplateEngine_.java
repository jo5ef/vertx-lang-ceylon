package io.vertx.ceylon.web.templ.thymeleaf;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.web.templ.TemplateEngine;
import org.thymeleaf.templatemode.TemplateMode;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("thymeleafTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class thymeleafTemplateEngine_ implements ReifiedType {

  private static final thymeleafTemplateEngine_ instance = new thymeleafTemplateEngine_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(thymeleafTemplateEngine_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ.thymeleaf::thymeleafTemplateEngine")
  public static thymeleafTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a template engine using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.templ.thymeleaf::ThymeleafTemplateEngine")
  public ThymeleafTemplateEngine create() {
    ThymeleafTemplateEngine ret = io.vertx.ceylon.web.templ.thymeleaf.ThymeleafTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.thymeleaf.ThymeleafTemplateEngine.create());
    return ret;
  }

}
