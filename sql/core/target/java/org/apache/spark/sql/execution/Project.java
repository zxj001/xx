package org.apache.spark.sql.execution;
/**
 * :: DeveloperApi ::
 */
public  class Project extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Project (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  scala.Function0<org.apache.spark.sql.catalyst.expressions.MutableProjection> buildProjection () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> execute () { throw new RuntimeException(); }
}
