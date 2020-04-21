package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    int initCount, serviceCount;
    public void init() {
    	initCount++;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		serviceCount++;
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Servlet Demo!!</h1>");
		pw.println("<p>Current Date</p>" + new Date());
		pw.println("Init called: "+ initCount);
		pw.println("Service Called : "+serviceCount);
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		serviceCount++;
		PrintWriter pw = response.getWriter();
		
		Connection con = MyDBConnection.getConnection();
		
		String uid = request.getParameter("t1");
		String uname = request.getParameter("t2");
		String pwd = request.getParameter("t3");
		String uType = request.getParameter("t4");
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?)");
			ps.setString(1, uid);
			ps.setString(2, uname);
			ps.setString(3, pwd);
			ps.setString(4, uType);
			
			int a = ps.executeUpdate();
			if(a > 0)
				pw.println("<h1>User Created!!!</h1>");
			else
				pw.println("<h1>user not created!!</h1");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Welcome to Servlet Demo from POST() !!</h1>");
		pw.println("<p>Current Date</p>" + new Date());
		pw.println("Init called: "+ initCount);
		pw.println("Service Called : "+serviceCount);
		pw.println("<table border =1 >"
				+ "<tr><td>"+uid+"</td></tr>"
				+ "<tr><td>"+uname+"</td></tr>"
				+ "<tr><td>"+pwd+"</td></tr>"
				+ "<tr><td>"+uType+"</td></tr>"
				+ "</table>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
