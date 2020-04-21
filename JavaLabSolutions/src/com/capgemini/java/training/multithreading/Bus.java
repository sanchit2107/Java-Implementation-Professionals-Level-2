package com.capgemini.java.training.multithreading;

public class Bus implements Runnable {
	
	private int totalSeatsAvailable;
	private String name;
	
	public Bus(int totalSeats, String name) {
		// super(name);   cannot use super here
		
		this.totalSeatsAvailable = totalSeats;
		this.name = name;
	}
	
	@Override
	public void run() {
		Passenger pt = (Passenger)Thread.currentThread();
		boolean ticketBooked = this.bookTicket(pt.getSeatNeeded(), pt.getName());
		
		if(ticketBooked == true) {
			System.out.println("Congrats "+ Thread.currentThread().getName() + " The number of seats requested " 
		+ pt.getSeatNeeded() + " booked");		
		}
		else {
			System.out.println("Sorry "+ Thread.currentThread().getName() +
					" requested " +pt.getSeatNeeded() + " not booked");
		}
	}

	private boolean bookTicket(int seatsNeeded, String name) {
		
		System.out.println("Welcome to "+ this.getName()  + Thread.currentThread().getName());
		System.out.println("Number of tickets available "+this.getTotalSeatsAvailable());
		
		if(seatsNeeded > this.getTotalSeatsAvailable())
			return false;
		else {
			totalSeatsAvailable = totalSeatsAvailable - seatsNeeded;
			return true;
		}
	}

	private String getName() {
		
		return name;
	}

	private int getTotalSeatsAvailable() {

		return totalSeatsAvailable;
	}
}
