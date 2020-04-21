package org.capgemini.hotelmgmt.ui;

import java.util.Collection;
import java.util.Set;

import org.capgemini.hotelmgmt.dao.GuestDaoImpl;
import org.capgemini.hotelmgmt.entities.Guest;
import org.capgemini.hotelmgmt.exceptions.GuestNotFoundException;
import org.capgemini.hotelmgmt.exceptions.IncorrectIdException;
import org.capgemini.hotelmgmt.services.GuestServiceImpl;
import org.capgemini.hotelmgmt.services.IGuestService;

public class GuestUi {
	
	private IGuestService service = new GuestServiceImpl(new GuestDaoImpl());

	public static void main(String[] args) {
		GuestUi guestui = new GuestUi();
		guestui.runUi();
	}

	private void runUi() {
		try {
			Guest g1 = new Guest(1, "Guest-1", 1200);
			Guest g2 = new Guest(2, "Guest-2", 1000);
			service.addguest(g1);
			service.addguest(g2);
			
			Guest fetched1 = service.findGuestById(1);
			Guest fetched2 = service.findGuestById(2);
			
			System.out.println("Id=1 "+ fetched1.getName());
			System.out.println("Id=2 "+ fetched2.getName());
			System.out.println("********Printing all Guests****");
			Set<Guest> guests = service.allGuests();
			print(guests);
		}
		catch(IncorrectIdException e) {
			System.out.println("Invalid ID..");
		}
		catch(GuestNotFoundException e) {
			System.out.println("Guest Not Found..");
		}
		catch(Exception e) {
			System.out.println("Something went wrong..");
		}
	}

	private void print(Collection<Guest> guests) {
		for(Guest g: guests)
			System.out.println(g.getName());
	}

}
