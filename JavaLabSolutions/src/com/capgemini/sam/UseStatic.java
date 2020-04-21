package com.capgemini.sam;

public class UseStatic {
	static int num1 = 3;
	static int num2;
	
	static {
		System.out.println("Static block initialized");
		int num2 = num1*4;
	}
	static void myMethod(int num3) {
		System.out.println("Number 3= " + num3);
		System.out.println("Number 1= " + num1);
		System.out.println("Number 2= " + num2);
	}
	
	public static void main(String args[]) {
		myMethod(42);
	}
}
