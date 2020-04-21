package com.capgemini.sam;

import java.util.*;

public class ArrayListDemoPrint {

	public static void main(String args[]) {
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		

		// displaying elements
		System.out.println(alist);

		// Adding "Steve" at the fourth position
		alist.add(3, "Steve");

		Iterator<String> itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}