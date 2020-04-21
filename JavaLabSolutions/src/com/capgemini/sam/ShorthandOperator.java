package com.capgemini.sam;

public class ShorthandOperator {
	public static void main(String args[]) {
		int a = 15, b= 10;
		System.out.println("Sum of a+b = "+ (a+= b));
		
		System.out.println("Difference of a-b = "+ (a-= b));
		
		System.out.println("Divsion of a/b = "+ (a/= b));
		
		System.out.println("Modulus of a%b = "+ (a%= b));
		
	}
}
