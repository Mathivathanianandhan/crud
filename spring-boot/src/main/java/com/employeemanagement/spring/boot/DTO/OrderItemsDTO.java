package com.employeemanagement.spring.boot.DTO;

import lombok.Data;

@Data
public class OrderItemsDTO {
	private String product;
	private String price;
	private String quantity;
}
