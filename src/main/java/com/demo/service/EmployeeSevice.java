package com.demo.service;

import java.util.List;
import com.demo.model.Employee;

public interface EmployeeSevice {

	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	public void deleteEmployeeById(long id);
}

