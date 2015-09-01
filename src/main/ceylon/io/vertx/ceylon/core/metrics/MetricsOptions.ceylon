import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.metrics {
  MetricsOptions_=MetricsOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.metrics.MetricsOptions */
shared class MetricsOptions(
  shared Boolean? enabled = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists enabled) {
      json.put("enabled", enabled);
    }
    return json;
  }
}

shared object toCeylonMetricsOptions satisfies Converter<MetricsOptions_, MetricsOptions> {
  shared actual MetricsOptions convert(MetricsOptions_ src) {
    value json = parse(src.toJson().string);
    assert(is JsonObject json);
    Boolean? enabled = json.getBooleanOrNull("enabled");
    return MetricsOptions {
      enabled = enabled;
    };
  }
}

shared object toJavaMetricsOptions satisfies Converter<MetricsOptions, MetricsOptions_> {
  shared actual MetricsOptions_ convert(MetricsOptions src) {
    // Todo : make optimized version without json
    value json = JsonObject_(src.toJson().string);
    value ret = MetricsOptions_(json);
    return ret;
  }
}
