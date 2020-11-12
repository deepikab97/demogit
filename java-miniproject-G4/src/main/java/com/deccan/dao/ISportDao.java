package com.deccan.dao;

import java.util.List;

import com.deccan.model.Sport;

public interface ISportDao {
	public List<Sport> displaySports();
	public Sport addSport(Sport sport);
	public Sport updateSport(Sport sport);
	public void removeSport(String sportId);
}
