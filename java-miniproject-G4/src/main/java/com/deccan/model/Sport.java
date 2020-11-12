package com.deccan.model;

public class Sport {
	private String sportId;
	private String sportName;
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sport(String sportId, String sportName) {
		super();
		this.sportId = sportId;
		this.sportName = sportName;
	}
	public String getSportId() {
		return sportId;
	}
	public void setSportId(String sportId) {
		this.sportId = sportId;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	@Override
	public String toString() {
		return "Sport [sportId=" + sportId + ", sportName=" + sportName + "]";
	}
	
}
