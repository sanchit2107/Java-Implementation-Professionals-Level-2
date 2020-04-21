package com.capgemini.studentmgt.services;

import java.util.Set;
import com.capagemini.studentmgt.entities.Student;
import com.capgemini.studentmgt.dao.IStudentDao;
import com.capgemini.studentmgt.exceptions.IncorrectIdException;

public class StudentServiceImpl implements IStudentService {
		
	private IStudentDao dao;
	
	/**
	 * @param dao
	 */
	public StudentServiceImpl(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student s) {
		dao.addStudent(s);		
	}

	@Override
	public Student findStudentById(int id) {
		if(id < 0)
			throw new IncorrectIdException("Id is Inavlid ");
		Student s= dao.findStudentById(id);
		return s;
	}

	@Override
	public Set<Student> allStudents() {
		Set<Student> students = dao.allStudents();
		return students;
	}
	
}
