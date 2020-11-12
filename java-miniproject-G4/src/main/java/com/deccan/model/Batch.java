package com.deccan.model;

public class Batch {
	private String batchId;
	private String startTime;
	private String batchDuration;
	private int size;
	private Sport sportId;
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batch(String batchId, String startTime, String batchDuration, int size, Sport sportId) {
		super();
		this.batchId = batchId;
		this.startTime = startTime;
		this.batchDuration = batchDuration;
		this.size = size;
		this.sportId = sportId;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getBatchDuration() {
		return batchDuration;
	}
	public void setBatchDuration(String batchDuration) {
		this.batchDuration = batchDuration;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Sport getSportId() {
		return sportId;
	}
	public void setSportId(Sport sportId) {
		this.sportId = sportId;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", startTime=" + startTime + ", batchDuration=" + batchDuration + ", size="
				+ size + ", sportId=" + sportId + "]";
	}
	
}
