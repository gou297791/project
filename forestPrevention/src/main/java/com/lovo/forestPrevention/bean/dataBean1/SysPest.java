package com.lovo.forestPrevention.bean.dataBean1;


public class SysPest {
//虫害id
  private long pestId;
  //虫害名称
  private String pestName;
  //寄主
  private String pestHost;
  //繁殖
  private String pestBreed;
  //天敌
  private String pestEnemy;
  //幼虫图片
  private String pestBabyImg;
  //成虫图片
  private String pestOldImg;
  //防治措施
  private String pestMethod;
  //主要危害
  private String pestHarm;


  public long getPestId() {
    return pestId;
  }

  public void setPestId(long pestId) {
    this.pestId = pestId;
  }


  public String getPestName() {
    return pestName;
  }

  public void setPestName(String pestName) {
    this.pestName = pestName;
  }


  public String getPestHost() {
    return pestHost;
  }

  public void setPestHost(String pestHost) {
    this.pestHost = pestHost;
  }


  public String getPestBreed() {
    return pestBreed;
  }

  public void setPestBreed(String pestBreed) {
    this.pestBreed = pestBreed;
  }


  public String getPestEnemy() {
    return pestEnemy;
  }

  public void setPestEnemy(String pestEnemy) {
    this.pestEnemy = pestEnemy;
  }


  public String getPestBabyImg() {
    return pestBabyImg;
  }

  public void setPestBabyImg(String pestBabyImg) {
    this.pestBabyImg = pestBabyImg;
  }


  public String getPestOldImg() {
    return pestOldImg;
  }

  public void setPestOldImg(String pestOldImg) {
    this.pestOldImg = pestOldImg;
  }


  public String getPestMethod() {
    return pestMethod;
  }

  public void setPestMethod(String pestMethod) {
    this.pestMethod = pestMethod;
  }


  public String getPestHarm() {
    return pestHarm;
  }

  public void setPestHarm(String pestHarm) {
    this.pestHarm = pestHarm;
  }

}
