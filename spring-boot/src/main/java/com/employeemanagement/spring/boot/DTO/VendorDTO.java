package com.employeemanagement.spring.boot.DTO;

import java.util.List;

import lombok.Data;

@Data
public class VendorDTO {
	private int id;
	private String vname;
	private String project;
	List<StaffDTO> staff;	
	
}
