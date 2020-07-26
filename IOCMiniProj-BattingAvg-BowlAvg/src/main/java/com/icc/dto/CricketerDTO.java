package com.icc.dto;

import java.io.Serializable;

public class CricketerDTO implements Serializable {
	private String cricketerName;
	private Integer runsScored;
	private Integer noOfTimesOut;
	private Float battingAvg;
	private Integer noOfrunsConcedded;
	private Integer wicketsTaken;
	private Float bowlAvg;
	
	//getters and setters
	public String getCricketerName() {
		return cricketerName;
	}
	public void setCricketerName(String cricketerName) {
		this.cricketerName = cricketerName;
	}
	public Integer getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(Integer runsScored) {
		this.runsScored = runsScored;
	}
	public Integer getNoOfTimesOut() {
		return noOfTimesOut;
	}
	public void setNoOfTimesOut(Integer noOfTimesOut) {
		this.noOfTimesOut = noOfTimesOut;
	}
	public Float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(Float battingAvg) {
		this.battingAvg = battingAvg;
	}
	public Integer getNoOfrunsConcedded() {
		return noOfrunsConcedded;
	}
	public void setNoOfrunsConcedded(Integer noOfrunsConcedded) {
		this.noOfrunsConcedded = noOfrunsConcedded;
	}
	public Integer getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(Integer wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public Float getBowlAvg() {
		return bowlAvg;
	}
	public void setBowlAvg(Float bowlAvg) {
		this.bowlAvg = bowlAvg;
	}

}
