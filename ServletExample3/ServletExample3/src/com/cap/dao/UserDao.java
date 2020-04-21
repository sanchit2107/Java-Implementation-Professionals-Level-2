package com.cap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cap.bean.User;
import com.cap.util.MyDbConnection;

public class UserDao {
	Connection con=MyDbConnection.getConnection();
	public String addUser(User u){
		try {
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");
			ps.setString(1, u.getUid());
			ps.setString(2, u.getUname());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getUserType());
			int a=ps.executeUpdate();
			if(a>0)
				return "User Created! your ID is :"+u.getUid();
			else
				return "User Not Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "User Not Created";
		}
		
	}
	public User validUser(String uid, String pass){
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from users where userId=? and password=?");
			ps.setString(1, uid);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				return new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			else
				return null;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}









