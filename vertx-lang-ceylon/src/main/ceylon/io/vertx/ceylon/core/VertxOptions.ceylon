import io.vertx.ceylon.core.eventbus {
  EventBusOptions,
  eventBusOptions_=eventBusOptions
}
import io.vertx.core {
  VertxOptions_=VertxOptions
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.ceylon.core.metrics {
  MetricsOptions,
  metricsOptions_=metricsOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.ceylon.core.dns {
  AddressResolverOptions,
  addressResolverOptions_=addressResolverOptions
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.VertxOptions */
" Instances of this class are used to configure [Vertx](Vertx.type.html) instances.\n"
shared class VertxOptions(
  " Sets the address resolver configuration to configure resolving DNS servers, cache TTL, etc...\n"
  shared AddressResolverOptions? addressResolverOptions = null,
  " Sets the value of blocked thread check period, in [#setBlockedThreadCheckIntervalUnit blockedThreadCheckIntervalUnit](VertxOptions.type.html).\n <p>\n The default value of [#setBlockedThreadCheckIntervalUnit blockedThreadCheckIntervalUnit](VertxOptions.type.html) is \n"
  shared Integer? blockedThreadCheckInterval = null,
  " Set the time unit of <code>blockedThreadCheckInterval</code>.\n"
  shared String? blockedThreadCheckIntervalUnit = null,
  " Set the hostname to be used for clustering.\n"
  shared String? clusterHost = null,
  " Set the value of cluster ping interval, in ms.\n"
  shared Integer? clusterPingInterval = null,
  " Set the value of cluster ping reply interval, in ms.\n"
  shared Integer? clusterPingReplyInterval = null,
  " Set the port to be used for clustering.\n"
  shared Integer? clusterPort = null,
  " Set the public facing hostname to be used for clustering.\n Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is not the same\n address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of proxying.\n If this is the case you can specify a public hostname which is different from the hostname the server listens at.\n The default value is null which means use the same as the cluster hostname.\n"
  shared String? clusterPublicHost = null,
  " See [setClusterPublicHost](VertxOptions.type.html#setClusterPublicHost) for an explanation.\n"
  shared Integer? clusterPublicPort = null,
  " Set whether or not the Vert.x instance will be clustered.\n"
  shared Boolean? clustered = null,
  " Sets the event bus configuration to configure the host, port, ssl...\n"
  shared EventBusOptions? eventBusOptions = null,
  " Set the number of event loop threads to be used by the Vert.x instance.\n"
  shared Integer? eventLoopPoolSize = null,
  " Set wether the Vert.x file resolver uses caching for classpath resources.\n"
  shared Boolean? fileResolverCachingEnabled = null,
  " Set whether HA will be enabled on the Vert.x instance.\n"
  shared Boolean? haEnabled = null,
  " Set the HA group to be used when HA is enabled.\n"
  shared String? haGroup = null,
  " Set the value of internal blocking pool size\n"
  shared Integer? internalBlockingPoolSize = null,
  " Sets the value of max event loop execute time, in [#setMaxEventLoopExecuteTimeUnit maxEventLoopExecuteTimeUnit](VertxOptions.type.html).\n <p>\n The default value of [#setMaxEventLoopExecuteTimeUnit maxEventLoopExecuteTimeUnit](VertxOptions.type.html)is \n"
  shared Integer? maxEventLoopExecuteTime = null,
  " Set the time unit of <code>maxEventLoopExecuteTime</code>.\n"
  shared String? maxEventLoopExecuteTimeUnit = null,
  " Sets the value of max worker execute time, in [#setMaxWorkerExecuteTimeUnit maxWorkerExecuteTimeUnit](VertxOptions.type.html).\n <p>\n The default value of [#setMaxWorkerExecuteTimeUnit maxWorkerExecuteTimeUnit](VertxOptions.type.html) is \n"
  shared Integer? maxWorkerExecuteTime = null,
  " Set the time unit of <code>maxWorkerExecuteTime</code>.\n"
  shared String? maxWorkerExecuteTimeUnit = null,
  " Set the metrics options\n"
  shared MetricsOptions? metricsOptions = null,
  " Set wether to prefer the native transport to the JDK transport.\n"
  shared Boolean? preferNativeTransport = null,
  " Set the quorum size to be used when HA is enabled.\n"
  shared Integer? quorumSize = null,
  " Set the threshold value above this, the blocked warning contains a stack trace. in [#setWarningExceptionTimeUnit warningExceptionTimeUnit](VertxOptions.type.html).\n The default value of [#setWarningExceptionTimeUnit warningExceptionTimeUnit](VertxOptions.type.html) is \n"
  shared Integer? warningExceptionTime = null,
  " Set the time unit of <code>warningExceptionTime</code>.\n"
  shared String? warningExceptionTimeUnit = null,
  " Set the maximum number of worker threads to be used by the Vert.x instance.\n"
  shared Integer? workerPoolSize = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists addressResolverOptions) {
      json.put("addressResolverOptions", addressResolverOptions.toJson());
    }
    if (exists blockedThreadCheckInterval) {
      json.put("blockedThreadCheckInterval", blockedThreadCheckInterval);
    }
    if (exists blockedThreadCheckIntervalUnit) {
      json.put("blockedThreadCheckIntervalUnit", blockedThreadCheckIntervalUnit);
    }
    if (exists clusterHost) {
      json.put("clusterHost", clusterHost);
    }
    if (exists clusterPingInterval) {
      json.put("clusterPingInterval", clusterPingInterval);
    }
    if (exists clusterPingReplyInterval) {
      json.put("clusterPingReplyInterval", clusterPingReplyInterval);
    }
    if (exists clusterPort) {
      json.put("clusterPort", clusterPort);
    }
    if (exists clusterPublicHost) {
      json.put("clusterPublicHost", clusterPublicHost);
    }
    if (exists clusterPublicPort) {
      json.put("clusterPublicPort", clusterPublicPort);
    }
    if (exists clustered) {
      json.put("clustered", clustered);
    }
    if (exists eventBusOptions) {
      json.put("eventBusOptions", eventBusOptions.toJson());
    }
    if (exists eventLoopPoolSize) {
      json.put("eventLoopPoolSize", eventLoopPoolSize);
    }
    if (exists fileResolverCachingEnabled) {
      json.put("fileResolverCachingEnabled", fileResolverCachingEnabled);
    }
    if (exists haEnabled) {
      json.put("haEnabled", haEnabled);
    }
    if (exists haGroup) {
      json.put("haGroup", haGroup);
    }
    if (exists internalBlockingPoolSize) {
      json.put("internalBlockingPoolSize", internalBlockingPoolSize);
    }
    if (exists maxEventLoopExecuteTime) {
      json.put("maxEventLoopExecuteTime", maxEventLoopExecuteTime);
    }
    if (exists maxEventLoopExecuteTimeUnit) {
      json.put("maxEventLoopExecuteTimeUnit", maxEventLoopExecuteTimeUnit);
    }
    if (exists maxWorkerExecuteTime) {
      json.put("maxWorkerExecuteTime", maxWorkerExecuteTime);
    }
    if (exists maxWorkerExecuteTimeUnit) {
      json.put("maxWorkerExecuteTimeUnit", maxWorkerExecuteTimeUnit);
    }
    if (exists metricsOptions) {
      json.put("metricsOptions", metricsOptions.toJson());
    }
    if (exists preferNativeTransport) {
      json.put("preferNativeTransport", preferNativeTransport);
    }
    if (exists quorumSize) {
      json.put("quorumSize", quorumSize);
    }
    if (exists warningExceptionTime) {
      json.put("warningExceptionTime", warningExceptionTime);
    }
    if (exists warningExceptionTimeUnit) {
      json.put("warningExceptionTimeUnit", warningExceptionTimeUnit);
    }
    if (exists workerPoolSize) {
      json.put("workerPoolSize", workerPoolSize);
    }
    return json;
  }
}

shared object vertxOptions {

  shared VertxOptions fromJson(JsonObject json) {
    AddressResolverOptions? addressResolverOptions = if (exists tmp = json.getObjectOrNull("addressResolverOptions")) then addressResolverOptions_.fromJson(tmp) else null;
    Integer? blockedThreadCheckInterval = json.getIntegerOrNull("blockedThreadCheckInterval");
    String? blockedThreadCheckIntervalUnit = json.getStringOrNull("blockedThreadCheckIntervalUnit");
    String? clusterHost = json.getStringOrNull("clusterHost");
    Integer? clusterPingInterval = json.getIntegerOrNull("clusterPingInterval");
    Integer? clusterPingReplyInterval = json.getIntegerOrNull("clusterPingReplyInterval");
    Integer? clusterPort = json.getIntegerOrNull("clusterPort");
    String? clusterPublicHost = json.getStringOrNull("clusterPublicHost");
    Integer? clusterPublicPort = json.getIntegerOrNull("clusterPublicPort");
    Boolean? clustered = json.getBooleanOrNull("clustered");
    EventBusOptions? eventBusOptions = if (exists tmp = json.getObjectOrNull("eventBusOptions")) then eventBusOptions_.fromJson(tmp) else null;
    Integer? eventLoopPoolSize = json.getIntegerOrNull("eventLoopPoolSize");
    Boolean? fileResolverCachingEnabled = json.getBooleanOrNull("fileResolverCachingEnabled");
    Boolean? haEnabled = json.getBooleanOrNull("haEnabled");
    String? haGroup = json.getStringOrNull("haGroup");
    Integer? internalBlockingPoolSize = json.getIntegerOrNull("internalBlockingPoolSize");
    Integer? maxEventLoopExecuteTime = json.getIntegerOrNull("maxEventLoopExecuteTime");
    String? maxEventLoopExecuteTimeUnit = json.getStringOrNull("maxEventLoopExecuteTimeUnit");
    Integer? maxWorkerExecuteTime = json.getIntegerOrNull("maxWorkerExecuteTime");
    String? maxWorkerExecuteTimeUnit = json.getStringOrNull("maxWorkerExecuteTimeUnit");
    MetricsOptions? metricsOptions = if (exists tmp = json.getObjectOrNull("metricsOptions")) then metricsOptions_.fromJson(tmp) else null;
    Boolean? preferNativeTransport = json.getBooleanOrNull("preferNativeTransport");
    Integer? quorumSize = json.getIntegerOrNull("quorumSize");
    Integer? warningExceptionTime = json.getIntegerOrNull("warningExceptionTime");
    String? warningExceptionTimeUnit = json.getStringOrNull("warningExceptionTimeUnit");
    Integer? workerPoolSize = json.getIntegerOrNull("workerPoolSize");
    return VertxOptions {
      addressResolverOptions = addressResolverOptions;
      blockedThreadCheckInterval = blockedThreadCheckInterval;
      blockedThreadCheckIntervalUnit = blockedThreadCheckIntervalUnit;
      clusterHost = clusterHost;
      clusterPingInterval = clusterPingInterval;
      clusterPingReplyInterval = clusterPingReplyInterval;
      clusterPort = clusterPort;
      clusterPublicHost = clusterPublicHost;
      clusterPublicPort = clusterPublicPort;
      clustered = clustered;
      eventBusOptions = eventBusOptions;
      eventLoopPoolSize = eventLoopPoolSize;
      fileResolverCachingEnabled = fileResolverCachingEnabled;
      haEnabled = haEnabled;
      haGroup = haGroup;
      internalBlockingPoolSize = internalBlockingPoolSize;
      maxEventLoopExecuteTime = maxEventLoopExecuteTime;
      maxEventLoopExecuteTimeUnit = maxEventLoopExecuteTimeUnit;
      maxWorkerExecuteTime = maxWorkerExecuteTime;
      maxWorkerExecuteTimeUnit = maxWorkerExecuteTimeUnit;
      metricsOptions = metricsOptions;
      preferNativeTransport = preferNativeTransport;
      quorumSize = quorumSize;
      warningExceptionTime = warningExceptionTime;
      warningExceptionTimeUnit = warningExceptionTimeUnit;
      workerPoolSize = workerPoolSize;
    };
  }

  shared object toJava extends Converter<VertxOptions, VertxOptions_>() {
    shared actual VertxOptions_ convert(VertxOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = VertxOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(VertxOptions obj) => obj.toJson();
}
