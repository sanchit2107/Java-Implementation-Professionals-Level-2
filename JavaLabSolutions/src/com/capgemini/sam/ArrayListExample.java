package com.capgemini.sam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Singhal", "Sanchit", 20000, 1);
		Employee e2 = new Employee("garg", "Vatsal", 100000, 2);
		
		list.add(e1);
		list.add(e2);
		
		int size = list.size();
		System.out.println("Size: "+ size);
		
//		Object o = list.get(0);
		Employee e = list.get(0);
		
		System.out.println(e.getLastname() + ":" + e.getSalary());
		ArrayListExample exp = new ArrayListExample();
		exp.display(list);
		
		System.out.println("display by for each: ");
		exp.displayByForEach(list);
	}
	
	public void displayByForEach(List<Employee> list) {
		for(Employee e: list) {
			System.out.println(e.getLastname() + ":" + e.getSalary());
		}
	}
	
	public void display(List<Employee> list) {
		for(int i=0; i<list.size(); i++) {
			Employee e = list.get(i);
			System.out.println(e.getLastname() + ": "+ e.getSalary());
		}
	}
}
