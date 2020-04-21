package org.capgemini.hotelmgmt.services;

import java.util.Set;

import org.capgemini.hotelmgmt.entities.Guest;

public interface IGuestService {
	
		void addguest(Guest g);
		
		public void remove(Guest g);
	
		Guest findGuestById(int id);
		
		Set<Guest> allGuests();
}
