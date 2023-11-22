package com.employeemanagement.spring.boot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.DTO.UserLocationDTO;
import com.employeemanagement.spring.boot.entity.User;
import com.employeemanagement.spring.boot.service.UserService;



@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/postuser")
	public User AddUser(@RequestBody UserLocationDTO userLocationDto)
	{
		return userService.AddUser(userLocationDto);
	}

	
}
