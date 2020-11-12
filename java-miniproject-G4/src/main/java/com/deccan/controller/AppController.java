package com.deccan.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deccan.services.UserService;

/**
 * Servlet implementation class UserServelt
 */
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService =new UserService();
  
   public AppController() {
       super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String password = request.getParameter("password");
		
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		if(userName.isEmpty() || userEmail.isEmpty() || password.isEmpty() || 
				 address.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("registration.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("registration.jsp");
			req.forward(request, response);
		}
	}


}
