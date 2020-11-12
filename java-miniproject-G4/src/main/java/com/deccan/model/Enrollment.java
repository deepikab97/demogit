package com.deccan.model;

import java.util.Date;

public class Enrollment {
	private String enrollmentId;
	public String getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	private User user;
	private Batch batch;
	private Plan plan;
	private Date startDate;
	private String status;
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrollment(User user, Batch batch, Plan plan, Date startDate, String status) {
		super();
		this.user = user;
		this.batch = batch;
		this.plan = plan;
		this.startDate = startDate;
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Enrollment [user=" + user + ", batch=" + batch + ", plan=" + plan + ", startDate=" + startDate
				+ ", status=" + status + "]";
	}
	
}
