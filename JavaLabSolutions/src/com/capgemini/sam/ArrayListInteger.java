package com.capgemini.sam;     // check this again

import java.util.*;

public class ArrayListInteger {

	public static void main(String args[]) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		int j =1;
		for(int i: alist)
		{
			alist.add(j);
			j+= 1;
		}

		// displaying elements
		System.out.println(alist);

		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
