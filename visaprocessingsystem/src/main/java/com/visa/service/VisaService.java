package com.visa.service;

import java.util.List;



import com.visa.dto.VisaDTO;
import com.visa.entity.Visa;



public interface VisaService {

	//CRUD operations
	
	//create
	Visa createVisa(VisaDTO visaDTO);

	//getbyid
	Visa getVisa(int id);

		
	//update
		Visa updateVisa(Visa visa, int id);


     //delete
		String deleteVisa(int id);
	
		
	 //getall
	List<Visa> getAllVisa();

	


}

	
	
