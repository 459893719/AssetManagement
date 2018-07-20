package com.example.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.DeviceMapper;
import com.example.model.Device;
import com.example.service.DeviceService;

@Service("deviceService")
public class DeviceServiceImpl implements DeviceService {

	@Resource
	private DeviceMapper deviceDao;
	
	public Device getDeviceByType(String deviceType) {
		return null;
	}

	public boolean addDevice(Device record) {
		return false;
	}

	public boolean deleteDevice(int deviceId) {	
		return false;
	}

	public boolean updateDevice(Device record) {
		return false;
	}

}
