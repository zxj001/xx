package org.apache.spark.sql.columnar;
public  class ByteColumnStats implements org.apache.spark.sql.columnar.ColumnStats {
  public   ByteColumnStats () { throw new RuntimeException(); }
  protected  byte upper () { throw new RuntimeException(); }
  protected  byte lower () { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Row collectedStatistics () { throw new RuntimeException(); }
}
