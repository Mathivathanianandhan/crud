package com.employeemanagement.spring.boot.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class OrderDTO {
	private Date OrderDate;
	private String shippingAddress;
	private double totalAmount;
	List<OrderItemsDTO> orderItemsDto=new ArrayList<>();
	}

