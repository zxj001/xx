package org.apache.spark.sql.columnar;
// no position
public  class FLOAT$ extends org.apache.spark.sql.columnar.NativeColumnType<org.apache.spark.sql.catalyst.types.FloatType$> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FLOAT$ MODULE$ = null;
  public   FLOAT$ () { throw new RuntimeException(); }
  public  void append (float v, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  void append (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  float extract (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  void extract (java.nio.ByteBuffer buffer, org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, float value) { throw new RuntimeException(); }
  public  float getField (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  void copyField (org.apache.spark.sql.catalyst.expressions.Row from, int fromOrdinal, org.apache.spark.sql.catalyst.expressions.MutableRow to, int toOrdinal) { throw new RuntimeException(); }
}
