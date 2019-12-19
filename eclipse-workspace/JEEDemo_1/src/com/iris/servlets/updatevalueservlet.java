package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.model.Customer;

@WebServlet("/updatevalueservlet")
public class updatevalueservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public updatevalueservlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
		
		Customer cust=new Customer();
	
		
		  String s2=request.getParameter("cname");
		  String s3=request.getParameter("gender");
		  String s4=request.getParameter("email");
		  String s5=request.getParameter("password");
		  String s6=request.getParameter("city");
		  
		  cust.setCustomerName(s2);
			cust.setGender(s3);
			cust.setEmailAddress(s4);
			cust.setPassword(s5);
			cust.setCity(s6);
			cust.setCustomerId(Integer.parseInt(request.getParameter("cid")));
			
			PrintWriter out=response.getWriter();
			CustomerDao custDao=new CustomerDaoImpl();
			custDao.updateCustomer(cust);
	
			
			out.println("update successfully");
			RequestDispatcher rd=request.getRequestDispatcher("AllCustomerServlet");
        	rd.forward(request,response);
	
	}
		catch(Exception e){
			e.printStackTrace();
		}
}
}
