package org.apache.spark.streaming;
public final class DStreamGraph implements scala.Serializable, org.apache.spark.Logging {
  public   DStreamGraph () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.dstream.InputDStream<?>> inputStreams () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.dstream.DStream<?>> outputStreams () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration rememberDuration () { throw new RuntimeException(); }
  public  boolean checkpointInProgress () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time zeroTime () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time startTime () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration batchDuration () { throw new RuntimeException(); }
  public  void start (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void restart (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void setContext (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  public  void setBatchDuration (org.apache.spark.streaming.Duration duration) { throw new RuntimeException(); }
  public  void remember (org.apache.spark.streaming.Duration duration) { throw new RuntimeException(); }
  public  void addInputStream (org.apache.spark.streaming.dstream.InputDStream<?> inputStream) { throw new RuntimeException(); }
  public  void addOutputStream (org.apache.spark.streaming.dstream.DStream<?> outputStream) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.InputDStream<?>[] getInputStreams () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<?>[] getOutputStreams () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<?>[] getReceiverInputStreams () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.Job> generateJobs (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void clearMetadata (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void updateCheckpointData (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void clearCheckpointData (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public  void restoreCheckpointData () { throw new RuntimeException(); }
  public  void validate () { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
}
