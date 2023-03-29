package com.dksoft.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deviceId;
	
	
	@Column(name = "device_name")
	private String deviceName;
	
	
	
	public Device() {
		
	}
	
	public Device(String deviceName, boolean transitOrInhouse, String journeyOrRefrigeratorName,
			String installationTime, boolean status, String tempHigh, String tempLow) {
		super();
		this.deviceName = deviceName;
	}
	
	
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
	
}
