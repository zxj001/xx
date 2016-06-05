package org.apache.spark.util.random;
/** advance to first sample as part of object construction. */
public  class GapSamplingReplacementIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  public  scala.collection.Iterator<T> data () { throw new RuntimeException(); }
  // not preceding
  public   GapSamplingReplacementIterator (scala.collection.Iterator<T> data, double f, java.util.Random rng, double epsilon, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  /** implement efficient linear-sequence drop until scala includes fix for jira SI-8835. */
  private  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> iterDrop () { throw new RuntimeException(); }
  /** current sampling value, and its replication factor, as we are sampling with replacement. */
  private  T v () { throw new RuntimeException(); }
  private  int rep () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  T next () { throw new RuntimeException(); }
  /**
   * Skip elements with replication factor zero (i.e. elements that won't be sampled).
   * Samples 'k' from geometric distribution  P(k) = (1-q)(q)^k, where q = e^(-f), that is
   * q is the probabililty of Poisson(0; f)
   */
  private  void advance () { throw new RuntimeException(); }
  private  double q () { throw new RuntimeException(); }
  /**
   * Sample from Poisson distribution, conditioned such that the sampled value is >= 1.
   * This is an adaptation from the algorithm for Generating Poisson distributed random variables:
   * http://en.wikipedia.org/wiki/Poisson_distribution
   */
  private  int poissonGE1 () { throw new RuntimeException(); }
}
