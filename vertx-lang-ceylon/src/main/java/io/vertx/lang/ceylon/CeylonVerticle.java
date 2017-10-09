package io.vertx.lang.ceylon;

import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Verticle;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticle extends AbstractVerticle {

  private final CeylonVerticleFactory.Module module;
  private Verticle verticle;

  public CeylonVerticle(CeylonVerticleFactory.Module module) {
    this.module = module;
  }

  // @DocAnnotation$annotation$(description = " When you add a new route with a regular expression, you can add named capture groups for parameters. <br/>\n However, if you need more complex parameters names (like \"param_name\"), you can add parameters names with\n this function. You have to name capture groups in regex with names: \"p0\", \"p1\", \"p2\", ... <br/>\n <br/>\n For example: If you declare route with regex \/(?<p0>[a-z]*)\/(?<p1>[a-z]*) and group names [\"param_a\", \"param-b\"]\n for uri /hello/world you receive inside pathParams() the parameter param_a = \"hello\"\n")
  @DocAnnotation$annotation$(description = " When you add a new route with a regular expression, you can add named capture groups for parameters. <br/>\n However, if you need more complex parameters names (like \"param_name\"), you can add parameters names with\n this function. You have to name capture groups in regex with names: \"p0\", \"p1\", \"p2\", ... <br/>\n <br/>\n For example: If you declare route with regex \\/(?<p0>[a-z]*)\\/(?<p1>[a-z]*) and group names ")
  @Override
  public void start(Future<Void> startFuture) throws Exception {
    ClassLoader loader = module.runner.getModuleClassLoader();
    Method introspector = loader.loadClass("io.vertx.ceylon.core.impl.resolveVerticles_").getDeclaredMethod("resolveVerticles", String.class, String.class);
    Map<String, Callable<?>> moduleFactories = (Map<String, Callable<?>>) introspector.invoke(null, module.name, null);

    Callable<?> factory = moduleFactories.values().iterator().next();
    verticle = (Verticle) factory.call();
    verticle.init(vertx, context);
    verticle.start(startFuture);
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {
    try {
      verticle.stop(stopFuture);
    } finally {
      module.removeInstance();
    }
  }
}
