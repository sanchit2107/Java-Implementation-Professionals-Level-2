package com.capgemini.empmgt.service;

import com.capgemini.empmgt.entities.Employee;

import java.util.Set;

public interface IEmployeeService {
    void addEmployee(Employee e);

    Employee findEmployeeById(int id);

    Set<Employee> allEmployees();
}
