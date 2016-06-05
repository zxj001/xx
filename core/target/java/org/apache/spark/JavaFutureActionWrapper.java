package org.apache.spark;
public  class JavaFutureActionWrapper<S extends java.lang.Object, T extends java.lang.Object> implements org.apache.spark.api.java.JavaFutureAction<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   JavaFutureActionWrapper (org.apache.spark.FutureAction<S> futureAction, scala.Function1<S, T> converter) { throw new RuntimeException(); }
  public  boolean isCancelled () { throw new RuntimeException(); }
  public  boolean isDone () { throw new RuntimeException(); }
  public  java.util.List<java.lang.Integer> jobIds () { throw new RuntimeException(); }
  private  T getImpl (scala.concurrent.duration.Duration timeout) { throw new RuntimeException(); }
  public  T get () { throw new RuntimeException(); }
  public  T get (long timeout, java.util.concurrent.TimeUnit unit) { throw new RuntimeException(); }
  public  boolean cancel (boolean mayInterruptIfRunning) { throw new RuntimeException(); }
}
