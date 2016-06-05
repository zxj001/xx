package org.apache.spark.sql;
public  class QueryTest extends org.apache.spark.sql.catalyst.plans.PlanTest {
  public   QueryTest () { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer contains all of the keywords, or the
   * none of keywords are listed in the answer
   * @param rdd the {@link SchemaRDD} to be executed
   * @param exists true for make sure the keywords are listed in the output, otherwise
   *               to make sure none of the keyword are not listed in the output
   * @param keywords keyword in string array
   */
  public  void checkExistence (org.apache.spark.sql.SchemaRDD rdd, boolean exists, scala.collection.Seq<java.lang.String> keywords) { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer matches the expected result.
   * @param rdd the {@link SchemaRDD} to be executed
   * @param expectedAnswer the expected result, can either be an Any, Seq[Product], or Seq[ Seq[Any] ].
   */
  protected  void checkAnswer (org.apache.spark.sql.SchemaRDD rdd, Object expectedAnswer) { throw new RuntimeException(); }
  public  void sqlTest (java.lang.String sqlString, Object expectedAnswer, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  /** Asserts that a given SchemaRDD will be executed using the given number of cached results. */
  public  void assertCached (org.apache.spark.sql.SchemaRDD query, int numCachedTables) { throw new RuntimeException(); }
}
