package com.deccan.dao;

import java.sql.SQLException;
import java.util.List;

import com.deccan.exception.UserException;
import com.deccan.model.AllPlansInfo;
import com.deccan.model.User;

public interface IUserDao {
	public User register(User user) throws UserException,  Exception;
	public User login(String email, String password)throws UserException;
	public User updateUser(User user);
	public String logout(String userId);
	public List<User> displayUsers() throws UserException;
	public List <User> displayManagers(String userRole);
	public List<AllPlansInfo> displayPlanlist()throws Exception;
	
}
