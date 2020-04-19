package com.capgemini.cabmgt.ui;

import java.util.Set;

import com.capgemini.cabmgmt.dao.CabDaoImpl;
import com.capgemini.cabmgmt.dao.ICabDao;
import com.capgemini.cabmgt.entities.Cab;
import com.capgemini.cabmgt.exceptions.CabNotFoundException;
import com.capgemini.cabmgt.exceptions.IncorrectIdException;
import com.capgemini.cabmgt.services.CabServiceImpl;
import com.capgemini.cabmgt.services.ICabService;

public class CabUi {

	private ICabService service = new CabServiceImpl(new CabDaoImpl());
	
	public static void main(String[] args) {
		
		CabUi cu = new CabUi();
		cu.runUi();

	}

	private void runUi() {
		try {
			Cab c1 = new Cab("101A", "SWIFT");
			Cab c2 = new Cab("102A", "BALENO");
			service.addCab(c1);
			service.addCab(c2);
			
			Cab fetch1 = service.findCabById("101A");
			Cab fetch2 = service.findCabById("102A");
			
			System.out.println("ID = " + c1.getId() + "   MODEL = "  +  fetch1.getModel());
			System.out.println("ID = " + c2.getId() + "   MODEL = " +  fetch2.getModel());
			
			Set<Cab> cabset = service.allCabs();
			print(cabset);
		}
		catch(IncorrectIdException e) {
			System.out.println("Input Id is Incorrect");
		}
		catch(CabNotFoundException e) {
			System.out.println("Cab noy found.. Please try again later");
		}
		
	}

	private void print(Set<Cab> cabset) {
		for(Cab c: cabset) {
			System.out.println(c.getModel());
		}
	}

}
