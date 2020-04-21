package com.capgemini.java.training.multithreading;

public class BusReservationApp {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus(20, "Capgemini Bus-1 ");
		Passenger p11 = new Passenger(12, bus1, "Sanchit");
		Passenger p12 = new Passenger(12, bus1, "Osho");
		p11.start();
		p12.start();
		
		Bus bus2 = new Bus(20, "Capgemini Bus-2 ");
		Passenger p21 = new Passenger(12, bus2, "Sanchit");
		Passenger p22 = new Passenger(12, bus2, "Osho");
		p21.start();
		p22.start();
	}

}
