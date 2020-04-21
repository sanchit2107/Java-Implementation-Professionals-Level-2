package com.capgemini.studentmgt.dao;

import java.util.Set;

import com.capagemini.studentmgt.entities.Student;

public interface IStudentDao {
	
	void addStudent(Student s);
	
	Student findStudentById(int id);
	
	Set<Student> allStudents();
	
}
