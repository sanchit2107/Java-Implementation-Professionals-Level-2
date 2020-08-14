package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Student;
import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
	StudentDao sd=new StudentDaoImpl();
	@Override
	public String saveStudent(Student s) {
		if(s.getName().length()>=3) {
			Double num=Math.random();
			String id=s.getName().substring(0,3)+num.toString().substring(2,6);
			s.setSid(id);
			if(s.getMarks()>=75 && s.getMarks()<=100)
				s.setGrade("A");
			else if(s.getMarks()>=50 && s.getMarks()<75)
				s.setGrade("B");
			else
				s.setGrade("C");
			return sd.createStudent(s);
		}
		else {
			return "Invalid Name";
		}
		
	}

	@Override
	public Student findStudent(String sid) {
		// TODO Auto-generated method stub
		return sd.findStudent(sid);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
