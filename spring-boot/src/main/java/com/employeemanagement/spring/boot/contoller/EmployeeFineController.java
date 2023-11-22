package com.employeemanagement.spring.boot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.entity.EmployeeFine;
import com.employeemanagement.spring.boot.service.EmployeeFineService;

@RestController
@RequestMapping("/api/fine")
public class EmployeeFineController {
	@Autowired
	private EmployeeFineService employeeFineService;
	
	
	@PostMapping("/create")
	public EmployeeFine create(@RequestBody EmployeeFine ebEmployeeFineObj) {
		return employeeFineService.create(ebEmployeeFineObj);
		
		
	}

}
