//ConcurrentCOllections
package com.capgemini.training.concurrency;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{

	static ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
    @Override
    public void run() {
	  try {
		  Thread.sleep(2000);
		
	  }catch(InterruptedException e) {
		 e.printStackTrace();
	}
	  chm.put(35,"aish");
}
	public static void main(String[]args) throws InterruptedException {
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
		chm.put(12,"abhi");
		chm.put(13, "ram");
		chm.put(14,"rex");
		chm.put(15,"wax");
		chm.putIfAbsent(14,"pal");
		System.out.println(chm);
		chm.remove(15);
		System.out.println(chm);
		chm.replace(13,"ram","emar");
		System.out.println(chm);
		ConcurrentHashMapDemo demoThread=new ConcurrentHashMapDemo();
		demoThread.start();
		Set set=chm.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			int i1=(int)obj;
			System.out.println("main thread is running");
			System.out.println("Current keys"+i1+" "+chm.get(i1));
			Thread.sleep(1000);
			System.out.println(chm);
		}
	}
}
