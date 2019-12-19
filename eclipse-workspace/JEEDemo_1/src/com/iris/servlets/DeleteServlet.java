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


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	CustomerDao custDao=new CustomerDaoImpl();
	
	int id1=Integer.parseInt(request.getParameter("cId"));
	custDao.deleteCustomer(id1);
	out.println("Deleted Succesfully...");
	
	RequestDispatcher rd=request.getRequestDispatcher("AllCustomerServlet");
		rd.include(request, response);
				}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
}
