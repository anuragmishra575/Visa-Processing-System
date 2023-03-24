package com.visa.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VisaDTO{
	
	
		
	private String name;
	
	private String mobile;
	
	private String email;
	
	private Integer age;
	
	private String nationality;
	
	private String country;
}