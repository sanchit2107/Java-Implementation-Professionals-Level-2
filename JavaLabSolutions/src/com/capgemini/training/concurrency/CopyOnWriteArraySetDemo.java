package com.capgemini.training.concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Shyam");
		set.add("Ram");
		
		CopyOnWriteArraySet<String> cset = new CopyOnWriteArraySet<>();
		// Thread Safe version of ArraySet
		
		cset.add("Shyaam");
		cset.add("Ramayan");
		cset.addAll(set);
		cset.add("Rama");
		cset.add("Rama");
		cset.add("Rama");
		System.out.println(cset);
	}

}
