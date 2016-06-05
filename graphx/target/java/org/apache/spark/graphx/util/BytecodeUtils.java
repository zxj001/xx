package org.apache.spark.graphx.util;
// no position
/**
 * Includes an utility function to test whether a function accesses a specific attribute
 * of an object.
 */
public  class BytecodeUtils {
  /**
   * Find the set of methods invoked by the specified method in the specified class.
   * For example, after running the visitor,
   *   MethodInvocationFinder("spark/graph/Foo", "test")
   * its methodsInvoked variable will contain the set of methods invoked directly by
   * Foo.test(). Interface invocations are not returned as part of the result set because we cannot
   * determine the actual metod invoked by inspecting the bytecode.
   */
  static private  class MethodInvocationFinder extends com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassVisitor {
    public   MethodInvocationFinder (java.lang.String className, java.lang.String methodName) { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<scala.Tuple2<java.lang.Class<?>, java.lang.String>> methodsInvoked () { throw new RuntimeException(); }
    public  com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.MethodVisitor visitMethod (int access, java.lang.String name, java.lang.String desc, java.lang.String sig, java.lang.String[] exceptions) { throw new RuntimeException(); }
  }
  /**
   * Test whether the given closure invokes the specified method in the specified class.
   */
  static public  boolean invokedMethod (java.lang.Object closure, java.lang.Class<?> targetClass, java.lang.String targetMethod) { throw new RuntimeException(); }
  static private  boolean _invokedMethod (java.lang.Class<?> cls, java.lang.String method, java.lang.Class<?> targetClass, java.lang.String targetMethod) { throw new RuntimeException(); }
  /**
   * Get an ASM class reader for a given class from the JAR that loaded it.
   */
  static private  com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassReader getClassReader (java.lang.Class<?> cls) { throw new RuntimeException(); }
  /**
   * Given the class name, return whether we should look into the class or not. This is used to
   * skip examing a large quantity of Java or Scala classes that we know for sure wouldn't access
   * the closures. Note that the class name is expected in ASM style (i.e. use "/" instead of ".").
   */
  static private  boolean skipClass (java.lang.String className) { throw new RuntimeException(); }
}
