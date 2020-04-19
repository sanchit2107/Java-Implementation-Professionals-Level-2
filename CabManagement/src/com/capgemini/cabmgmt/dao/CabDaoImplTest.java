package com.capgemini.cabmgmt.dao;

import java.util.Map;

import org.junit.*;

import com.capgemini.cabmgt.entities.Cab;
import com.capgemini.cabmgt.exceptions.CabNotFoundException;

public class CabDaoImplTest {
	
	CabDaoImpl dao;
	
	@Before
	public void setup() {
		dao = new CabDaoImpl();
	}
	
	@Test
	public void testFindCabById_1() {
		String id= "A1";
		String model = "maruti";
		Cab cb = new Cab(id, model);
		Map<String, Cab> store = dao.getStore();
		store.put(id, cb);
		Cab result = dao.findCabById(id);
		Assert.assertNotNull(result);
		Assert.assertEquals(id, result.getId());
		Assert.assertEquals(model, result.getModel());	
	}
	
	@Test(expected = CabNotFoundException.class)
	public void testFindCabById_2() {
		String id= "A2";
		String model = "SWIFT";
//		Cab cb = new Cab(id, model);
//		Map<String, Cab> store = dao.getStore();
		Cab result = dao.findCabById(id);
	}
}
