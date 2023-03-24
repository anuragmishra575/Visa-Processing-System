package com.visa.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.visa.dto.VisaDTO;
import com.visa.entity.Visa;
import com.visa.service.VisaService;


@RestController
@RequestMapping(value="/api")
public class VisaController {

	@Autowired
	private VisaService service;
	


	@PostMapping("/visa")
	public ResponseEntity<Visa> createVisa(@RequestBody @Valid VisaDTO visaDTO) {
		Visa _visa = service.createVisa(visaDTO);
		return new ResponseEntity<>(_visa,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/visa/{id}")
	public String deleteVisa(@PathVariable int id) {
		return service.deleteVisa(id);
	}
	

	@PutMapping("/visa/{id}")
	public Visa updateVisa(@PathVariable int id, @RequestBody Visa visa) {
		return service.updateVisa(visa, id);

	}
	
	@GetMapping("/users/getall")	// to get all user data
	public ResponseEntity<List<Visa>> getAllVisa()	
	{
		
		return ResponseEntity.ok(service.getAllVisa());
	}

@GetMapping("/visa/{id}")
public Visa getVisa(@PathVariable int id) {
	return service.getVisa(id);
}


}