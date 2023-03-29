package com.dksoft.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dksoft.springboot.model.JourneyRefrigerator;
import com.dksoft.springboot.repository.JourneyRefrigeratorRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class JourneyRefrigeratorController {
	
	@Autowired
	private JourneyRefrigeratorRepository journeyRefrigeratorRepository;
	
	//get all journey and refrigerator data
	@GetMapping("/allJourneyRefrigeratorData")
	public List<JourneyRefrigerator> getAllJourneyRefrigeratorData(){
		return journeyRefrigeratorRepository.findAll();
	}
	
	// create journeys and refrigerators
	@PostMapping("/journeyRefrigerator")
	public JourneyRefrigerator createJourneyRefrigerator(@RequestBody JourneyRefrigerator journeyrefrigerator) {
		return journeyRefrigeratorRepository.save(journeyrefrigerator);
	}
		

}
