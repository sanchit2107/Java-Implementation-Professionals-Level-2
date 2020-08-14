package com.cg.dao;

import java.util.List;

import com.cg.bean.Student;

public interface StudentDao {
	public String createStudent(Student s);
	public Student findStudent(String sid);
	public List<Student> getAll();
}
