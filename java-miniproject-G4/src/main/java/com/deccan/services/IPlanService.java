package com.deccan.services;

import java.util.List;

import com.deccan.exception.BatchException;
import com.deccan.model.Plan;

public interface IPlanService {
	public List<Plan> diaplayPlans() throws BatchException ;
	public Plan addPlan(Plan plan);
	public Plan update(Plan plan);
	public void removePlan(String planId);
}
