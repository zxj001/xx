package org.apache.spark.tools;
// no position
/**
 * A tool for generating classes to be excluded during binary checking with MIMA. It is expected
 * that this tool is run with ./spark-class.
 * <p>
 * MIMA itself only supports JVM-level visibility and doesn't account for package-private classes.
 * This tool looks at all currently package-private classes and generates exclusions for them. Note
 * that this approach is not sound. It can lead to false positives if we move or rename a previously
 * package-private class. It can lead to false negatives if someone explicitly makes a class
 * package-private that wasn't before. This exists only to help catch certain classes of changes
 * which might be difficult to catch during review.
 */
public  class GenerateMIMAIgnore {
  static private  java.lang.ClassLoader classLoader () { throw new RuntimeException(); }
  static private  scala.reflect.runtime.universe mirror () { throw new RuntimeException(); }
  static private  boolean isDeveloperApi (scala.reflect.runtime.universe sym) { throw new RuntimeException(); }
  static private  boolean isExperimental (scala.reflect.runtime.universe sym) { throw new RuntimeException(); }
  static private  boolean isPackagePrivate (scala.reflect.runtime.universe sym) { throw new RuntimeException(); }
  static private  boolean isPackagePrivateModule (scala.reflect.runtime.universe moduleSymbol) { throw new RuntimeException(); }
  /**
   * For every class checks via scala reflection if the class itself or contained members
   * have DeveloperApi or Experimental annotations or they are package private.
   * Returns the tuple of such classes and members.
   */
  static private  scala.Tuple2<scala.collection.immutable.Set<java.lang.String>, scala.collection.immutable.Set<java.lang.String>> privateWithin (java.lang.String packageName) { throw new RuntimeException(); }
  /** Scala reflection does not let us see inner function even if they are upgraded
   * to public for some reason. So had to resort to java reflection to get all inner
   * functions with $$ in there name.
   */
  static public  scala.collection.Seq<java.lang.String> getInnerFunctions (scala.reflect.runtime.universe classSymbol) { throw new RuntimeException(); }
  static private  scala.collection.Iterable<java.lang.String> getAnnotatedOrPackagePrivateMembers (scala.reflect.runtime.universe classSymbol) { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  static private  boolean shouldExclude (java.lang.String name) { throw new RuntimeException(); }
  /**
   * Scans all classes accessible from the context class loader which belong to the given package
   * and subpackages both from directories and jars present on the classpath.
   */
  static private  scala.collection.immutable.Set<java.lang.String> getClasses (java.lang.String packageName) { throw new RuntimeException(); }
  /**
   * Get all classes in a package from a jar file.
   */
  static private  scala.collection.mutable.HashSet<java.lang.Class<?>> getClassesFromJar (java.lang.String jarPath, java.lang.String packageName) { throw new RuntimeException(); }
}
