package com.dksoft.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dksoft.springboot.exception.ResourceNotFoundException;
import com.dksoft.springboot.model.JourneyRefrigerator;
import com.dksoft.springboot.repository.JourneyRefrigeratorRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class JourneyRefrigeratorController {
	
	@Autowired
	private JourneyRefrigeratorRepository journeyRefrigeratorRepository;
	
	//get all journey and refrigerator data
	@GetMapping("/journeyRefrigerator")
	public List<JourneyRefrigerator> getAllJourneyRefrigeratorData(){
		return journeyRefrigeratorRepository.findAll();
	}
	
	// create journeys and refrigerators
	@PostMapping("/journeyRefrigerator")
	public JourneyRefrigerator createJourneyRefrigerator(@RequestBody JourneyRefrigerator journeyrefrigerator) {
		return journeyRefrigeratorRepository.save(journeyrefrigerator);
	}
	
	// get journey and refrigerator by id
	@GetMapping("/journeyRefrigerator/{id}")
	public ResponseEntity<JourneyRefrigerator> getJourneyRefrigeratorById(@PathVariable Long id) {
		
		JourneyRefrigerator journeyRefrigerator = journeyRefrigeratorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no journey or refrigerator exist with id:" +id));
		
		return ResponseEntity.ok(journeyRefrigerator);
	}
	
	// update journey and refrigerator
	@PutMapping("/journeyRefrigerator/{id}")
	public ResponseEntity<JourneyRefrigerator> updateJourneyRefrigerator(@PathVariable Long id, @RequestBody JourneyRefrigerator journeyRefrigeratorDetails){
		
		JourneyRefrigerator journeyRefrigerator = journeyRefrigeratorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no journey or refrigerator exist with id:" +id));
		
		journeyRefrigerator.setDeviceId(journeyRefrigeratorDetails.getDeviceId());	
		journeyRefrigerator.setTransitOrInhouse(journeyRefrigeratorDetails.isTransitOrInhouse());
		journeyRefrigerator.setJourneyOrRefrigeratorName(journeyRefrigeratorDetails.getJourneyOrRefrigeratorName());
		journeyRefrigerator.setStartTime(journeyRefrigeratorDetails.getStartTime());
		journeyRefrigerator.setStatus(journeyRefrigeratorDetails.isStatus());
		journeyRefrigerator.setTempHigh(journeyRefrigeratorDetails.getTempHigh());
		journeyRefrigerator.setTempLow(journeyRefrigeratorDetails.getTempLow());
		journeyRefrigerator.setUserId(journeyRefrigeratorDetails.getUserId());
		
		JourneyRefrigerator updatedJourneyRefrigerator = journeyRefrigeratorRepository.save(journeyRefrigerator);
		return ResponseEntity.ok(updatedJourneyRefrigerator);
	}	
	
	// delete ticket
	@DeleteMapping("/journeyRefrigerator/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteJourneyRefrigerator(@PathVariable Long id) {
		
		JourneyRefrigerator journeyRefrigerator = journeyRefrigeratorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("There is no journey or refrigerator exist with id:" +id));
		
		journeyRefrigeratorRepository.delete(journeyRefrigerator);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
