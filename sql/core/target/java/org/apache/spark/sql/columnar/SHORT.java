package org.apache.spark.sql.columnar;
// no position
public  class SHORT extends org.apache.spark.sql.columnar.NativeColumnType<org.apache.spark.sql.catalyst.types.ShortType$> {
  static public  void append (short v, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  void append (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  short extract (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  void extract (java.nio.ByteBuffer buffer, org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  static public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, short value) { throw new RuntimeException(); }
  static public  short getField (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  static public  void copyField (org.apache.spark.sql.catalyst.expressions.Row from, int fromOrdinal, org.apache.spark.sql.catalyst.expressions.MutableRow to, int toOrdinal) { throw new RuntimeException(); }
}
