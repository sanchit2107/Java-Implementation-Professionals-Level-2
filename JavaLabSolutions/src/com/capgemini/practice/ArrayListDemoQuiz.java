package com.capgemini.practice;

import java.util.*;

public class ArrayListDemoQuiz {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(7);
		al.add(1);
		al.add(5);
		al.add(1);
		
		System.out.println(al);
		al.removeAll(Collections.singleton(1));   //al.remove(1);  // a1.remove(3)
		System.out.println(al);
	}

}
