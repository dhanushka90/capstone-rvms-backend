package com.dksoft.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "journeyrefrigerator")
public class JourneyRefrigerator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jrId;
	
	
	@Column(name = "device_Id")
	private String deviceId;
	
	@Column(name = "transit_or_inhouse")
	private boolean transitOrInhouse;
	
	@Column(name = "journey_or_refrigerator")
	private String journeyOrRefrigeratorName;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "status")
	private boolean status;
	
	@Column(name = "temp_high")
	private String tempHigh;
	
	@Column(name = "temp_low")
	private String tempLow;

	@Column(name = "user_id")
	private long userId;
	
	
	public JourneyRefrigerator() {
		
	}
	
	public JourneyRefrigerator(String deviceId, boolean transitOrInhouse, String journeyOrRefrigeratorName,
			String startTime, boolean status, String tempHigh, String tempLow, long userId) {
		super();
		this.deviceId = deviceId;
		this.transitOrInhouse = transitOrInhouse;
		this.journeyOrRefrigeratorName = journeyOrRefrigeratorName;
		this.startTime = startTime;
		this.status = status;
		this.tempHigh = tempHigh;
		this.tempLow = tempLow;
		this.userId = userId;
	}
	
	
	public long getJrId() {
		return jrId;
	}
	public void setJrId(long jrId) {
		this.jrId = jrId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
