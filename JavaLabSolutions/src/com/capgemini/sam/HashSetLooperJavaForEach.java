package com.capgemini.sam;

import java.util.*;

public class HashSetLooperJavaForEach {
	public static void main(String args[])
	{
	
		Set<String> setOfBooks = new HashSet<>(); 
		setOfBooks.add("Effective Java"); 
		setOfBooks.add("Clean Code");
		setOfBooks.add("Refactoring"); 
		setOfBooks.add("Head First Java"); 
		setOfBooks.add("Clean Coder"); 
		
		
		// iterating over HashSet using forEach() method in Java 8 
		setOfBooks.forEach(System.out::println);
	}
		
}
