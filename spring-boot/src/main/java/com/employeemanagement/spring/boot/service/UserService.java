package com.employeemanagement.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.spring.boot.DTO.UserLocationDTO;
import com.employeemanagement.spring.boot.entity.User;
import com.employeemanagement.spring.boot.repository.UserRepo;



@Service

public class UserService {
@Autowired
private UserRepo userRepo;
public User AddUser(UserLocationDTO userLocationDto)
{
	User user = new User();
	//user.setId(userLocationDto.getId());
	user.setEmail(userLocationDto.getEmail());
	return userRepo.save(user);
	
}
}
