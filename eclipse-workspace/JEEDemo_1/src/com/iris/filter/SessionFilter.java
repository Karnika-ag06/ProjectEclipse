package com.iris.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter({"/adminServlet","/welcomeservlet"})
public class SessionFilter implements Filter {

    

	public void destroy() {
			}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		System.out.println("I m Session Filter");
		HttpServletRequest req=(HttpServletRequest)request;
		/*getSession() is the method of HttpServletRequest*/
		HttpSession session=req.getSession(false);
		
		if(session==null){
			out.println("U have to start from login.htm..I m start . Dont fool me");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		
		else {
		chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
