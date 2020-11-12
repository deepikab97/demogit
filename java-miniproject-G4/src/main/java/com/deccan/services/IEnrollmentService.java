package com.deccan.services;

import com.deccan.model.Enrollment;

public interface IEnrollmentService {

	public String approveEnrollment(String enrollmentId);
	public String rejectEnrollment(String enrollmentId);
	public Enrollment enrollMember(Enrollment enrollment);
}
