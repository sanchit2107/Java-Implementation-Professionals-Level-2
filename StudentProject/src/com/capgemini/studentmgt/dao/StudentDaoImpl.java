package com.capgemini.studentmgt.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.capagemini.studentmgt.entities.Student;
import com.capgemini.studentmgt.exceptions.StudentNotFoundException;

public class StudentDaoImpl implements IStudentDao {
	
	Map<Integer, Student> store = new HashMap<Integer, Student>();
	

	@Override
	public void addStudent(Student s) {
		store.put(s.getId(), s);
	}

	@Override
	public Student findStudentById(int id) {
		Student s = store.get(id);
		if(s == null)
			throw new StudentNotFoundException("Student Not found for id = "+ id);
		return s;
	}

	@Override
	public Set<Student> allStudents() {
		Collection<Student> students = store.values();
		Set<Student> studentset = new HashSet<>(students);
		return studentset;
	}
	
}

