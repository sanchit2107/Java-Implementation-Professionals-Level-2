package com.capgemini.sam;

public class TestEmployee{
	
	public static void main(String args[]){
		Employee e = new Employee("Sanchit", "Ramesh", 20000, 1001);
		e.printAllInfo();
		e.addBonus(5);
		e.printAllInfo();
		
	}
}