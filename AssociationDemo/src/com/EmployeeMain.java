package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		/*
		 * EntityTransaction tx=em.getTransaction(); tx.begin(); Address add=new
		 * Address(103, "Pune", "India",824113); Employee e=new Employee("Urvashi",
		 * 82000, add); em.persist(e); tx.commit();
		 */
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Address add=em.find(Address.class, 102);
		System.out.println(add.getCity()+"\t"+add.getCountry()+"\t"+add.getZip());
		em.remove(add);
		tx.commit();
		System.out.println("Employee Removed!!!!!");
		
		

	}

}
