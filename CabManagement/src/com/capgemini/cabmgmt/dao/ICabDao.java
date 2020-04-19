package com.capgemini.cabmgmt.dao;

import java.util.Set;

import com.capgemini.cabmgt.entities.Cab;

public interface ICabDao {

		public void addCab(Cab c);
		
		public void removeCab(Cab c);
		
		Cab findCabById(String id);
		
		Set<Cab> allCabs();
}
