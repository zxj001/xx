package org.apache.spark.sql.catalyst.util;
/**
 * Metadata is a wrapper over Map[String, Any] that limits the value type to simple ones: Boolean,
 * Long, Double, String, Metadata, Array[Boolean], Array[Long], Array[Double], Array[String], and
 * Array[Metadata]. JSON is used for serialization.
 * <p>
 * The default constructor is private. User should use either {@link MetadataBuilder} or
 * {@link Metadata$#fromJson} to create Metadata instances.
 * <p>
 * @param map an immutable map that stores the data
 */
public  class Metadata implements scala.Serializable {
  /** Returns an empty Metadata. */
  static public  org.apache.spark.sql.catalyst.util.Metadata empty () { throw new RuntimeException(); }
  /** Creates a Metadata instance from JSON. */
  static public  org.apache.spark.sql.catalyst.util.Metadata fromJson (java.lang.String json) { throw new RuntimeException(); }
  /** Creates a Metadata instance from JSON AST. */
  static public  org.apache.spark.sql.catalyst.util.Metadata fromJObject (org.json4s.JsonAST.JObject jObj) { throw new RuntimeException(); }
  /** Converts to JSON AST. */
  static private  org.json4s.JsonAST.JValue toJsonValue (Object obj) { throw new RuntimeException(); }
  /** Computes the hash code for the types we support. */
  static private  int hash (Object obj) { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> map () { throw new RuntimeException(); }
  // not preceding
  public   Metadata (scala.collection.immutable.Map<java.lang.String, java.lang.Object> map) { throw new RuntimeException(); }
  /** Tests whether this Metadata contains a binding for a key. */
  public  boolean contains (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Long. */
  public  long getLong (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Double. */
  public  double getDouble (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Boolean. */
  public  boolean getBoolean (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a String. */
  public  java.lang.String getString (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Metadata. */
  public  org.apache.spark.sql.catalyst.util.Metadata getMetadata (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Long array. */
  public  long[] getLongArray (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Double array. */
  public  double[] getDoubleArray (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Boolean array. */
  public  boolean[] getBooleanArray (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a String array. */
  public  java.lang.String[] getStringArray (java.lang.String key) { throw new RuntimeException(); }
  /** Gets a Metadata array. */
  public  org.apache.spark.sql.catalyst.util.Metadata[] getMetadataArray (java.lang.String key) { throw new RuntimeException(); }
  /** Converts to its JSON representation. */
  public  java.lang.String json () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  boolean equals (Object obj) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  private <T extends java.lang.Object> T get (java.lang.String key) { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue jsonValue () { throw new RuntimeException(); }
}
