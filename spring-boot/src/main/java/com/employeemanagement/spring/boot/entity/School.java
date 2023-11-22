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

@Table(name="bschool")
public class School {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="school_id")
private int sid;
@Column(name="school_name")
private String schoolname;

}