package com.deccan.services;

import java.util.List;

import com.deccan.model.Sport;

public class SportService implements ISportService{
	private String generateSportsId() {
		return "DS"+Math.round(Math.random()*99999);
	}

	@Override
	public List<Sport> displaySports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sport addSport(Sport sport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sport updateSport(Sport sport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSport(String sportId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
