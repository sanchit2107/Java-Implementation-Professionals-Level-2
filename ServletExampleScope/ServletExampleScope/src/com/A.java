package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class A
 */
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Running Servlet A</h1>");
		out.println("</body></html>");
		
	}

}
