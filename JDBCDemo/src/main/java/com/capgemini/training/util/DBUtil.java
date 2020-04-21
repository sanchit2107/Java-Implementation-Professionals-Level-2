package com.capgemini.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static Connection con = null;
	
	public static Connection createConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "cap1", "cap1");
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(SQLException e2) {
			e2.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeConnection() {
		try {
		con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
