package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.dao.UserDao;
import com.iris.daoimpl.UserDaoImpl;

import com.iris.model.User;



public class AllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		response.setContentType("text/html");
	
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		
		//will call the appropriate dao  to process the request
		UserDao daoObj=new UserDaoImpl();
		
		List<User> usersList=daoObj.getAllUsers();
		
		request.setAttribute("userList",usersList);
		RequestDispatcher rd=request.getRequestDispatcher("AllUsers.jsp");
		rd.forward(request, response);
	}
	catch(Exception e) {
		e.printStackTrace();	
	}
	}

}
