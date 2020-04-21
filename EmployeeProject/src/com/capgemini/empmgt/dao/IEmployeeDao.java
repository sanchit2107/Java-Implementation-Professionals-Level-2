package com.capgemini.empmgt.dao;

import com.capgemini.empmgt.entities.Employee;

import java.util.Set;

public interface IEmployeeDao {
    void addEmployee(Employee e);

    Employee findEmployeeById(int id);

    Set<Employee> allEmployees();
}
