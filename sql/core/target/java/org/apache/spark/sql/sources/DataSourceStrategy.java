package org.apache.spark.sql.sources;
// no position
/**
 * A Strategy for planning scans over data sources defined using the sources API.
 */
public  class DataSourceStrategy extends org.apache.spark.sql.catalyst.planning.GenericStrategy<org.apache.spark.sql.execution.SparkPlan> {
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan pruneFilterProject (org.apache.spark.sql.sources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function2<java.lang.String[], org.apache.spark.sql.sources.Filter[], org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row>> scanBuilder) { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.execution.SparkPlan pruneFilterProjectRaw (org.apache.spark.sql.sources.LogicalRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filterPredicates, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row>> scanBuilder) { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.sources.Filter> selectFilters (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters) { throw new RuntimeException(); }
}
