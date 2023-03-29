package com.dksoft.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sensorData")
public class Sensor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "time_stamp")
	private String timeStamp; 
	
	@Column(name = "jr_id")
	private String jrId;
	
	@Column(name = "temparature")
	private String temparature; 
	
	@Column(name = "accelerometer_x")
	private String accelerometerX;
	
	@Column(name = "accelerometer_y")
	private String accelerometerY;
	
	@Column(name = "accelerometer_z")
	private String accelerometerZ;
	
	@Column(name = "gyroscope_x")
	private String gyroscopeX;
	
	@Column(name = "gyroscope_y")
	private String gyroscopeY;
	
	@Column(name = "gyroscope_z")
	private String gyroscopeZ;
	
	@Column(name = "longitude")
	private String longitude;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "batterystatus")
	private String batterystatus;
	
	public Sensor() {
		
	}
	
	public Sensor(String timeStamp, String jrId, String temparature, String accelerometerX, String accelerometerY,
			String accelerometerZ, String gyroscopeX, String gyroscopeY, String gyroscopeZ, String longitude,
			String latitude, String batterystatus) {
		super();
		this.timeStamp = timeStamp;
		this.jrId = jrId;
		this.temparature = temparature;
		this.accelerometerX = accelerometerX;
		this.accelerometerY = accelerometerY;
		this.accelerometerZ = accelerometerZ;
		this.gyroscopeX = gyroscopeX;
		this.gyroscopeY = gyroscopeY;
		this.gyroscopeZ = gyroscopeZ;
		this.longitude = longitude;
		this.latitude = latitude;
		this.batterystatus = batterystatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getJrId() {
		return jrId;
	}
	public void setJrId(String jrId) {
		this.jrId = jrId;
	}
	public String getTemparature() {
		return temparature;
	}
	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}
	public String getAccelerometerX() {
		return accelerometerX;
	}
	public void setAccelerometerX(String accelerometerX) {
		this.accelerometerX = accelerometerX;
	}
	public String getAccelerometerY() {
		return accelerometerY;
	}
	public void setAccelerometerY(String accelerometerY) {
		this.accelerometerY = accelerometerY;
	}
	public String getAccelerometerZ() {
		return accelerometerZ;
	}
	public void setAccelerometerZ(String accelerometerZ) {
		this.accelerometerZ = accelerometerZ;
	}
	public String getGyroscopeX() {
		return gyroscopeX;
	}
	public void setGyroscopeX(String gyroscopeX) {
		this.gyroscopeX = gyroscopeX;
	}
	public String getGyroscopeY() {
		return gyroscopeY;
	}
	public void setGyroscopeY(String gyroscopeY) {
		this.gyroscopeY = gyroscopeY;
	}
	public String getGyroscopeZ() {
		return gyroscopeZ;
	}
	public void setGyroscopeZ(String gyroscopeZ) {
		this.gyroscopeZ = gyroscopeZ;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getBatterystatus() {
		return batterystatus;
	}
	public void setBatterystatus(String batterystatus) {
		this.batterystatus = batterystatus;
	}
	
	
}
