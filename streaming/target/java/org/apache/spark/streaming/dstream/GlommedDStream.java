package org.apache.spark.streaming.dstream;
public  class GlommedDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   GlommedDStream (org.apache.spark.streaming.dstream.DStream<T> parent, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<T>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<java.lang.Object>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
