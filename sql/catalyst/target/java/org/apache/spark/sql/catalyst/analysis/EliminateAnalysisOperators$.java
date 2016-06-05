package org.apache.spark.sql.catalyst.analysis;
// no position
/**
 * Removes {@link catalyst.plans.logical.Subquery Subquery} operators from the plan.  Subqueries are
 * only required to provide scoping information for attributes and can be removed once analysis is
 * complete.
 */
public  class EliminateAnalysisOperators$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EliminateAnalysisOperators$ MODULE$ = null;
  public   EliminateAnalysisOperators$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}
