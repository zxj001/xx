package org.apache.spark.sql;
public  class MyDenseVectorUDT extends org.apache.spark.sql.catalyst.types.UserDefinedType<org.apache.spark.sql.MyDenseVector> {
  public   MyDenseVectorUDT () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType sqlType () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> serialize (Object obj) { throw new RuntimeException(); }
  public  org.apache.spark.sql.MyDenseVector deserialize (Object datum) { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.sql.MyDenseVector> userClass () { throw new RuntimeException(); }
}
