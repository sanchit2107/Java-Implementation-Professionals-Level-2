package com.capgemini.sam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[]) {
		
		//Creating HashSet and adding elements  
		  
		  //ArrayList<String> set=new ArrayList<String>();  
		  HashSet<String> set=new HashSet<String>(); 
		  
		  //TreeSet set=new TreeSet(); 
		  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  
		  //System.out.println("HeadSet: "+set.headSet("syaz"));
		  
		  
		  //Traversing elements  
		  Iterator itr=set.iterator();  
		  while(itr.hasNext()){  
			  
		   System.out.println(itr.next()); 
		  }
		  
		  
		  /*
			public static void main(String[] args) {
				HashSet hsName=new HashSet();
				TreeSet tsName=new TreeSet();
				System.out.println("Array: [");
				for (int i = 0; i < args.length; i++) {
					hsName.add(args[i]);
					tsName.add(args[i]);
					System.out.print(args[i]+" ");
				}
				System.out.println("]");
				System.out.println("HashSet: "+hsName);
				System.out.println("TreeSet: "+tsName);
				System.out.println("HeadSet: "+tsName.headSet("syaz"));
			}
			
			*/
	}
}
