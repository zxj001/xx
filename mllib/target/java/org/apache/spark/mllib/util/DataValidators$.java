package org.apache.spark.mllib.util;
// no position
/**
 * :: DeveloperApi ::
 * A collection of methods used to validate data before applying ML algorithms.
 */
public  class DataValidators$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataValidators$ MODULE$ = null;
  public   DataValidators$ () { throw new RuntimeException(); }
  /**
   * Function to check if labels used for classification are either zero or one.
   * <p>
   * @return True if labels are all zero or one, false otherwise.
   */
  public  scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> binaryLabelValidator () { throw new RuntimeException(); }
}
