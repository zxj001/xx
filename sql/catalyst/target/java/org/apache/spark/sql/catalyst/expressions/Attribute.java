package org.apache.spark.sql.catalyst.expressions;
public abstract class Attribute extends org.apache.spark.sql.catalyst.expressions.NamedExpression {
  public   Attribute () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet references () { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Attribute withNullability (boolean newNullability) ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Attribute withQualifiers (scala.collection.Seq<java.lang.String> newQualifiers) ;
  public abstract  org.apache.spark.sql.catalyst.expressions.Attribute withName (java.lang.String newName) ;
  public  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute () { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.Attribute newInstance () ;
}
