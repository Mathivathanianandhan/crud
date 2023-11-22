package com.employeemanagement.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.DTO.CustomerDTO;
import com.employeemanagement.spring.boot.DTO.OrderDTO;
import com.employeemanagement.spring.boot.DTO.OrderItemsDTO;
import com.employeemanagement.spring.boot.entity.Customer;
import com.employeemanagement.spring.boot.entity.Order;
import com.employeemanagement.spring.boot.entity.OrderItems;
import com.employeemanagement.spring.boot.repository.CustomerRepo;
import com.employeemanagement.spring.boot.repository.OrderItemsRepo;
import com.employeemanagement.spring.boot.repository.OrderRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	private OrderRepo orderRepo;
	private OrderItemsRepo orderItemsRepo;
	
	
	public Customer createCustomer(CustomerDTO customerDto)
	{
		Customer customer=new Customer();
		customer.setName(customerDto.getName());
		customer.setEmail(customerDto.getEmail());
		customer.setAddress(customerDto.getAddress());
		List<Order> orders=new ArrayList<>();
		for(OrderDTO orderDto:customerDto.getOrderDto())	{
			Order order=new Order();
			order.setOrderDate(orderDto.getOrderDate());
			order.setShippingAddress(orderDto.getShippingAddress());
			order.setTotalAmount(orderDto.getTotalAmount());
			List<OrderItems> orderItems=new ArrayList<>();
			
			for(OrderItemsDTO orderItemsDto:orderDto.getOrderItemsDto())
					{
				OrderItems orderItems1=new OrderItems();
				orderItems1.setProduct(orderItemsDto.getProduct());
				orderItems1.setPrice(orderItemsDto.getPrice());
				orderItems1.setQuantity(orderItemsDto.getQuantity());
				orderItems.add(orderItems1);
					}
			order.setCustomer(customer);
			order.setOrderItems(orderItems);
			orders.add(order);
		}
		customer.setOrders(orders);
		return customerRepo.saveAndFlush(customer);
					
					}
	
	}

