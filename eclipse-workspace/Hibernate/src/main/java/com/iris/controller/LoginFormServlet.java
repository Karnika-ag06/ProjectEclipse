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

public class LoginFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
	    	response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			int id=Integer.parseInt(request.getParameter("uid"));
			String pass=request.getParameter("upass");
			
			UserDao daoObj=new UserDaoImpl();
			User obj=daoObj.validateUser(id,pass);
			
			if(obj==null){
				out.println("<div align='center' style='color:red'>customer Id or password is incorrect</div>");
				
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		
				rd.include(request, response);
			}
			else {
				String Role=(String)obj.getRole();
			
			if(Role.equals("admin")){
				HttpSession session=request.getSession();
				session.setAttribute("user",obj);
				
				RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
				rd.forward(request,response);
			}
			else {
				
				HttpSession session=request.getSession();
				session.setAttribute("user",obj);
				
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			
			}
			}
			catch(Exception e) { 
				e.printStackTrace();
			}
			
		}

}
