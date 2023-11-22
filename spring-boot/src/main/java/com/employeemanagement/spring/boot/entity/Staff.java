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
@AllArgsConstructor
@NoArgsConstructor
@Table(name="staff")
public class Staff {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="sid")
private int sid;
@Column(name="sname")
private String sname;
@Column(name="work")
private String work;
@Column(name="role")
private String role;


}
