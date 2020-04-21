package com.capgemini.training.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 extends Thread{
   public void run() {
	   System.out.println("Thread working: "+Thread.currentThread().getName());
   }
}
public class ThreadPoolDemo1 {

	public static void main(String[]args) {
		ScheduledExecutorService service=Executors.newScheduledThreadPool(10);// 10->threads maintained
	    service.schedule(new Task1(),10, TimeUnit.SECONDS);
	    //service.scheduleAtFixedRate(new Task1(), 10, 10,TimeUnit.SECONDS);
	    //service.scheduleWithFixedDelay(new Task1(), 10, 10, TimeUnit.SECONDS);
	}
}
