package com.deccan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deccan.model.AllPlansInfo;
import com.deccan.model.User;
import com.deccan.services.UserService;


public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService= new UserService();
    public MemberController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		
		if(path.equals("/registerMember")) {		
			try {
				System.out.println("member controller");
				User user = new User();
				
				user.setUserName(request.getParameter("userName"));
				user.setUserEmail(request.getParameter("userEmail"));
				user.setPassword(request.getParameter("password"));
				user.setRole(request.getParameter("role"));
				user.setContact(request.getParameter("contact"));
				user.setAddress(request.getParameter("address"));
				userService.register(user);
				request.getRequestDispatcher("/member/member-home.jsp").forward(request, response);								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(path.equals("/planlist")) {			
			try {
				List<AllPlansInfo> planlist=  userService.displayPlans();
				request.setAttribute("plans", planlist);
				request.getRequestDispatcher("/member/member-planlist.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/buyMembership")) {			
//			try {
//				Users user = as.getUser(request.getParameter("username"));
//				request.setAttribute("user", user);
//				request.getRequestDispatcher("/admin/update-user.jsp").forward(request, response);								
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
