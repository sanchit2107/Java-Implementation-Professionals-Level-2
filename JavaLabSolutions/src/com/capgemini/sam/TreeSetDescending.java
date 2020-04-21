package com.capgemini.sam;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDescending {
	public static void main(String args[]) {
		
		TreeSet<Object> treeset = new TreeSet<Object>();
		
		treeset.add(2);
		treeset.add(20);
		treeset.add(10);
		treeset.add(5);
		treeset.add(7);
		treeset.add(3);
		
		// getting the reverse order view of element 
        // using descendingSet() method 
        NavigableSet<Object> 
        treereverse = treeset.descendingSet(); 

		
		Iterator<Object> itr = treereverse.iterator();
		System.out.println("TreeSet are as follows: " + treereverse);
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
	}
}
