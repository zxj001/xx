package org.apache.spark.sql.catalyst;
/**
 * The top level Spark SQL parser. This parser recognizes syntaxes that are available for all SQL
 * dialects supported by Spark SQL, and delegates all the other syntaxes to the <code>fallback</code> parser.
 * <p>
 * @param fallback A function that parses an input string to a logical plan
 */
public  class SparkSQLParser extends org.apache.spark.sql.catalyst.AbstractSparkSQLParser {
  public   SparkSQLParser (scala.Function1<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> fallback) { throw new RuntimeException(); }
  // no position
  private  class SetCommandParser implements scala.util.parsing.combinator.RegexParsers {
    public   SetCommandParser () { throw new RuntimeException(); }
    private  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> key () { throw new RuntimeException(); }
    private  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> value () { throw new RuntimeException(); }
    private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> pair () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (java.lang.String input) { throw new RuntimeException(); }
  }
  // not preceding
  private  org.apache.spark.sql.catalyst.SparkSQLParser.SetCommandParser$ SetCommandParser () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword AS () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword CACHE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword LAZY () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword SET () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword TABLE () { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword UNCACHE () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<java.lang.String> asParser (org.apache.spark.sql.catalyst.AbstractSparkSQLParser.Keyword k) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> reservedWords () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.SqlLexical lexical () { throw new RuntimeException(); }
  protected  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> start () { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> cache () { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> uncache () { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> set () { throw new RuntimeException(); }
  private  scala.util.parsing.combinator.Parsers.Parser<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> others () { throw new RuntimeException(); }
}
