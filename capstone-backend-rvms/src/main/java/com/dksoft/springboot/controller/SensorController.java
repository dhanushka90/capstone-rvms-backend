package com.dksoft.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dksoft.springboot.model.Sensor;
import com.dksoft.springboot.repository.SensorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class SensorController {
	
	@Autowired
	private SensorRepository sensorRepository;
	
	//get all sensor data
	@GetMapping("/allSensorData")
	public List<Sensor> getAllSensorData(){
		return sensorRepository.findAll();
	}
	
	// create sensor data
	@PostMapping("/allSensorData")
	public Sensor postAllSensorData(@RequestBody Sensor sensor) {
		return sensorRepository.save(sensor);
	}

	
}
