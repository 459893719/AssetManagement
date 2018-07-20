package com.example.model;

public class Device {
	private Integer deviceId;
	
	private String deviceVersion;
	
	private String deviceImage;
	
	private Boolean deviceState;
	
	private String deviceLender;
	
	private String deviceType;
	
	public void setDeviceState(Boolean deviceState) {
		this.deviceState = deviceState;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceVersion() {
		return deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getDeviceImage() {
		return deviceImage;
	}

	public void setDeviceImage(String deviceImage) {
		this.deviceImage = deviceImage;
	}

	public Boolean getDeviceState() {
		return deviceState;
	}

	public String getDeviceLender() {
		return deviceLender;
	}

	public void setDeviceLender(String deviceLender) {
		this.deviceLender = deviceLender;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
