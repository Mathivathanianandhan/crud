package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.spring.boot.entity.OrderItems;

@Repository
public interface OrderItemsRepo extends JpaRepository<OrderItems,Integer>  {



}
