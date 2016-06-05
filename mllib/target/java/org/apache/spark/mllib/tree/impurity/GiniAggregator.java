package org.apache.spark.mllib.tree.impurity;
/**
 * Class for updating views of a vector of sufficient statistics,
 * in order to compute impurity from a sample.
 * Note: Instances of this class do not hold the data; they operate on views of the data.
 * @param numClasses  Number of classes for label.
 */
public  class GiniAggregator extends org.apache.spark.mllib.tree.impurity.ImpurityAggregator implements scala.Serializable {
  public   GiniAggregator (int numClasses) { throw new RuntimeException(); }
  /**
   * Update stats for one (node, feature, bin) with the given label.
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   */
  public  void update (double[] allStats, int offset, double label, double instanceWeight) { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for a (node, feature, bin).
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   */
  public  org.apache.spark.mllib.tree.impurity.GiniCalculator getCalculator (double[] allStats, int offset) { throw new RuntimeException(); }
}
