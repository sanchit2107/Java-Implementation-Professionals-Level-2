package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Student;
import com.cg.util.MyDBConnection;

public class StudentDaoImpl implements StudentDao {
	Connection con=MyDBConnection.getConnection();
	@Override
	public String createStudent(Student s) {
		try {
			PreparedStatement ps=
					con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setString(1,s.getSid());
			ps.setString(2,s.getName());
			ps.setInt(3,s.getMarks());
			ps.setString(4, s.getGrade());
			int a=ps.executeUpdate();
			if(a>0) 
				return "Student created! your id="+s.getSid();
			else
				return "Student Not Created!";
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Student Not Created!!!";
		}
	}

	@Override
	public Student findStudent(String sid) {
		Student s=null;
		try {
			PreparedStatement ps=
					con.prepareStatement("select * from Student where sid=?");
			ps.setString(1, sid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				s=new Student();
				s.setSid(rs.getString(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getInt(3));
				s.setGrade(rs.getString(4));
				return s;
			}
			else
			{
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Student> getAll() {
		List<Student> slist = new ArrayList<Student>();
		try {
			PreparedStatement ps=
					con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
