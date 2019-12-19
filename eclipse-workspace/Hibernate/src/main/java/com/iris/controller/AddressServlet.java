package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daoimpl.UserDaoImpl;
import com.iris.model.Address;
import com.iris.model.User;


public class AddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	    	response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			int s1=Integer.parseInt(request.getParameter("hname"));
			String s2=request.getParameter("Street");
			int s3=Integer.parseInt(request.getParameter("pin"));
			
			HttpSession session=request.getSession();
			User user=(User)session.getAttribute("user");
				
            Address add =new Address(s1,s2,s3);
            user.getS().add(add);
				            
				boolean flag=new UserDaoImpl().updateUser(user);			
				
				if(flag==true) {
				out.println("Address added");
				}
				else {
					out.println("Address not added");
					
				}
						}


		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}