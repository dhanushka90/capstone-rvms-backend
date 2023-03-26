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
	
	@Column(name = "transit_or_inhouse")
	private boolean transitOrInhouse;
	
	@Column(name = "journey_or_refrigerator")
	private String journeyOrRefrigeratorName;
	
	@Column(name = "installation_time")
	private String installationTime;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "temp_high")
	private String tempHigh;
	
	@Column(name = "temp_low")
	private String tempLow;
	
	
	public Device() {
		
	}
	
	public Device(String deviceName, boolean transitOrInhouse, String journeyOrRefrigeratorName,
			String installationTime, boolean status, String tempHigh, String tempLow) {
		super();
		this.deviceName = deviceName;
		this.transitOrInhouse = transitOrInhouse;
		this.journeyOrRefrigeratorName = journeyOrRefrigeratorName;
		this.installationTime = installationTime;
		this.status = status;
		this.tempHigh = tempHigh;
		this.tempLow = tempLow;
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
	public boolean isTransitOrInhouse() {
		return transitOrInhouse;
	}
	public void setTransitOrInhouse(boolean transitOrInhouse) {
		this.transitOrInhouse = transitOrInhouse;
	}
	public String getJourneyOrRefrigeratorName() {
		return journeyOrRefrigeratorName;
	}
	public void setJourneyOrRefrigeratorName(String journeyOrRefrigeratorName) {
		this.journeyOrRefrigeratorName = journeyOrRefrigeratorName;
	}
	public String getInstallationTime() {
		return installationTime;
	}
	public void setInstallationTime(String installationTime) {
		this.installationTime = installationTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getTempHigh() {
		return tempHigh;
	}
	public void setTempHigh(String tempHigh) {
		this.tempHigh = tempHigh;
	}
	public String getTempLow() {
		return tempLow;
	}
	public void setTempLow(String tempLow) {
		this.tempLow = tempLow;
	}
	
	
	
}
