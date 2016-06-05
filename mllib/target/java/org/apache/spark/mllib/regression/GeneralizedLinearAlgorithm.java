package org.apache.spark.mllib.regression;
/**
 * :: DeveloperApi ::
 * GeneralizedLinearAlgorithm implements methods to train a Generalized Linear Model (GLM).
 * This class should be extended with an Optimizer to create a new GLM.
 */
public abstract class GeneralizedLinearAlgorithm<M extends org.apache.spark.mllib.regression.GeneralizedLinearModel> implements org.apache.spark.Logging, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Ident(org.apache.spark.mllib.regression.GeneralizedLinearModel))))
  public   GeneralizedLinearAlgorithm () { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators () { throw new RuntimeException(); }
  /** The optimizer to solve the problem. */
  public abstract  org.apache.spark.mllib.optimization.Optimizer optimizer () ;
  /** Whether to add intercept (default: false). */
  protected  boolean addIntercept () { throw new RuntimeException(); }
  protected  boolean validateData () { throw new RuntimeException(); }
  /**
   * Whether to perform feature scaling before model training to reduce the condition numbers
   * which can significantly help the optimizer converging faster. The scaling correction will be
   * translated back to resulting model weights, so it's transparent to users.
   * Note: This technique is used in both libsvm and glmnet packages. Default false.
   */
  private  boolean useFeatureScaling () { throw new RuntimeException(); }
  /**
   * Set if the algorithm should use feature scaling to improve the convergence during optimization.
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setFeatureScaling (boolean useFeatureScaling) { throw new RuntimeException(); }
  /**
   * Create a model given the weights and intercept
   */
  protected abstract  M createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) ;
  /**
   * Set if the algorithm should add an intercept. Default false.
   * We set the default to false because adding the intercept will cause memory allocation.
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setIntercept (boolean addIntercept) { throw new RuntimeException(); }
  /**
   * Set if the algorithm should validate data before training. Default true.
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setValidateData (boolean validateData) { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input
   * RDD of LabeledPoint entries.
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input RDD
   * of LabeledPoint entries starting from the initial weights provided.
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
}
