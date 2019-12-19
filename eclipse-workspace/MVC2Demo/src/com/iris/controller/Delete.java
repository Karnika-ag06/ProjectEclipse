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

@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Delete() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	CustomerDao1 custDao=new CustomerDaoImpl1();
	
	int id1=Integer.parseInt(request.getParameter("cId"));
	custDao.deleteCustomer(id1);
	out.println("Deleted Succesfully...");
	
	RequestDispatcher rd=request.getRequestDispatcher("viewAllCustomers");
		rd.include(request, response);
				}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
}