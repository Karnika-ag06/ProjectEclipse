package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daos.CustomerDao;
import com.iris.daosimpl.CustomerDaoImpl;
import com.iris.model.Customer;




@WebServlet("/AllCustomerServlet")
public class AllCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AllCustomerServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		CustomerDao daoObj=new CustomerDaoImpl();
		List<Customer> clist=daoObj.getAllCustomers();
		
		HttpSession session=request.getSession();
		Customer c=(Customer)session.getAttribute("user");
		
		out.println("<div align='center' style='color:blue'><h1>Details of all customers</h1></div><br/>");
			out.println("<table border='1' align='center'>");
			
			out.println("<tr>");
			out.println("<td>Id</td>");
			out.println("<td>Name</td>");
			out.println("<td>Gender</td>");
			out.println("<td>Email</td>");
			out.println("<td>City</td>");
			out.println("<td>Password</td>");
			
			out.println("<td colspan='2'>Choose</td>");
			out.println("</tr>");
		
			for(Customer cObj:clist) {
				out.println("<tr><td>"+cObj.getCustomerId()+"</td><td>"+cObj.getCustomerName()+"</td><td>"
						+cObj.getGender()+ "</td> <td>" +cObj.getEmailAddress()+"</td><td>"+cObj.getCity()+"</td><td>"
						+cObj.getPassword()+"</td>");
				out.println("<td><a href='DeleteServlet?cId="+cObj.getCustomerId()+"'>Delete</a></td>");
				out.println("<td><a href='UpdateServlet?cid="+cObj.getCustomerId()+"'>Update</a></td>");
				
			}
	
			out.println("</table>");
			ServletContext context=getServletContext();
			int totalLoggedInUsers=(int)context.getAttribute("counter");
			out.println("Total logged in users : "+totalLoggedInUsers);
			    }
			
		
	catch(Exception e) {
			e.printStackTrace();
		}
	}
}


