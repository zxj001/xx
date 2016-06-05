package org.apache.spark.sql.columnar;
public abstract class BasicColumnAccessor<T extends org.apache.spark.sql.catalyst.types.DataType, JvmType extends java.lang.Object> implements org.apache.spark.sql.columnar.ColumnAccessor {
  protected  java.nio.ByteBuffer buffer () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.columnar.ColumnType<T, JvmType> columnType () { throw new RuntimeException(); }
  // not preceding
  public   BasicColumnAccessor (java.nio.ByteBuffer buffer, org.apache.spark.sql.columnar.ColumnType<T, JvmType> columnType) { throw new RuntimeException(); }
  protected  void initialize () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  void extractTo (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  public  void extractSingle (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  protected  java.nio.ByteBuffer underlyingBuffer () { throw new RuntimeException(); }
}
