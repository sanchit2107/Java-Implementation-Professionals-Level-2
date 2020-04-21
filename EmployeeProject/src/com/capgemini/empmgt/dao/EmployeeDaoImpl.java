package com.capgemini.empmgt.dao;

import com.capgemini.empmgt.entities.Employee;
import com.capgemini.empmgt.exceptions.EmployeeNotFoundException;

import java.util.*;

public class EmployeeDaoImpl implements IEmployeeDao {
    private static Map<Integer, Employee> store = new HashMap<>();

    @Override
    public void addEmployee(Employee e) {
        store.put(e.getId(), e);
    }

    @Override
    public Employee findEmployeeById(int id) {
        Employee e = store.get(id);
        if (e == null) {
            throw new EmployeeNotFoundException("employee not found for id=" + id);
        }
        return e;
    }

    @Override
    public Set<Employee> allEmployees() {
        Collection<Employee> employees = store.values();
        Set<Employee> employeeSet = new HashSet<>(employees);
        return employeeSet;
    }

	public static Map<Integer, Employee> getStore() {
		
		return store;
	}
}
