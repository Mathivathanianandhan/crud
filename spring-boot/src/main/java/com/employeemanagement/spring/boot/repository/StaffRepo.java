package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.spring.boot.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Integer> {

}
