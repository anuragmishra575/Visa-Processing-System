package com.visa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.visa.entity.Visa;
import com.visa.repository.VisaRepository;

@SpringBootApplication
public class VisaprocessingsystemApplication implements CommandLineRunner {

	@Autowired
	private VisaRepository visaRepository;
	public static void main(String[] args) {
		SpringApplication.run(VisaprocessingsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Visa v1=Visa.builder().name("Anurag").mobile("8291457472").email("anurag@gmail.com").nationality("Indian")
				.country("Spain").build();
		
		Visa v2=Visa.builder().name("Aakanksha").mobile("9967228681").email("aakanksha@gmail.com").nationality("Indian")
				.country("germany").build();
		Visa v3=Visa.builder().name("Neeta").mobile("7977538399").email("neeta@gmail.com").nationality("Indian")
				.country("argentina").build();
		
		visaRepository.save(v1);
		visaRepository.save(v2);
		visaRepository.save(v3);
		
		System.out.println("-----------------------All Saved---------------------");
		
		}

	
}
