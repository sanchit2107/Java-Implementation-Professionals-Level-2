package com.cg.service;

import java.util.List;

import com.cg.bean.Student;

public interface StudentService {
	public String saveStudent(Student s); 
	public Student findStudent(String sid);
	public List<Student> getAll();
}
