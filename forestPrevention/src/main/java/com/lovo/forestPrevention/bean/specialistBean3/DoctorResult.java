package com.lovo.forestPrevention.bean.specialistBean3;


import com.lovo.forestPrevention.bean.disasterBean2.SysEvent;

public class DoctorResult {

    private long resultId;
  private SysEvent sysEvent;
  private String doctorEventDate;
  private String doctorEventResult;


  public long getResultId() {
    return resultId;
  }

  public void setResultId(long resultId) {
    this.resultId = resultId;
  }

  public SysEvent getSysEvent() {
    return sysEvent;
  }

  public void setSysEvent(SysEvent sysEvent) {
    this.sysEvent = sysEvent;
  }

  public String getDoctorEventDate() {
    return doctorEventDate;
  }

  public void setDoctorEventDate(String doctorEventDate) {
    this.doctorEventDate = doctorEventDate;
  }


  public String getDoctorEventResult() {
    return doctorEventResult;
  }

  public void setDoctorEventResult(String doctorEventResult) {
    this.doctorEventResult = doctorEventResult;
  }

}
