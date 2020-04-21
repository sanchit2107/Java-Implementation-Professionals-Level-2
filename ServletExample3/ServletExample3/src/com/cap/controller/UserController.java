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
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService us=new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u=new User(request.getParameter("t1"), request.getParameter("t2"), request.getParameter("t3"), request.getParameter("t4"));
		String result=us.createUser(u);
		request.setAttribute("data", result);
		RequestDispatcher dis=request.getRequestDispatcher("index.jsp");
		dis.forward(request, response);
	}

}







