package com.capgemini.sam;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

class EmployeeClass {
	private int empid;
	private String name;

	public EmployeeClass(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

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

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (obj == this)
			return true;
		EmployeeClass emp = (EmployeeClass) obj;
		return (emp.getEmpid() == this.getEmpid() && emp.getName() == this.getName());
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode() + this.empid;
	}

}

public class AddEmployeeObjectIntoHashSet {
	public static void main(String[] args) {
		EmployeeClass emp1 = new EmployeeClass(101, "Sanchit");
		EmployeeClass emp2 = new EmployeeClass(101, "Sanchit");

		System.out.println(emp1.equals(emp2));
		Set<Object> arrlist = new HashSet<>();
		arrlist.add(emp1);
		arrlist.add(emp2);

		arrlist.forEach(System.out::println);

	}

}
