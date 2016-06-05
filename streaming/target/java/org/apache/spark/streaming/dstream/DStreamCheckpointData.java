package org.apache.spark.streaming.dstream;
public  class DStreamCheckpointData<T extends java.lang.Object> implements scala.Serializable, org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   DStreamCheckpointData (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.Object> data () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String> timeToCheckpointFile () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.Time> timeToOldestCheckpointFileTime () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fileSystem () { throw new RuntimeException(); }
  protected  scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String> currentCheckpointFiles () { throw new RuntimeException(); }
  /**
   * Updates the checkpoint data of the DStream. This gets called every time
   * the graph checkpoint is initiated. Default implementation records the
   * checkpoint files to which the generate RDDs of the DStream has been saved.
   */
  public  void update (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /**
   * Cleanup old checkpoint data. This gets called after a checkpoint of <code>time</code> has been
   * written to the checkpoint directory.
   */
  public  void cleanup (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /**
   * Restore the checkpoint data. This gets called once when the DStream graph
   * (along with its DStreams) are being restored from a graph checkpoint file.
   * Default implementation restores the RDDs from their checkpoint files.
   */
  public  void restore () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  private  void writeObject (java.io.ObjectOutputStream oos) { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream ois) { throw new RuntimeException(); }
}
