package com.dao;

import java.util.List;

import com.entity.EmployeeEntity;
import com.model.Employee;

public interface EmployeeRepo {
	public Employee getEmployee(int id);

	public List<Employee> getEmployees();
	
	public void delete(int id);
	
	public String save(Employee emp);
	
	public String updateEmployee(Employee emp, int id);

}
