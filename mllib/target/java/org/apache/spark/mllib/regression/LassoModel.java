package org.apache.spark.mllib.regression;
/**
 * Regression model trained using Lasso.
 * <p>
 * @param weights Weights computed for every feature.
 * @param intercept Intercept computed for this model.
 */
public  class LassoModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.regression.RegressionModel, scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  public  double intercept () { throw new RuntimeException(); }
  // not preceding
  public   LassoModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept) { throw new RuntimeException(); }
}
