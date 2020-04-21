package com.capgemini.sam;

public class TestEmployee2 {
	public static void main(String args[]) {
	Employee e = new Employee("Sanchit", "Ramesh", 20000, 1001);
	e.printAllInfo();
	e.addBonus(5);
	e.printAllInfo();
	
	PermanentEmployee e2 = new PermanentEmployee("Kumar", "Suresh", 10000, 1001, 100);
	e2.printAllInfo();
	e2.addBonus(5);
	e2.printAllInfo();
	
	e = e2;				// dynamic binding
	e.printAllInfo();
}
}