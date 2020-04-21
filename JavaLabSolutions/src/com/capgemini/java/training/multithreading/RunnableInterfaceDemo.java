package com.capgemini.java.training.multithreading;

public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		
		CreatingThread m1 = new CreatingThread();
		Thread t1 = new Thread(m1, "Lunch Thread");
		t1.start();
		
		System.out.println("");
	}

}
