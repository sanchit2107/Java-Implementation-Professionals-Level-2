package org.capgemini.hotelmgmt.dao;

import java.util.Set;

import org.capgemini.hotelmgmt.entities.Guest;

public interface IGuestDao {
	
	public void addGuest(Guest g);
	
	public void remove(Guest g);
	
	Guest findGuestById(int id);
	
	Set<Guest> allGuest();
}
