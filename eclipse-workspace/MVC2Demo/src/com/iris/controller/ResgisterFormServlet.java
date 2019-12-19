package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.dao.CustomerDao1;
import com.iris.daoimpl.CustomerDaoImpl1;
import com.iris.model.Customer;


@WebServlet("/register")
public class ResgisterFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		int s1=Integer.parseInt(request.getParameter("cid"));
		String s2=request.getParameter("cname");
		String s3=request.getParameter("gender");
		String s4=request.getParameter("email");
		String s5=request.getParameter("cpass");
		String s6=request.getParameter("city");
		
		Customer obj=new Customer();
	obj.setCustomerId(s1);
	obj.setCustomerName(s2);
	obj.setGender(s3);
	obj.setEmailAddress(s4);
	obj.setPassword(s5);
	obj.setCity(s6);
		
		
		CustomerDao1 daoObj=new CustomerDaoImpl1();
		
		
		boolean b=daoObj.registerCustomer(obj);
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


	


