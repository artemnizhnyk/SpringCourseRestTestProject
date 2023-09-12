package com.artemnizhnyk.springrest.service;

import com.artemnizhnyk.springrest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
