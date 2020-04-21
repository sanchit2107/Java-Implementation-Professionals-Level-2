package com.capgemini.java.training.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		CreatingThread t1 = new CreatingThread();
		t1.setName("My Thread-1 ");
		
		t1.setDaemon(true);   // treated as background thread and can only be set before starting the thread
		t1.start();
		
		System.out.println("Deomon or not -- "+ t1.isDaemon());
		System.out.println("My Thread-1 ID -- "+ t1.getId());
		
		CreatingThread t2 = new CreatingThread();
		t2.setName("My Thread-2 ");
		t2.start();
		
		t2.setPriority(Thread.MAX_PRIORITY - 1);
		System.out.println("Current Thread in main-- " + Thread.currentThread());
		System.out.println("Priority: " + t1.getPriority() + " " + t2.getPriority());
		System.out.println("My Thread-2 ID -- "+ t2.getId());
		
		System.out.println("Thread State -- " + t1.isAlive());
		
		t1.join();   // t1.join(500);
		t2.join();
		
		System.out.println("Thread State -- " + t1.isAlive());
		
		System.out.println("--End of main thread--");
	}

}
