package org.apache.spark.sql.columnar.compression;
// no position
public  class LongDelta implements org.apache.spark.sql.columnar.compression.CompressionScheme, scala.Product, scala.Serializable {
  static public  class Encoder implements org.apache.spark.sql.columnar.compression.Encoder<org.apache.spark.sql.catalyst.types.LongType$> {
    public   Encoder () { throw new RuntimeException(); }
    protected  int _compressedSize () { throw new RuntimeException(); }
    protected  int _uncompressedSize () { throw new RuntimeException(); }
    public  int compressedSize () { throw new RuntimeException(); }
    public  int uncompressedSize () { throw new RuntimeException(); }
    private  long prevValue () { throw new RuntimeException(); }
    public  void gatherCompressibilityStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
    public  java.nio.ByteBuffer compress (java.nio.ByteBuffer from, java.nio.ByteBuffer to) { throw new RuntimeException(); }
  }
  static public  class Decoder implements org.apache.spark.sql.columnar.compression.Decoder<org.apache.spark.sql.catalyst.types.LongType$> {
    public   Decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.columnar.NativeColumnType<org.apache.spark.sql.catalyst.types.LongType$> columnType) { throw new RuntimeException(); }
    private  long prev () { throw new RuntimeException(); }
    public  boolean hasNext () { throw new RuntimeException(); }
    public  void next (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal) { throw new RuntimeException(); }
  }
  static public  int typeId () { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.types.NativeType> org.apache.spark.sql.columnar.compression.Decoder<T> decoder (java.nio.ByteBuffer buffer, org.apache.spark.sql.columnar.NativeColumnType<T> columnType) { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.catalyst.types.NativeType> org.apache.spark.sql.columnar.compression.Encoder<T> encoder (org.apache.spark.sql.columnar.NativeColumnType<T> columnType) { throw new RuntimeException(); }
  static public  boolean supports (org.apache.spark.sql.columnar.ColumnType<?, ?> columnType) { throw new RuntimeException(); }
}
