package com.jcombat.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jcombat.bean.Employee;

@RestController
@RequestMapping(value = "/api/Employee")
public class EmployeeController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Employee process(
			@PathVariable("name") String name,
			@RequestParam(value = "empId", required = false, defaultValue = "00000") final String id) {
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setName(name);
		return employee;
	}
}