package com.capgemini.java.training.multithreading;

class Market {

	private boolean isEven = true;

	public void produce(int number) throws InterruptedException {
		synchronized (this) {
			if (!isEven)
				wait();
			System.out.println("Producer -- " + number);
			isEven = false;
			notify();
		}
	}

	public void consume(int number) throws InterruptedException {
		synchronized (this) {
			if (isEven)
				wait();
			System.out.println("Consumer -- " + number);
			isEven = true;
			notify();
		}
	}
}

class Producer extends Thread {

	Market m;
	public Producer(Market m1) {
		this.m = m1;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			try {
				m.produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}

class Consumer extends Thread {

	Market m;
	public Consumer(Market m1) {
		this.m = m1;

	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			try {
				m.consume(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {

		Market m1 = new Market();
		Producer p1 = new Producer(m1);
		Consumer c1 = new Consumer(m1);
		p1.start();
		c1.start();
		
	}

}
