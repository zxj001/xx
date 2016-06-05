package org.apache.spark.scheduler.cluster;
// no position
public  class CoarseGrainedClusterMessages {
  // no position
  static public  class RetrieveSparkProps$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RetrieveSparkProps$ MODULE$ = null;
    public   RetrieveSparkProps$ () { throw new RuntimeException(); }
  }
  static public  class LaunchTask implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  org.apache.spark.util.SerializableBuffer data () { throw new RuntimeException(); }
    // not preceding
    public   LaunchTask (org.apache.spark.util.SerializableBuffer data) { throw new RuntimeException(); }
  }
  // no position
  // not preceding
  static public  class LaunchTask$ extends scala.runtime.AbstractFunction1<org.apache.spark.util.SerializableBuffer, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.LaunchTask> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LaunchTask$ MODULE$ = null;
    public   LaunchTask$ () { throw new RuntimeException(); }
  }
  static public  class KillTask implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  long taskId () { throw new RuntimeException(); }
    public  java.lang.String executor () { throw new RuntimeException(); }
    public  boolean interruptThread () { throw new RuntimeException(); }
    // not preceding
    public   KillTask (long taskId, java.lang.String executor, boolean interruptThread) { throw new RuntimeException(); }
  }
  // no position
  // not preceding
  static public  class KillTask$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.String, java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.KillTask> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KillTask$ MODULE$ = null;
    public   KillTask$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class RegisteredExecutor$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisteredExecutor$ MODULE$ = null;
    public   RegisteredExecutor$ () { throw new RuntimeException(); }
  }
  static public  class RegisterExecutorFailed implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String message () { throw new RuntimeException(); }
    // not preceding
    public   RegisterExecutorFailed (java.lang.String message) { throw new RuntimeException(); }
  }
  // no position
  static public  class RegisterExecutorFailed$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RegisterExecutorFailed> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterExecutorFailed$ MODULE$ = null;
    public   RegisterExecutorFailed$ () { throw new RuntimeException(); }
  }
  static public  class RegisterExecutor implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId () { throw new RuntimeException(); }
    public  java.lang.String hostPort () { throw new RuntimeException(); }
    public  int cores () { throw new RuntimeException(); }
    // not preceding
    public   RegisterExecutor (java.lang.String executorId, java.lang.String hostPort, int cores) { throw new RuntimeException(); }
  }
  // no position
  static public  class RegisterExecutor$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RegisterExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterExecutor$ MODULE$ = null;
    public   RegisterExecutor$ () { throw new RuntimeException(); }
  }
  static public  class StatusUpdate implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId () { throw new RuntimeException(); }
    public  long taskId () { throw new RuntimeException(); }
    public  scala.Enumeration.Value state () { throw new RuntimeException(); }
    public  org.apache.spark.util.SerializableBuffer data () { throw new RuntimeException(); }
    // not preceding
    public   StatusUpdate (java.lang.String executorId, long taskId, scala.Enumeration.Value state, org.apache.spark.util.SerializableBuffer data) { throw new RuntimeException(); }
  }
  // no position
  static public  class StatusUpdate$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StatusUpdate$ MODULE$ = null;
    public   StatusUpdate$ () { throw new RuntimeException(); }
    /** Alternate factory method that takes a ByteBuffer directly for the data field */
    public  org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.StatusUpdate apply (java.lang.String executorId, long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data) { throw new RuntimeException(); }
  }
  // no position
  /** Alternate factory method that takes a ByteBuffer directly for the data field */
  static public  class ReviveOffers$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReviveOffers$ MODULE$ = null;
    public   ReviveOffers$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class StopDriver$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopDriver$ MODULE$ = null;
    public   StopDriver$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class StopExecutor$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopExecutor$ MODULE$ = null;
    public   StopExecutor$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class StopExecutors$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopExecutors$ MODULE$ = null;
    public   StopExecutors$ () { throw new RuntimeException(); }
  }
  static public  class RemoveExecutor implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String executorId () { throw new RuntimeException(); }
    public  java.lang.String reason () { throw new RuntimeException(); }
    // not preceding
    public   RemoveExecutor (java.lang.String executorId, java.lang.String reason) { throw new RuntimeException(); }
  }
  // no position
  static public  class RemoveExecutor$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RemoveExecutor> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RemoveExecutor$ MODULE$ = null;
    public   RemoveExecutor$ () { throw new RuntimeException(); }
  }
  static public  class AddWebUIFilter implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  java.lang.String filterName () { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams () { throw new RuntimeException(); }
    public  java.lang.String proxyBase () { throw new RuntimeException(); }
    // not preceding
    public   AddWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase) { throw new RuntimeException(); }
  }
  // no position
  static public  class AddWebUIFilter$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.AddWebUIFilter> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddWebUIFilter$ MODULE$ = null;
    public   AddWebUIFilter$ () { throw new RuntimeException(); }
  }
  // no position
  static public  class RegisterClusterManager$ implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegisterClusterManager$ MODULE$ = null;
    public   RegisterClusterManager$ () { throw new RuntimeException(); }
  }
  static public  class RequestExecutors implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  int requestedTotal () { throw new RuntimeException(); }
    // not preceding
    public   RequestExecutors (int requestedTotal) { throw new RuntimeException(); }
  }
  // no position
  static public  class RequestExecutors$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.RequestExecutors> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RequestExecutors$ MODULE$ = null;
    public   RequestExecutors$ () { throw new RuntimeException(); }
  }
  static public  class KillExecutors implements org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessage, scala.Product, scala.Serializable {
    public  scala.collection.Seq<java.lang.String> executorIds () { throw new RuntimeException(); }
    // not preceding
    public   KillExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
  }
  // no position
  static public  class KillExecutors$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<java.lang.String>, org.apache.spark.scheduler.cluster.CoarseGrainedClusterMessages.KillExecutors> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KillExecutors$ MODULE$ = null;
    public   KillExecutors$ () { throw new RuntimeException(); }
  }
}
