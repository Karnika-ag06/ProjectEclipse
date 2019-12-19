package com.iris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;


import com.iris.dao.UserDao;
import com.iris.daoimpl.UserDaoImpl;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	UserDao custDao=new UserDaoImpl();
	
	int id1=Integer.parseInt(request.getParameter("uid"));
	custDao.deleteuser(id1);
	
	out.println("Deleted Succesfully...");
	
	RequestDispatcher rd=request.getRequestDispatcher("AllUsers");
		rd.include(request, response);
				}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
}