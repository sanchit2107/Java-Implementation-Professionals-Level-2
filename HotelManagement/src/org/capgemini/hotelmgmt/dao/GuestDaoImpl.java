package org.capgemini.hotelmgmt.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.capgemini.hotelmgmt.entities.Guest;
import org.capgemini.hotelmgmt.exceptions.GuestNotFoundException;
import org.capgemini.hotelmgmt.services.GuestServiceImpl;

public class GuestDaoImpl implements IGuestDao {

	private Map<Integer, Guest> store = new HashMap<Integer, Guest>();
	
	@Override
	public void addGuest(Guest g) {
		store.put(g.getId(), g);
	}

	@Override
	public void remove(Guest g) {
		store.remove(g.getId());
		
	}
	
	@Override
	public Guest findGuestById(int id) {
		
		Guest g = store.get(id);
		if(g == null)
			throw new GuestNotFoundException("Guest Not found");
		return g;
	}

	@Override
	public Set<Guest> allGuest() {
		Collection<Guest> guestColl = store.values();
		Set<Guest> guestset = new HashSet<>(guestColl);
		return guestset;
	}
}
