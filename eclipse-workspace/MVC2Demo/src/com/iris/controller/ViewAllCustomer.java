package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.dao.CustomerDao1;
import com.iris.daoimpl.CustomerDaoImpl1;

import com.iris.model.Customer;



@WebServlet("/viewAllCustomers")
public class ViewAllCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		response.setContentType("text/html");
	
		PrintWriter out=response.getWriter();
		
		//Controller will take the request
		
		//will call the appropriate dao  to process the request
		CustomerDao1 daoObj=new CustomerDaoImpl1();
		
		List<Customer> usersList=daoObj.getAllCustomers();
		
		request.setAttribute("customerList",usersList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllCustomer.jsp");
		rd.forward(request, response);
	}
	catch(Exception e) {
		e.printStackTrace();	
	}
	}

}
