package com.capgemini.training.concurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread{
  public void run() {
	  System.out.println("Thread Working: "+Thread.currentThread().getName());
  }
}
public class ThreadPoolDemo {

	public static void main(String[]args) {
		ExecutorService service=Executors.newFixedThreadPool(20);
		//ExecutorService service=Executors.newCachedThreadPool();
		//ExecutorService service=Executors.newSingleThreadExecutor();
		for(int i=0;i<100;i++) {
			service.execute(new Task());
		}
		System.out.println(Thread.currentThread().getName());
	}
}
