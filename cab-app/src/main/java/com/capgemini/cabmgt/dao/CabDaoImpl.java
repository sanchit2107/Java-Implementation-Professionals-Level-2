package com.capgemini.cabmgt.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.capgemini.cabmgt.entities.Cab;
import com.capgemini.cabmgt.exceptions.CabNotFoundException;
import com.capgemini.cabmgt.exceptions.IncorrectIdException;
import com.capgemini.cabmgt.services.CabServiceImpl;

public class CabDaoImpl implements ICabDao {

	private Map<String, Cab> store = new HashMap<>();
	
	
	@Override
	public void addCab(Cab c) {
		store.put(c.getId(), c);
		
	}

	@Override
	public void removeCab(Cab c) {
		store.remove(c.getId());
		
	}

	@Override
	public Cab findCabById(String id) {
	 Cab cbyid = store.get(id);
	 if(cbyid == null || cbyid.getId() == "" )
		 throw new CabNotFoundException("Cab Not Found..");
     return cbyid;
		
	}

	@Override
	public Set<Cab> allCabs() {
		Collection<Cab> cabcoll = store.values();
		Set<Cab> cabset = new HashSet<>(cabcoll);
		return cabset;
	}
	public Map<String, Cab> getStore() {
		return store;
	}
	
	
}
