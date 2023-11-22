package com.employeemanagement.spring.boot.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CustomerDTO {
	private String name;
	private String email;
	private String address;
	List<OrderDTO> orderDto=new ArrayList<>();
	}
	

