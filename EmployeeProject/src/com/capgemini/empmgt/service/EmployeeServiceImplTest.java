package com.capgemini.empmgt.service;

import java.util.Map;

import org.junit.*;

import com.capgemini.empmgt.dao.EmployeeDaoImpl;
import com.capgemini.empmgt.entities.Employee;
import com.capgemini.empmgt.exceptions.EmployeeNotFoundException;
import com.capgemini.empmgt.exceptions.IncorrectIdException;

public class EmployeeServiceImplTest {
	
		EmployeeServiceImpl service;
		
		@Before
		public void setup() {
			service = new EmployeeServiceImpl(new EmployeeDaoImpl());
		}
		
		@Test(expected = EmployeeNotFoundException.class)
		public void findById_1() {
			int id = 1;
			service.findEmployeeById(id);
		}
		
		@Test(expected = IncorrectIdException.class)
		public void findById_2() {
			int id = -1;		
		    service.findEmployeeById(id);
		}		
		
		@Test
		public void findById_3() {
			int id = 1;
			String name = "EMp2";
			Employee emp = new Employee(id, name);
			Map<Integer, Employee> store = EmployeeDaoImpl.getStore();
			store.put(id, emp);
			Employee result = service.findEmployeeById(id);
			Assert.assertNotNull(result);
			Assert.assertEquals(id, result.getId());
			Assert.assertEquals(name, result.getName());
		}
}
