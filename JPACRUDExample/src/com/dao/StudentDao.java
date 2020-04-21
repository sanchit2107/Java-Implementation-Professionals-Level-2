package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.bean.Student;
import com.config.MyFactory;

public class StudentDao {

	EntityManager em = MyFactory.getEntityManager();

	public String createStudent(Student s) {

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(s);
		tx.commit();
		return "Student saved!!!";
	}
	
	public Student getStudent(int sid) {

		Student std = em.find(Student.class, sid);
		return std;
	}
	
	public String deleteStudent(int sid) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student std = em.find(Student.class,  sid);
		em.remove(std);
		tx.commit();
		return "Student Deleted!!!";
	}
	
	public String updateStudentAge(int sid, int age, String name) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Student std = em.find(Student.class, sid);
		if(std != null) {
			std.setAge(age);
			std.setName(name);
			em.persist(std);
			tx.commit();
			return "Updated Successfully";
		}
		else
		{
			return "ID not found!!";
		}
	}
}
