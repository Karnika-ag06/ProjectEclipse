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

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CustomerDao1 daoObj=new CustomerDaoImpl1();
		
	int id=Integer.parseInt(request.getParameter("cId"));
	
	Customer c=daoObj.getCustomer(id);
	
	request.setAttribute("c",c);
	
	
	RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
	rd.forward(request, response);
	
	
	
	
	
	
	}
	catch(Exception e) {
	e.printStackTrace();
	}


}
}
