package com.capgemini.cabmgt.services;

import java.util.Set;

import com.capgemini.cabmgt.entities.Cab;

public interface ICabService {
	public void addCab(Cab c);
	
	public void removeCab(Cab c);
	
	Cab findCabById(String id);
	
	Set<Cab> allCabs();

}
