package com.deccan.model;

public class Plan {
	private String planId;
	private String planName;
	private double fees;
	private int duration;
	private Sport sport;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(String planId, String planName, double fees, int duration, Sport sport) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.fees = fees;
		this.duration = duration;
		this.sport = sport;
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
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", fees=" + fees + ", duration=" + duration
				+ ", sport=" + sport + "]";
	}
	
}
