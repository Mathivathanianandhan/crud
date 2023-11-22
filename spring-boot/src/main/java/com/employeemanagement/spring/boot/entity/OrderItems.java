package com.employeemanagement.spring.boot.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orderitems")
@JsonIgnoreProperties


public class OrderItems implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 

	@Column(name="id")
	private int id;
	@Column(name="product")
	private String product;
	@Column(name="price")
	private String price;
	@Column(name="quantity")
	private String quantity;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;

}
