package org.apache.spark.metrics;
/**
 * Spark Metrics System, created by specific "instance", combined by source,
 * sink, periodically poll source metrics data to sink destinations.
 * <p>
 * "instance" specify "who" (the role) use metrics system. In spark there are several roles
 * like master, worker, executor, client driver, these roles will create metrics system
 * for monitoring. So instance represents these roles. Currently in Spark, several instances
 * have already implemented: master, worker, executor, driver, applications.
 * <p>
 * "source" specify "where" (source) to collect metrics data. In metrics system, there exists
 * two kinds of source:
 *   1. Spark internal source, like MasterSource, WorkerSource, etc, which will collect
 *   Spark component's internal state, these sources are related to instance and will be
 *   added after specific metrics system is created.
 *   2. Common source, like JvmSource, which will collect low level state, is configured by
 *   configuration and loaded through reflection.
 * <p>
 * "sink" specify "where" (destination) to output metrics data to. Several sinks can be
 * coexisted and flush metrics to all these sinks.
 * <p>
 * Metrics configuration format is like below:
 * [instance].[sink|source].[name].[options] = xxxx
 * <p>
 * [instance] can be "master", "worker", "executor", "driver", "applications" which means only
 * the specified instance has this property.
 * wild card "*" can be used to replace instance name, which means all the instances will have
 * this property.
 * <p>
 * [sink|source] means this property belongs to source or sink. This field can only be
 * source or sink.
 * <p>
 * [name] specify the name of sink or source, it is custom defined.
 * <p>
 * [options] is the specific property of this source or sink.
 */
public  class MetricsSystem implements org.apache.spark.Logging {
  static public  scala.util.matching.Regex SINK_REGEX () { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SOURCE_REGEX () { throw new RuntimeException(); }
  static public  void checkMinimalPollingPeriod (java.util.concurrent.TimeUnit pollUnit, int pollPeriod) { throw new RuntimeException(); }
  static public  org.apache.spark.metrics.MetricsSystem createMetricsSystem (java.lang.String instance, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  public  java.lang.String instance () { throw new RuntimeException(); }
  // not preceding
  private   MetricsSystem (java.lang.String instance, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.metrics.sink.Sink> sinks () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.metrics.source.Source> sources () { throw new RuntimeException(); }
  private  com.codahale.metrics.MetricRegistry registry () { throw new RuntimeException(); }
  private  boolean running () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.metrics.sink.MetricsServlet> metricsServlet () { throw new RuntimeException(); }
  /**
   * Get any UI handlers used by this metrics system; can only be called after start().
   */
  public  org.eclipse.jetty.servlet.ServletContextHandler[] getServletHandlers () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void report () { throw new RuntimeException(); }
  /**
   * Build a name that uniquely identifies each metric source.
   * The name is structured as follows: <app ID>.<executor ID (or "driver")>.<source name>.
   * If either ID is not available, this defaults to just using <source name>.
   * <p>
   * @param source Metric source to be named by this method.
   * @return An unique metric name for each combination of
   *         application, executor/driver and metric source.
   */
  public  java.lang.String buildRegistryName (org.apache.spark.metrics.source.Source source) { throw new RuntimeException(); }
  public  void registerSource (org.apache.spark.metrics.source.Source source) { throw new RuntimeException(); }
  public  void removeSource (org.apache.spark.metrics.source.Source source) { throw new RuntimeException(); }
  private  void registerSources () { throw new RuntimeException(); }
  private  void registerSinks () { throw new RuntimeException(); }
}
