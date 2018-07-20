package com.example.mapper;

import com.example.model.User;

public interface UserMapper {
	User selectByPrimaryKey(int userId);
	
	User selectByUserAccount(int userAccount);
	
	int deleteByPrimaryKey(int userId);
	
	int insert(User record); //(int类型为了返回编号）
	
	int updateByPrimaryKey(User record);

}