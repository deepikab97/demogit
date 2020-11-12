package com.deccan.dao;

import com.deccan.model.Enrollment;

public interface IEnrollmentDao {

	public String approveEnrollment(String enrollmentId);
	public String rejectEnrollment(String enrollmentId);
	public Enrollment enrollMember(Enrollment enrollment);
}
