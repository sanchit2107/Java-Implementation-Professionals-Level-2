package com.capgemini.cabmgt.services;

import java.util.Set;
import com.capgemini.cabmgt.entities.Cab;
import com.capgemini.cabmgt.exceptions.IncorrectIdException;
import com.capgemini.cabmgt.dao.*;
public class CabServiceImpl implements ICabService {
	
	private ICabDao cabdao;
	
	public CabServiceImpl(ICabDao cabdao) {
		this.cabdao = cabdao;
	}
	
	@Override
	public void addCab(Cab c) {
		isValidArgument(c);
		cabdao.addCab(c);
		
	}

	private void isValidArgument(Cab c) {
		// TODO Auto-generated method stub
		if(c == null || c.getId() == "")
			throw new IncorrectIdException("Please Enter Correct Values... INVALID");
	}

	@Override
	public void removeCab(Cab c) {
		isValidArgument(c);
		cabdao.removeCab(c);
		
	}

	@Override
	public Cab findCabById(String id) {
		if(id == null )
			throw new IncorrectIdException("Input ID is Invalid");
		Cab c = cabdao.findCabById(id);
		return c;
	}

	@Override
	public Set<Cab> allCabs() {
		Set<Cab> cabset = cabdao.allCabs();
		return cabset;
	}
}
