package com.capgemini.training.daos;

import java.sql.Statement;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.SQLException;

import com.capgemini.training.util.DBUtil;

public interface CreateTable {
	
	public static boolean tableCreate() {
		String sql = "create table product("
				+ "pid number primary key,"
				+ "pname varchar2(15) not null,"
				+ "qty number,"
				+ "price number(10, 2),"
				+ "brand varchar2(10));";
		boolean status = false;
		Connection con = DBUtil.createConnection();
		try {
			Statement st = con.createStatement();
			status = st.execute(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static boolean tableCreate2() {
		String sql = "create table login("
				+ "lid number primary key,"
				+ "email varchar2(15) not null,"
				+ "pass varchar2(100),"
				+ "role varchar2(10),"
				+ "doc date default sysdate);";
		boolean status = false;
		Connection con = DBUtil.createConnection();
		try {
			Statement st = con.createStatement();
			status = st.execute(sql);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	
}
