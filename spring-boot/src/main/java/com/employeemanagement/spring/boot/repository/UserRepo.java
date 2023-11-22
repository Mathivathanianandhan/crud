package com.employeemanagement.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.spring.boot.DTO.UserLocationDTO;
import com.employeemanagement.spring.boot.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	

}
