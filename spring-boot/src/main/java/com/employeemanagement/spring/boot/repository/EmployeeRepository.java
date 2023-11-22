package com.employeemanagement.spring.boot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.spring.boot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
Optional<Employee> findById(int id);
}
