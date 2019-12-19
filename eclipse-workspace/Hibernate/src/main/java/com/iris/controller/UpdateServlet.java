package com.iris.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.dao.UserDao;
import com.iris.daoimpl.UserDaoImpl;
import com.iris.model.User;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		UserDao daoObj=new UserDaoImpl();
		
		int id=Integer.parseInt(request.getParameter("uid"));
		
	    HttpSession session=request.getSession();
		session.setAttribute("id",id);
		
		
		User c=daoObj.getUser(id);	
	
		 request.setAttribute("c",c);
		RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
		rd.forward(request, response);
	
        }
	catch(Exception e) {
	    e.printStackTrace();
                       }
	            }
     }
 