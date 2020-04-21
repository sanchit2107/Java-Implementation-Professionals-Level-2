package com.capgemini.training.concurrency;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Mohan");
		al.add("Umesh");
		System.out.println(al);
		
		CopyOnWriteArrayList<String> clist = new CopyOnWriteArrayList<>();
		// Thread Safe version of ArrayList
		
		clist.add("Pradeep");
		clist.add("Mohan");
		clist.add("Umesh");
		
		clist.addIfAbsent("Pradeep");
		clist.addAllAbsent(al);
		
		System.out.println(clist);
		clist.removeAll(al);
		System.out.println(clist);

	}

}
