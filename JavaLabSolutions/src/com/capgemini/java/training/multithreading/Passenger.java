package com.capgemini.java.training.multithreading;

public class Passenger extends Thread {

	private int seatsNeeded;
	public Passenger(int seats, Runnable target, String name) {
		super(target, name);
		this.seatsNeeded = seats;
	}

	public int getSeatNeeded() {
		return seatsNeeded;
	}
	
}
