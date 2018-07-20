package com.example.mapper;

import com.example.model.Device;

public interface DeviceMapper {
	Device selectByPrimaryKey(int deviceId);
	
	Device selectByType(int deviceType);
	
	int deleteByPrimaryKey(int deviceId);
	
	int insert(Device record);
	
	int updateByPrimaryKey(Device record);

}
