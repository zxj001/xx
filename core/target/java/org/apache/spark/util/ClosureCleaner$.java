package org.apache.spark.util;
// no position
public  class ClosureCleaner$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ClosureCleaner$ MODULE$ = null;
  public   ClosureCleaner$ () { throw new RuntimeException(); }
  private  com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassReader getClassReader (java.lang.Class<?> cls) { throw new RuntimeException(); }
  private  boolean isClosure (java.lang.Class<?> cls) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.Class<?>> getOuterClasses (java.lang.Object obj) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.Object> getOuterObjects (java.lang.Object obj) { throw new RuntimeException(); }
  private  scala.collection.immutable.List<java.lang.Class<?>> getInnerClasses (java.lang.Object obj) { throw new RuntimeException(); }
  private  java.lang.Object createNullValue (java.lang.Class<?> cls) { throw new RuntimeException(); }
  public  void clean (java.lang.Object func, boolean checkSerializable) { throw new RuntimeException(); }
  private  void ensureSerializable (java.lang.Object func) { throw new RuntimeException(); }
  private  java.lang.Object instantiateClass (java.lang.Class<?> cls, java.lang.Object outer, boolean inInterpreter) { throw new RuntimeException(); }
}
