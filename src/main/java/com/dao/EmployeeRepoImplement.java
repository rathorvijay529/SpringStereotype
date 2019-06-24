package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.entity.EmployeeEntity;
import com.model.Employee;

@Repository
public class EmployeeRepoImplement implements EmployeeRepo {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public Employee getEmployee(int id) {
		try {
			Employee employee = jdbctemplate.queryForObject("SELECT * FROM employee where id = ?", new Object[] { id },
					new BeanPropertyRowMapper(Employee.class));
			return employee;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	public List<Employee> getEmployees() {
		return jdbctemplate.query("SELECT * FROM employee", new BeanPropertyRowMapper(Employee.class));

	}

	public void delete(int id) {
		jdbctemplate.update("delete from employee where id = ?", id);
	}

	public String save(Employee emp) {
		
		System.out.println("*******"+jdbctemplate);
		jdbctemplate.update("INSERT INTO employee (id, age, name) VALUES (?, ?, ?)", emp.getId(), emp.getAge(),
				emp.getName());
		return "Sucessfully Inserted";
	}

	public String updateEmployee(Employee emp, int id) {
		jdbctemplate.update("Update employee Set name = ? and age = ? where id= ?", emp.getName(), emp.getAge(),id);
		return "updated";
	}

}
