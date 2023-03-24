package com.visa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Visaapplications")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Visa{
	@Id			//pk
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name", unique = true)
	private String name;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "email")
	private String email;
	@Column(name = "age")
	private Integer age;
	@Column(name = "nationality")
	private String nationality;
	@Column(name="country")
	private String country; 
}