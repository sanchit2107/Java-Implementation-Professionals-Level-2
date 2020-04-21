package com.capgemini.sam;

import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Singhal", "Sanchit", 10000, 1);
		Employee e2 = new Employee("Garg", "Osho", 20000, 2);
		Employee e3 = new Employee("Aggarwal", "Riya", 30000, 3);
		
		Set<Employee> empset = new TreeSet(new EmployeeComparator());
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		
		SetEx example = new SetEx();
		example.displayByForEach(empset);
		empset.remove(e1);
		System.out.println("After Removing e1: ");
		example.displayByForEach(empset);
		System.out.println("Display: ");
		example.displayByForEach(empset);
	}

	private void displayByForEach(Set<Employee> empset) {
		for(Employee e: empset)
			System.out.println(e.getSalary() + " " +e.getLastname());
	}
	
	
}
