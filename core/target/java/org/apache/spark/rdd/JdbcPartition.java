package org.apache.spark.rdd;
public  class JdbcPartition implements org.apache.spark.Partition {
  public  long lower () { throw new RuntimeException(); }
  public  long upper () { throw new RuntimeException(); }
  // not preceding
  public   JdbcPartition (int idx, long lower, long upper) { throw new RuntimeException(); }
  public  int index () { throw new RuntimeException(); }
}
