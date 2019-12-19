package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.dao.UserDao;
import com.iris.daoimpl.UserDaoImpl;
import com.iris.model.User;


public class RegisterFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		
		String s2=request.getParameter("uname");
		String s3=request.getParameter("gender");
		String s4=request.getParameter("email");
		String s5=request.getParameter("upass");
		String s6=request.getParameter("city");
		String s7=request.getParameter("role");
		
		User obj=new User();
		obj.setUserName(s2);
		obj.setGender(s3);
		obj.setEmail(s4);
		obj.setPassword(s5);
		obj.setCity(s6);
		obj.setRole(s7);
		
			
		

	UserDao daoObj=new UserDaoImpl();
	
	
	boolean b=daoObj.saveUser(obj);
	if(b){
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
	else {
		RequestDispatcher rd=request.getRequestDispatcher("registerform.jsp");
		rd.forward(request, response);
	}
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}


	


