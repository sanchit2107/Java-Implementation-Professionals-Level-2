package com.capgemini.studentmgt.ui;

import com.capgemini.studentmgt.services.IStudentService;
import com.capgemini.studentmgt.services.StudentServiceImpl;
import com.capgemini.studentmgt.dao.StudentDaoImpl;

import java.util.Collection;
import java.util.Set;

import com.capagemini.studentmgt.entities.Student;
import com.capgemini.studentmgt.exceptions.StudentNotFoundException;
import com.capgemini.studentmgt.exceptions.IncorrectIdException;
import com.capgemini.studentmgt.exceptions.StudentNotFoundException;

public class StudentUi {
	
	private IStudentService service = new StudentServiceImpl(new StudentDaoImpl());
	
	public static void main(String[] args) {
		
			StudentUi sui = new StudentUi();
			sui.runUi();
	}
	
	public void runUi() {
		try {
			Student s1 = new Student(1, "CoolSam");
			Student s2 = new Student(2, "Vatsal");
			service.addStudent(s1);
			service.addStudent(s2);
			
			Student fetched1 = service.findStudentById(1);
			Student fetched2 = service.findStudentById(2);
			System.out.println("Id=1 "+ fetched1.getName());
			System.out.println("Id=2 "+ fetched2.getName());
			System.out.println("********printing all Students****");
			Set<Student> students = service.allStudents();
			print(students);
		}
		catch(IncorrectIdException e) {
			System.out.println("Id is Invalid");
		}
		catch(StudentNotFoundException e) {
			System.out.println("Student not found");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}

	private void print(Collection<Student> students) {
		for(Student s: students)
			System.out.println(s.getName());
	}
}