package com.SpringStereotype;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configuration.Config;
import com.entity.EmployeeEntity;
import com.model.Employee;
import com.service.EmployeeServiceImplementation;

/**
 * @author vbopche
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EmployeeServiceImplementation employeeServiceImplementation = (EmployeeServiceImplementation) context
				.getBean("employeeServiceImplementation");

		// -------------------------------------------------Save--------------------------------------------------------
		Employee emp1 = new Employee(11, 32, "vijeta");
		Employee emp2 = new Employee(111, 28, "divya");
		Employee emp3 = new Employee(222, 48, "priya");

	employeeServiceImplementation.processSave(emp1);
	employeeServiceImplementation.processSave(emp2);
		employeeServiceImplementation.processSave(emp3);
//
//		// -------------------------------------------------getAllEmployee-------------------------------------------------
//		Employee singleEmp = employeeServiceImplementation.processGetEmployee(111);
//		System.out.println("Get Emplyee by ID " + singleEmp);
//		List<Employee> employees = employeeServiceImplementation.processGetEmployees();
//		for (Employee emp : employees) {
//
//			System.out.println(emp);
//		}
//		// -------------------------------------------------Delete by ID-----------------------------------------------------
//		employeeServiceImplementation.processDelete(1);
//
//		
//		System.out.println("Employees after delete operation");
//
//		// ----------------------------------getAllEmployees After Delete Operation-------------------------------------------
//		List<Employee> employees1 = employeeServiceImplementation.processGetEmployees();
//		for (Employee emp : employees1) {
//
//			System.out.println(emp);
//		}

		// -------------------Update-------------------------------------------------------------------------------------------
		/*emp1.setName("Vasuu");
		emp1.setAge(30);
		employeeServiceImplementation.processUpdateEmployee(emp1,11);*/
		context.close();
	}

}