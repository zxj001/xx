package org.apache.spark.deploy.history;
public  class HistoryPage extends org.apache.spark.ui.WebUIPage {
  public   HistoryPage (org.apache.spark.deploy.history.HistoryServer parent) { throw new RuntimeException(); }
  private  int pageSize () { throw new RuntimeException(); }
  private  int plusOrMinus () { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> appHeader () { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> rangeIndices (scala.collection.Seq<java.lang.Object> range, scala.Function1<java.lang.Object, java.lang.Object> condition) { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.xml.Node> appRow (org.apache.spark.deploy.history.ApplicationHistoryInfo info) { throw new RuntimeException(); }
}
