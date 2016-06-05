package org.apache.spark.sql.columnar.compression;
public  interface Encoder<T extends org.apache.spark.sql.catalyst.types.NativeType> {
  public  void gatherCompressibilityStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) ;
  public  int compressedSize () ;
  public  int uncompressedSize () ;
  public  double compressionRatio () ;
  public  java.nio.ByteBuffer compress (java.nio.ByteBuffer from, java.nio.ByteBuffer to) ;
}
