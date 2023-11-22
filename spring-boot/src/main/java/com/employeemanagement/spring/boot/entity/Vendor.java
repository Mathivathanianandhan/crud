package com.employeemanagement.spring.boot.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="vendor")
public class Vendor {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)

@Column(name="id")
private int id;

@Column(name="vname")
private String vname;

@Column(name="project")
private String project;

@Column(name="dealer")
private String dealer;

@OneToMany(targetEntity=Staff.class, cascade =CascadeType.ALL )
@JoinColumn(name="fk_id", referencedColumnName="id")
private List<Staff> staff;

}
