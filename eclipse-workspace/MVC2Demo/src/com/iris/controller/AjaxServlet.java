package com.iris.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String email = request.getParameter("email").trim();
			if(email == null || "".equals(email)){
				email = "Guest";
			}
			
			String greetings = "Hello " + email;
			
			response.setContentType("text/plain");
			response.getWriter().write(greetings);
	}
}
          


