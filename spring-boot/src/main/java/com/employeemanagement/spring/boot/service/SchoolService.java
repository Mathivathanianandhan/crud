package com.employeemanagement.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.employeemanagement.spring.boot.entity.School;
import com.employeemanagement.spring.boot.repository.SchoolRepository;

@Service

public class SchoolService {
@Autowired
public SchoolRepository schoolRepository;
public String AddSchool(School school)
{
	schoolRepository.save(school);
	return "Data Saved";
}
public List<School> schoolList(List<School> school) 
{
	return schoolRepository.saveAll(school);
}
public List<School> getSchool()
{
	return schoolRepository.findAll();
}
public Optional<School> getSchoolById(int id)
{
	return schoolRepository.findById(id);
	
}

public School update(School request)
{
	return schoolRepository.save(request);
}
public void delete()
{
	schoolRepository.deleteAll();
}


}
