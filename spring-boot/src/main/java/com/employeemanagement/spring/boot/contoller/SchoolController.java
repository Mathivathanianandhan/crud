package com.employeemanagement.spring.boot.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.spring.boot.entity.School;
import com.employeemanagement.spring.boot.service.SchoolService;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
@Autowired
public SchoolService schoolService;
@PostMapping("/postschool")
public void AddSchool(@RequestBody School school)
{
     schoolService.AddSchool(school);
}
@PostMapping("/postlist")
public List<School> schoolList(@RequestBody List<School> school)
{
	return schoolService.schoolList(school);
}
@GetMapping("/getschool")
public List<School> getSchool()
{
	return schoolService.getSchool();
}
@GetMapping("/getschool/{id}")
public Optional<School> getSchoolById(@PathVariable int id)
{
	return schoolService.getSchoolById(id);
	
}
@PutMapping("/update")
public School update(@RequestBody School request)
{
	return schoolService.update(request);
	
}
@DeleteMapping("/deleteschool")
public void delete()
{
	schoolService.delete();
}
}
