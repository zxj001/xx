package org.apache.spark.streaming.receiver;
/**
 * Abstract class that is responsible for supervising a Receiver in the worker.
 * It provides all the necessary interfaces for handling the data received by the receiver.
 */
public abstract class ReceiverSupervisor implements org.apache.spark.Logging {
  public   ReceiverSupervisor (org.apache.spark.streaming.receiver.Receiver<?> receiver, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  // no position
  public  class ReceiverState extends scala.Enumeration {
    /** Enumeration to identify current state of the StreamingContext */
    public   ReceiverState () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Initialized () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Started () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopped () { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.streaming.receiver.ReceiverSupervisor.ReceiverState$ ReceiverState () { throw new RuntimeException(); }
  /** Receiver id */
  protected  int streamId () { throw new RuntimeException(); }
  /** Has the receiver been marked for stop. */
  private  java.util.concurrent.CountDownLatch stopLatch () { throw new RuntimeException(); }
  /** Time between a receiver is stopped and started again */
  private  int defaultRestartDelay () { throw new RuntimeException(); }
  /** Exception associated with the stopping of the receiver */
  protected  java.lang.Throwable stoppingError () { throw new RuntimeException(); }
  /** State of the receiver */
  public  scala.Enumeration.Value receiverState () { throw new RuntimeException(); }
  /** Push a single data item to backend data store. */
  public abstract  void pushSingle (Object data) ;
  /** Store the bytes of received data as a data block into Spark's memory. */
  public abstract  void pushBytes (java.nio.ByteBuffer bytes, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId) ;
  /** Store a iterator of received data as a data block into Spark's memory. */
  public abstract  void pushIterator (scala.collection.Iterator<java.lang.Object> iterator, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId) ;
  /** Store an ArrayBuffer of received data as a data block into Spark's memory. */
  public abstract  void pushArrayBuffer (scala.collection.mutable.ArrayBuffer<?> arrayBuffer, scala.Option<java.lang.Object> optionalMetadata, scala.Option<org.apache.spark.storage.StreamBlockId> optionalBlockId) ;
  /** Report errors. */
  public abstract  void reportError (java.lang.String message, java.lang.Throwable throwable) ;
  /** Called when supervisor is started */
  protected  void onStart () { throw new RuntimeException(); }
  /** Called when supervisor is stopped */
  protected  void onStop (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Called when receiver is started */
  protected  void onReceiverStart () { throw new RuntimeException(); }
  /** Called when receiver is stopped */
  protected  void onReceiverStop (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Start the supervisor */
  public  void start () { throw new RuntimeException(); }
  /** Mark the supervisor and the receiver for stopping */
  public  void stop (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Start receiver */
  public  void startReceiver () { throw new RuntimeException(); }
  /** Stop receiver */
  public  void stopReceiver (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Restart receiver with delay */
  public  void restartReceiver (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Restart receiver with delay */
  public  void restartReceiver (java.lang.String message, scala.Option<java.lang.Throwable> error, int delay) { throw new RuntimeException(); }
  /** Check if receiver has been marked for stopping */
  public  boolean isReceiverStarted () { throw new RuntimeException(); }
  /** Check if receiver has been marked for stopping */
  public  boolean isReceiverStopped () { throw new RuntimeException(); }
  /** Wait the thread until the supervisor is stopped */
  public  void awaitTermination () { throw new RuntimeException(); }
}
