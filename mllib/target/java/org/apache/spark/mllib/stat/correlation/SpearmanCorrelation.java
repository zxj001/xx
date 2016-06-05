package org.apache.spark.mllib.stat.correlation;
// no position
/**
 * Compute Spearman's correlation for two RDDs of the type RDD[Double] or the correlation matrix
 * for an RDD of the type RDD[Vector].
 * <p>
 * Definition of Spearman's correlation can be found at
 * http://en.wikipedia.org/wiki/Spearman's_rank_correlation_coefficient
 */
public  class SpearmanCorrelation implements org.apache.spark.mllib.stat.correlation.Correlation, org.apache.spark.Logging {
  /**
   * Compute Spearman's correlation for two datasets.
   */
  static public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y) { throw new RuntimeException(); }
  /**
   * Compute Spearman's correlation matrix S, for the input matrix, where S(i, j) is the
   * correlation between column i and j.
   */
  static public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X) { throw new RuntimeException(); }
}
