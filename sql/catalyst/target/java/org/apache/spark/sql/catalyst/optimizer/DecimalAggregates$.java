package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Speeds up aggregates on fixed-precision decimals by executing them on unscaled Long values.
 * <p>
 * This uses the same rules for increasing the precision and scale of the output as
 * {@link org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion.DecimalPrecision}.
 */
public  class DecimalAggregates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecimalAggregates$ MODULE$ = null;
  public   DecimalAggregates$ () { throw new RuntimeException(); }
  /** Maximum number of decimal digits representable precisely in a Double */
  public  int MAX_DOUBLE_DIGITS () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}
