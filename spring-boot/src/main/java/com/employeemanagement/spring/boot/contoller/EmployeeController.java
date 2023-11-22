package com.employeemanagement.spring.boot.contoller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.entity.Employee;
import com.employeemanagement.spring.boot.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;

	
	@PostMapping("/postEmployee")       
	public void addEmployee(@RequestBody Employee employee)
	{
			employeeService.addEmployee(employee);
	}
	
	@PostMapping("/employeelist")
	public List<Employee> employeeList(@RequestBody List<Employee> employee)
	{
		return employeeService.employeeList(employee);
	}
	@GetMapping("/getEmployee")
	public List<Employee> employeeList()
	{
		return employeeService.getEmployee();
		
	}
	@GetMapping("/getEmployeeById/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee request)
	{
		return employeeService.update(request);
	}
	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable int id)
	{
		employeeService.deleteById(id);
	}
	@DeleteMapping("/delete")
	public void deleteAll(Employee del)
	{
		employeeService.deleteAll(del);
	}
	
}
