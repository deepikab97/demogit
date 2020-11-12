package com.deccan.model;

public class AllPlansInfo {
	private String planId;
	private String sportsId;
	private String planName;
	private double fees;
	private int duration;
	private String sportName;
	
	
	

	public AllPlansInfo(String planId, String sportsId, String planName, double fees, int duration, String sportName) {
		super();
		this.planId = planId;
		this.sportsId = sportsId;
		this.planName = planName;
		this.fees = fees;
		this.duration = duration;
		this.sportName = sportName;
	}


	public String getPlanId() {
		return planId;
	}


	public void setPlanId(String planId) {
		this.planId = planId;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getSportsId() {
		return sportsId;
	}


	public void setSportsId(String sportsId) {
		this.sportsId = sportsId;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getSportName() {
		return sportName;
	}


	public void setSportName(String sportName) {
		this.sportName = sportName;
	}


	@Override
	public String toString() {
		return "AllPlansInfo [planId=" + planId + ", sportsId=" + sportsId + ", planName=" + planName + ", fees=" + fees
				+ ", duration=" + duration + ", sportName=" + sportName + "]";
	}


	
	

}
