package com.visa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.visa.dto.VisaDTO;
import com.visa.entity.Visa;
import com.visa.repository.VisaRepository;
import com.visa.service.VisaService;

public class VisaServiceImpl implements VisaService {

	@Autowired
	private VisaRepository visaRepository;
	
	@Override
	public Visa createVisa(VisaDTO visaDTO) {
		
		Visa _visa = Visa.builder().name(visaDTO.getName()).email(visaDTO.getEmail()).mobile(visaDTO.getMobile())
				.age(visaDTO.getAge()).country(visaDTO.getCountry()).nationality(visaDTO.getNationality()).build();
	return visaRepository.save(_visa);
	}

	@Override
	public Visa getVisa(int id) {

		return visaRepository.findById(id).get();
	}

	@Override
	public Visa updateVisa(Visa visa, int id) {
	
		Visa _visa = visaRepository.findById(id).get();
		_visa.setName(visa.getName());
		_visa.setMobile(visa.getMobile());
		_visa.setEmail(visa.getEmail());
		_visa.setNationality(visa.getNationality());
		_visa.setCountry(visa.getCountry());
		_visa.setAge(visa.getAge());
		
return visaRepository.save(_visa);		
		
		
	}

	@Override
	public String deleteVisa(int id) {
		visaRepository.deleteById(id);
		return "The Visa with id " + id + " is deleted.";
	}

	@Override
	public List<Visa> getAllVisa() {
		return visaRepository.findAll();
		
	}

}
