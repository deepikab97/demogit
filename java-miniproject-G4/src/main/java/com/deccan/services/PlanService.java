package com.deccan.services;

import java.util.List;

import com.deccan.exception.BatchException;
import com.deccan.model.Plan;
import com.deccan.model.Sport;

public class PlanService implements IPlanService{
	private String generatePlanId() {
		return "DP"+Math.round(Math.random()*99999);
	}

	@Override
	public List<Plan> diaplayPlans() throws BatchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan addPlan(Plan plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan update(Plan plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlan(String planId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
