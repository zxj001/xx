package org.apache.spark.sql.columnar;
public  class PartitionBatchPruningSuite extends org.scalatest.FunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfter {
  public   PartitionBatchPruningSuite () { throw new RuntimeException(); }
  public  int originalColumnBatchSize () { throw new RuntimeException(); }
  public  boolean originalInMemoryPartitionPruning () { throw new RuntimeException(); }
  protected  void beforeAll () { throw new RuntimeException(); }
  protected  void afterAll () { throw new RuntimeException(); }
  public  void checkBatchPruning (java.lang.String query, int expectedReadPartitions, int expectedReadBatches, scala.Function0<scala.collection.Seq<java.lang.Object>> expectedQueryResult) { throw new RuntimeException(); }
}
