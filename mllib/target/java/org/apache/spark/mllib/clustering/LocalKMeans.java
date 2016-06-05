package org.apache.spark.mllib.clustering;
// no position
/**
 * An utility object to run K-means locally. This is private to the ML package because it's used
 * in the initialization of KMeans but not meant to be publicly exposed.
 */
public  class LocalKMeans implements org.apache.spark.Logging {
  /**
   * Run K-means++ on the weighted point set <code>points</code>. This first does the K-means++
   * initialization procedure and then rounds of Lloyd's algorithm.
   */
  static public  org.apache.spark.mllib.clustering.VectorWithNorm[] kMeansPlusPlus (int seed, org.apache.spark.mllib.clustering.VectorWithNorm[] points, double[] weights, int k, int maxIterations) { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T pickWeighted (scala.util.Random rand, java.lang.Object data, double[] weights) { throw new RuntimeException(); }
}
