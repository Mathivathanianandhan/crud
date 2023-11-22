package com.employeemanagement.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.entity.EmployeeFine;
import com.employeemanagement.spring.boot.repository.EmployeeFineRepo;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class EmployeeFineService {
		@Autowired
		private EmployeeFineRepo employeeFineRepo;
	
	public EmployeeFine create(EmployeeFine employeeObj)
	{
		return employeeFineRepo.save(employeeObj);
	
	}
}
