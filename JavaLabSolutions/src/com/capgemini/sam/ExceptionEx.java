package com.capgemini.sam;

public class ExceptionEx {

	public static void main(String[] args) {
		ExceptionEx example = new ExceptionEx();
		Employee e = null;
		example.display(e);
		System.out.println("After Display");
		
	}
	
	public void display(Employee e)
	{
		System.out.println(e.getSalary() + "-" + e.getLastname());
		System.out.println("Objects Displayed");
	}

}
