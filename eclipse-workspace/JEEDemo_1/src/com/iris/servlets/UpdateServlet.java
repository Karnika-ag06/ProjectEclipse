package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.model.Customer;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CustomerDao daoObj=new CustomerDaoImpl();
		
		
		int id=Integer.parseInt(request.getParameter("cid"));
		Customer c=daoObj.getCustomer(id);
		
		out.println("<div align='center' style='color:red'><h1>Details of all customers</h1></div><br/>");
		out.println("<form action='updatevalueservlet'>");
		out.println("<table border='1' align='center'>");
		
		out.println("<tr>");
		out.println("<th>Id</th>");
		out.println("<td><input type='text' name='cid' value='"+c.getCustomerId()+"' </td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>Name</th>");
		out.println("<td><input type='text' name='cname' value='"+c.getCustomerName()+"'</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>Gender</th>");
		out.println("<td><input type='text' name='gender' value='"+c.getGender()+"'</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>Email Address</th>");
		out.println("<td><input type='text' name='email' value='"+c.getEmailAddress()+"'</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>Password</th>");
		out.println("<td><input type='text' name='password' value='"+c.getPassword()+"'</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>City</th>");
		out.println("<td><input type='text' name='city' value='"+c.getCity()+"'</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th></th>");
		out.println("<td><input type='submit' name='btn'</td>");
		out.println("</tr>");
		
		out.println("</table></form");
	}
		catch(Exception e) {
			e.printStackTrace();
		}


}
}
