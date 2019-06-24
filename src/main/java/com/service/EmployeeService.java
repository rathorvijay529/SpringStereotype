package com.service;

import java.util.List;

import com.entity.EmployeeEntity;
import com.model.Employee;

public interface EmployeeService {
	public Employee processGetEmployee(int id);

	public List<Employee> processGetEmployees();
	
	public void processDelete(int id);
	
	public String processSave(Employee emp);
	
	public String processUpdateEmployee(Employee emp,int id);
 
}
