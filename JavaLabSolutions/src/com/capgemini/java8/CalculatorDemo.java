package com.capgemini.java8;

import java.util.ArrayList;

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c1 = (a, b) -> a/b;
		System.out.println(c1.div(123, 78));
		System.out.println(c1.div(13, 5));
		System.out.println(c1.div(12, 8));
		System.out.println(c1.div(1233, 18));
		
		Calculator c2 = (a, b) -> a+b;
		System.out.println(c2.div(123, 78));
		
		Calculator c3 = (a, b) -> a-b;
		System.out.println(c3.div(123, 78));
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Suma");
		list.add("Bhanu");
		list.add("Mohit");
		list.add("Maghes");
		
		
		list.forEach((s) ->
		{
			if(s.concat("xyz") != null) 
				System.out.println(s.concat(" xyz"));
		}
		);
		
	}

}
