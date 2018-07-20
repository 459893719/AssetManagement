package com.example.service;

import com.example.model.Device;

public interface DeviceService {
	public Device getDeviceByType(String deviceType);
    boolean addDevice(Device record);
    boolean deleteDevice(int deviceId);
    boolean updateDevice(Device record);
}
