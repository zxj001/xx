package org.apache.spark.network.nio;
public  class SendingConnection extends org.apache.spark.network.nio.Connection {
  public  java.net.InetSocketAddress address () { throw new RuntimeException(); }
  // not preceding
  public   SendingConnection (java.net.InetSocketAddress address, java.nio.channels.Selector selector_, org.apache.spark.network.nio.ConnectionManagerId remoteId_, org.apache.spark.network.nio.ConnectionId id_, org.apache.spark.SecurityManager securityMgr_) { throw new RuntimeException(); }
  public  boolean isSaslComplete () { throw new RuntimeException(); }
  private  class Outbox {
    public   Outbox () { throw new RuntimeException(); }
    public  java.util.LinkedList<org.apache.spark.network.nio.Message> messages () { throw new RuntimeException(); }
    public  int defaultChunkSize () { throw new RuntimeException(); }
    public  int nextMessageToBeUsed () { throw new RuntimeException(); }
    public  void addMessage (org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.network.nio.MessageChunk> getChunk () { throw new RuntimeException(); }
  }
  private  org.apache.spark.network.nio.SendingConnection.Outbox outbox () { throw new RuntimeException(); }
  private  boolean needForceReregister () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.nio.ByteBuffer> currentBuffers () { throw new RuntimeException(); }
  public  java.net.InetSocketAddress getRemoteAddress () { throw new RuntimeException(); }
  public  int DEFAULT_INTEREST () { throw new RuntimeException(); }
  public  void registerInterest () { throw new RuntimeException(); }
  public  void unregisterInterest () { throw new RuntimeException(); }
  public  void registerAfterAuth () { throw new RuntimeException(); }
  public  void send (org.apache.spark.network.nio.Message message) { throw new RuntimeException(); }
  public  boolean resetForceReregister () { throw new RuntimeException(); }
  public  void connect () { throw new RuntimeException(); }
  public  boolean finishConnect (boolean force) { throw new RuntimeException(); }
  public  boolean write () { throw new RuntimeException(); }
  public  boolean read () { throw new RuntimeException(); }
  public  boolean changeInterestForRead () { throw new RuntimeException(); }
  public  boolean changeInterestForWrite () { throw new RuntimeException(); }
}
