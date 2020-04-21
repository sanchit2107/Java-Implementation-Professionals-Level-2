/**
 * 
 */
package com.capgemini.studentmgt.services;

import java.util.Set;

import com.capagemini.studentmgt.entities.Student;

/**
 * @author Sanchit Singhal
 *
 */
public interface IStudentService {
	
	void addStudent(Student s);
	
	Student findStudentById(int id);
	
	Set<Student> allStudents();
	
}
