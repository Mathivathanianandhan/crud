package com.employeemanagement.spring.boot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.entity.Employee;
import com.employeemanagement.spring.boot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepository employeeRepository;
	public String addEmployee(Employee employee)
	{
		employeeRepository.save(employee);
		return "Data Saved";
	}
	public List<Employee> employeeList(List<Employee> employee) 
	{
		return employeeRepository.saveAll(employee);
	}
	public List<Employee> getEmployee()
	{
		return employeeRepository.findAll();
	}
	public Optional<Employee> getEmployeeById(int id){
		return employeeRepository.findById(id);
		
	}
	public Employee update(Employee request)
	{
		return employeeRepository.save(request);
	}
	public void deleteById(int id) 
	{
	    employeeRepository.deleteById(id);
		
	}
	public void deleteAll(Employee del)
	{
		employeeRepository.deleteAll();
	}

}
