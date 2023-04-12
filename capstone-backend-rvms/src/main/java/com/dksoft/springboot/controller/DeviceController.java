package com.dksoft.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dksoft.springboot.model.Device;
import com.dksoft.springboot.repository.DeviceRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class DeviceController {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	//get all device data
	@GetMapping("/allDeviceData")
	public List<Device> getAllDeviceData(){
		return deviceRepository.findAll();
	}
	
	// create devices
	@PostMapping("/devices")
	public Device createDevice(@RequestBody Device device) {
		return deviceRepository.save(device);
	}
		

}
