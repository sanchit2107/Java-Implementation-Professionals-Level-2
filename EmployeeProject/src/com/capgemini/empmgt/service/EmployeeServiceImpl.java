package com.capgemini.empmgt.service;

import com.capgemini.empmgt.dao.IEmployeeDao;
import com.capgemini.empmgt.entities.Employee;
import com.capgemini.empmgt.exceptions.IncorrectIdException;

import java.util.Set;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDao dao;

    public EmployeeServiceImpl(IEmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public void addEmployee(Employee e) {
        dao.addEmployee(e);
    }

    @Override
    public Employee findEmployeeById(int id) {
        if (id <= 0) {
            throw new IncorrectIdException("id is incorrect");
        }
        Employee e = dao.findEmployeeById(id);
        return e;
    }

    @Override
    public Set<Employee> allEmployees() {
        Set<Employee> employees = dao.allEmployees();
        return employees;
    }
}
