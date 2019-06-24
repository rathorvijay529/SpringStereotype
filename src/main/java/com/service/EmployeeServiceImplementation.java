package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepo;
import com.entity.EmployeeEntity;
import com.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;

	public Employee processGetEmployee(int id) {
		return empRepo.getEmployee(id);
	}

	public List<Employee> processGetEmployees() {
		return empRepo.getEmployees();
	}

	public void processDelete(int id) {
      empRepo.delete(id);
	}

	public String processSave(Employee emp) {
		return empRepo.save(emp);
	}

	public String processUpdateEmployee(Employee emp,int id) {
		return empRepo.updateEmployee(emp,id);
	}
}
