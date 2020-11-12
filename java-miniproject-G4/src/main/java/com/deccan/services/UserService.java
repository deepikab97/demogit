package com.deccan.services;

import java.util.List;

import com.deccan.dao.UserDaoImpl;
import com.deccan.exception.UserException;
import com.deccan.model.AllPlansInfo;
import com.deccan.model.User;

public class UserService implements IUserService{
	
	UserDaoImpl userDao= new UserDaoImpl();
	private String generateUserId() {
		return "DU"+Math.round(Math.random()*99999);
	}
	
	

	@Override
	public User register(User user) throws Exception {
		System.out.println("In userService implementation  "+ user);
		user.setUserId(generateUserId());
		user.setRole("member");
		userDao.register(user);
		
		
		return null;
	}

	@Override
	public User login(String email, String password) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logout(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> displayUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> displayManagers(String userRole) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<AllPlansInfo> displayPlans() throws Exception {
		System.out.println("In userservice planlist ");
		return userDao.displayPlanlist();
	}
	
	

}
