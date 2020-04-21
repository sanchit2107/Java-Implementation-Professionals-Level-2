package com.capgemini.sam;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray {
	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<String>(); 
		
		arr.add("user1");
		arr.add("user2");
		
		Iterator<String> i = arr.iterator();
		System.out.println("The iterator values are as:");
		
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	}
}
