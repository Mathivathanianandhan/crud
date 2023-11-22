package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.spring.boot.entity.School;

public interface SchoolRepository extends JpaRepository<School,Integer> {

}
