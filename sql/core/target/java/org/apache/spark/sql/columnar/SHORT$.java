package org.apache.spark.sql.columnar;
// no position
public  class SHORT$ extends org.apache.spark.sql.columnar.NativeColumnType<org.apache.spark.sql.catalyst.types.ShortType$> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SHORT$ MODULE$ = null;
  public   SHORT$ () { throw new RuntimeException(); }
  public  void append (short v, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  void append (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  short extract (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  void extract (java.nio.ByteBuffer buffer, org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, short value) { throw new RuntimeException(); }
  public  short getField (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  void copyField (org.apache.spark.sql.catalyst.expressions.Row from, int fromOrdinal, org.apache.spark.sql.catalyst.expressions.MutableRow to, int toOrdinal) { throw new RuntimeException(); }
}
