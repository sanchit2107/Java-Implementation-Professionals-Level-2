package org.capgemini.hotelmgmt.services;

import java.util.Set;

import org.capgemini.hotelmgmt.dao.IGuestDao;
import org.capgemini.hotelmgmt.entities.Guest;
import org.capgemini.hotelmgmt.exceptions.IncorrectIdException;

public class GuestServiceImpl implements IGuestService{
	
	private IGuestDao dao;
	

	public GuestServiceImpl(IGuestDao dao) {
		this.dao = dao;
	}

	@Override
	public void addguest(Guest g) {
		dao.addGuest(g);
	}

	@Override
	public Guest findGuestById(int id) {
		if(id < 0)
			throw new IncorrectIdException("Id is Invalid");
		Guest g = dao.findGuestById(id);
		return g;
	}

	@Override
	public Set<Guest> allGuests() {
		Set<Guest> setguest = dao.allGuest();
		return setguest;
	}

	@Override
	public void remove(Guest g) {
		dao.remove(g);
	}

}
