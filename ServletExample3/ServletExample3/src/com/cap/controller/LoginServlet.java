package com.cap.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cap.bean.User;
import com.cap.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService us=new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=us.validateLigin(request.getParameter("t1"), request.getParameter("t2"));
		
		if(u==null) {
			PrintWriter out=response.getWriter();
			out.println("<h1 style='color: red; text-align: center;'>Invalid UserName and Password</h1>");
			RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
			dis.include(request, response);			
		}
		else
		{
			request.setAttribute("user",u);
			RequestDispatcher dis=request.getRequestDispatcher("Welcome.jsp");
			dis.forward(request, response);
			//response.sendRedirect("Welcome.jsp");
		}
	}

}
