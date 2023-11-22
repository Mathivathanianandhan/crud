package com.employeemanagement.spring.boot.entity;
 


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_fine")


public class EmployeeFine {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "employee_name")
	private String name;
	
	@Column(name = "fine_amt")
	private Double amt;
	
	@Column(name = "type")
	private String type;
	@Column(name = "reason")
	private String reason;
	

}