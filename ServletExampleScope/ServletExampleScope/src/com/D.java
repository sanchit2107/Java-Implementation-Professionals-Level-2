package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class D
 */
public class D extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();
		Animal a=(Animal)ctx.getAttribute("animals");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Servlet D </h1>");
		out.println("<h2>Name:"+a.getName()+"</h2>");
		out.println("<h2>Age"+a.getAge()+"</h2>");
		out.println("</body></html>");
	}

}
