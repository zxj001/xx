package org.apache.spark.deploy.master;
public  class ZooKeeperLeaderElectionAgent implements org.apache.curator.framework.recipes.leader.LeaderLatchListener, org.apache.spark.deploy.master.LeaderElectionAgent, org.apache.spark.Logging {
  public  org.apache.spark.deploy.master.LeaderElectable masterActor () { throw new RuntimeException(); }
  // not preceding
  public   ZooKeeperLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable masterActor, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  public  java.lang.String WORKING_DIR () { throw new RuntimeException(); }
  private  org.apache.curator.framework.CuratorFramework zk () { throw new RuntimeException(); }
  private  org.apache.curator.framework.recipes.leader.LeaderLatch leaderLatch () { throw new RuntimeException(); }
  private  scala.Enumeration.Value status () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void isLeader () { throw new RuntimeException(); }
  public  void notLeader () { throw new RuntimeException(); }
  public  void updateLeadershipStatus (boolean isLeader) { throw new RuntimeException(); }
  // no position
  private  class LeadershipStatus extends scala.Enumeration {
    public   LeadershipStatus () { throw new RuntimeException(); }
    public  scala.Enumeration.Value LEADER () { throw new RuntimeException(); }
    public  scala.Enumeration.Value NOT_LEADER () { throw new RuntimeException(); }
  }
  // not preceding
  private  org.apache.spark.deploy.master.ZooKeeperLeaderElectionAgent.LeadershipStatus$ LeadershipStatus () { throw new RuntimeException(); }
}
