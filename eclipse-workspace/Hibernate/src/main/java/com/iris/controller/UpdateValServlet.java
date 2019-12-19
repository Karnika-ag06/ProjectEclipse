package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.dao.UserDao;
import com.iris.daoimpl.UserDaoImpl;
import com.iris.model.User;

public class UpdateValServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
		
	     User cust=new User();
	     
	     HttpSession session = request.getSession();	
	     
		  int s1=(Integer)session.getAttribute("id");
		  String s2=request.getParameter("city");
		  String s3=request.getParameter("email");
		  String s4=request.getParameter("gender");
		  String s5=request.getParameter("password");
		  String s6=request.getParameter("uname");
	 
			cust.setUserId(s1);
			  
			cust.setCity(s2);
			cust.setEmail(s3);
			cust.setGender(s4);
			cust.setPassword(s5);
			cust.setUserName(s6);
			
			
			PrintWriter out=response.getWriter();
			UserDao custDao=new UserDaoImpl();
			custDao.updateUser(cust);
	
			
			out.println("update successfully");
			RequestDispatcher rd=request.getRequestDispatcher("AllUsers");
        	rd.forward(request,response);
	
	}
		catch(Exception e){
			e.printStackTrace();
		}
}
}
