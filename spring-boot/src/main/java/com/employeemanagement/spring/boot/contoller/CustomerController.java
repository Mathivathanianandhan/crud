package com.employeemanagement.spring.boot.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.DTO.CustomerDTO;
import com.employeemanagement.spring.boot.entity.Customer;
import com.employeemanagement.spring.boot.service.CustomerService;

@RestController
@RequestMapping("/api/custo")
public class CustomerController {
private CustomerService customerService;
@PostMapping("/postcus")
public Customer createCustomer(@RequestBody CustomerDTO customerDto)
{
	return customerService.createCustomer(customerDto);
}
}
