package com.capgemini.training.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.training.daos.LoginDao;
import com.capgemini.training.model.Login;
import com.capgemini.training.util.DBUtil;

public class LoginDaoImpl implements LoginDao {
	
	Connection con = null;
	public LoginDaoImpl() {
		con = DBUtil.createConnection();
	}

	@Override
	public Login loginUser(String email, String pass) {
		Login log = new Login();
		try {
			String sql = "select * from login where email=? and pass=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			rs.next();
			log.setLid(rs.getInt(1));
			log.setEmail(rs.getString(2));
			log.setPass(rs.getString(3));
			log.setRole(rs.getString(4));
			log.setDoc(rs.getDate(5));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return log;
	}

	@Override
	public void registerUser(Login login) {
		
		try {
			String sql = "insert into login(uid, email, pass, role) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, login.getLid());
			ps.setString(2, login.getEmail());
			ps.setString(3, login.getPass());
			ps.setString(4, login.getRole());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int changePassword(String oldPassword, String newPassword, String email) {
		
		return 0;
	}

}
