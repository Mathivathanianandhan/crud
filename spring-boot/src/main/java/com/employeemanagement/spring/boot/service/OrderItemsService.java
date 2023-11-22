package com.employeemanagement.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.repository.OrderItemsRepo;

@Service
public class OrderItemsService {
@Autowired
private OrderItemsRepo orderItemsRepo;
}
