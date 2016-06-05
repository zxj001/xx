package org.apache.spark.util;
// no position
/**
 * The default uncaught exception handler for Executors terminates the whole process, to avoid
 * getting into a bad state indefinitely. Since Executors are relatively lightweight, it's better
 * to fail fast when things go wrong.
 */
public  class SparkUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler, org.apache.spark.Logging {
  static public  void uncaughtException (java.lang.Thread thread, java.lang.Throwable exception) { throw new RuntimeException(); }
  static public  void uncaughtException (java.lang.Throwable exception) { throw new RuntimeException(); }
}
