package com.capgemini.java.training.multithreading;

class Table {
	public synchronized void multiplication(int n) {
		for (int i = 1; i <= 10; i++)
			System.out.println(n + " * 		" + i + " = " + (i * n));
	}
}

class Thread1 extends Thread {

	Table t;

	public Thread1(Table t1) {
		super();
		this.t = t1;
	}

	public void run() {
		t.multiplication(5);
	}
}

class Thread2 extends Thread {

	Table t;

	public Thread2(Table t1) {
		super();
		this.t = t1;
	}

	public void run() {
		t.multiplication(2);
	}
}

class Thread3 extends Thread {

	Table t;

	public Thread3(Table t1) {
		super();
		this.t = t1;
	}

	public void run() {
		t.multiplication(8);
	}
}

class Thread4 extends Thread {

	Table t;

	public Thread4(Table t1) {
		super();
		this.t = t1;
	}

	public void run() {
		t.multiplication(10);
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {

		Table t1 = new Table();
		Thread1 tt1 = new Thread1(t1);
		tt1.start();
		
		Table t2 = new Table();
		Thread2 tt2 = new Thread2(t2);
		tt2.start();
		
		Table t3 = new Table();
		Thread3 tt3 = new Thread3(t3);
		tt3.start();
		
		Table t4 = new Table();
		Thread4 tt4 = new Thread4(t4);
		tt4.start();

	}

}
