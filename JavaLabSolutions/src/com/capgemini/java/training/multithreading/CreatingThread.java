package com.capgemini.java.training.multithreading;

public class CreatingThread extends Thread {

	public void run() {
		
		for(int i=1; i<10; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println(i + " Thread Called -- "+ Thread.currentThread().getName() );
			System.out.println("Current Thread -- " + Thread.currentThread());
		}
			
	}

}
