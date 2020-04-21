package com.capgemini.empmgt.dao;

import org.junit.*;

import com.capgemini.empmgt.entities.Employee;
import com.capgemini.empmgt.exceptions.EmployeeNotFoundException;


public class EmployeeDaoImplTest {
	
	EmployeeDaoImpl dao;
	
	@Before
	public void setup() {
		dao = new EmployeeDaoImpl();
	}
	
	@Test(expected = EmployeeNotFoundException.class)
	public void testAdd_1() {
		int id = 1;
		String name = "Emp1";
		
		Employee result = dao.findEmployeeById(id);
	}
}
