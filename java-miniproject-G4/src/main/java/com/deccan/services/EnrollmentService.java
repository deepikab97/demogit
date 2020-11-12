package com.deccan.services;

import com.deccan.model.Enrollment;

public class EnrollmentService implements IEnrollmentService{
	private String generateEnrollmentId() {
		return "DE"+Math.round(Math.random()*99999);
	}

	@Override
	public String approveEnrollment(String enrollmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rejectEnrollment(String enrollmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enrollment enrollMember(Enrollment enrollment) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
