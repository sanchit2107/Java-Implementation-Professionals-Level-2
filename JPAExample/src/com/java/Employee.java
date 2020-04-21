package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptable")
public class Employee {
	
	@Id
	private int empid;
	private String name;
	private int salary;
	


	/**
	 * @param empid
	 * @param name
	 * @param salary
	 */
//	public Employee(int empid, String name, int salary) {
//		super();
//		this.empid = empid;
//		this.name = name;
//		this.salary = salary;
//	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
