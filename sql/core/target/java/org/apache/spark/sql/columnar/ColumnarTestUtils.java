package org.apache.spark.sql.columnar;
// no position
public  class ColumnarTestUtils {
  static public  org.apache.spark.sql.catalyst.expressions.GenericMutableRow makeNullRow (int length) { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.types.DataType, JvmType extends java.lang.Object> JvmType makeRandomValue (org.apache.spark.sql.columnar.ColumnType<T, JvmType> columnType) { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> makeRandomValues (org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?> head, scala.collection.Seq<org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?>> tail) { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> makeRandomValues (scala.collection.Seq<org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?>> columnTypes) { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.types.DataType, JvmType extends java.lang.Object> scala.collection.Seq<JvmType> makeUniqueRandomValues (org.apache.spark.sql.columnar.ColumnType<T, JvmType> columnType, int count) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Row makeRandomRow (org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?> head, scala.collection.Seq<org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?>> tail) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Row makeRandomRow (scala.collection.Seq<org.apache.spark.sql.columnar.ColumnType<? extends org.apache.spark.sql.catalyst.types.DataType, ?>> columnTypes) { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.types.NativeType> scala.Tuple2<scala.collection.Seq<java.lang.Object>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.GenericMutableRow>> makeUniqueValuesAndSingleValueRows (org.apache.spark.sql.columnar.NativeColumnType<T> columnType, int count) { throw new RuntimeException(); }
}
