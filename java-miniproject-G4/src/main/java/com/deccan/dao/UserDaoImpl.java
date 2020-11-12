package com.deccan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.deccan.dbutils.DbUtil;
import com.deccan.exception.UserException;
import com.deccan.model.AllPlansInfo;
import com.deccan.model.User;

public class UserDaoImpl implements IUserDao{

	@Override
	public User register(User user) throws Exception {
		System.out.println("In UserDao impl "+user);
		String sql="insert into users values(?,?,?,?,?,?,?)";
		Connection con= DbUtil.getConnection();
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserEmail());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getRole());
		ps.setString(6, user.getContact());
		ps.setString(7, user.getAddress());
		
		
		if(ps.executeUpdate() == 1) {
			con.commit();			//user  will be committed
			ps.close(); 
			con.close();  
			return user;
		}
		else{ 
			con.rollback();
			ps.close(); 
			con.close(); 
			return null;
		}
	
		
	}

	@Override
	public User login(String email, String password) throws UserException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logout(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> displayUsers() throws UserException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> displayManagers(String userRole) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AllPlansInfo> displayPlanlist() throws Exception {
		System.out.println("In user dao planlist");
		String sql="select p.planId,s.sportsId,p.planName,p.fees,p.duration,s.sportName from plans p inner join sports s on s.sportsId=p.sporstId";
		Connection con= DbUtil.getConnection();
		PreparedStatement ps= con.prepareStatement(sql);
		List<AllPlansInfo>list = new ArrayList<AllPlansInfo>();
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			list.add(new AllPlansInfo(rs.getString("planId"), rs.getString("sportsId"), rs.getString("planName"), rs.getDouble("fees"), rs.getInt("duration"), rs.getString("sportName")));
		}
		
		return list;
	}

}
