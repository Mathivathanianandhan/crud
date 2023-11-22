package com.employeemanagement.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.DTO.OrderDTO;
import com.employeemanagement.spring.boot.entity.Order;
import com.employeemanagement.spring.boot.repository.OrderRepo;
@Service
public class OrderService {
	@Autowired
	private OrderRepo orderRepo;
	public Order createOrder(OrderDTO orderDto)
	{
		Order order=new Order();
		order.setOrderDate(orderDto.getOrderDate());
		order.setShippingAddress(orderDto.getShippingAddress());
		order.setTotalAmount(orderDto.getTotalAmount());
		return orderRepo.save(order);
		
	}
	
}
