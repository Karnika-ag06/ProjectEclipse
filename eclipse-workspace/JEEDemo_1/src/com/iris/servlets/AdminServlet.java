package com.iris.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.model.Customer;

@WebServlet("/adminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
          
   
    public AdminServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		Customer obj=(Customer)session.getAttribute("user");
	
		
		out.println("<div align='center' style='color:green'>"
				+ "Welcome  "+obj.getCustomerName()+"</div>");
	
		RequestDispatcher rd=request.getRequestDispatcher("allcustomer.html");
		rd.include(request,response);
		
		
		
		
	}


	}


