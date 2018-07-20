package com.example.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    public User getUserByAccount(String userAccount) {
		return null;
	}
    
    public boolean addUser(User record) {
		return false;
	}
    
    public User getUserById(int userId) {
    	return null;
    }
    
    public boolean userLogin(String account, String password) {
		return false;
	}
    
    public boolean deleteUser(int userId) {
		return false;
	}
    
    public boolean updateUser(User record) {
		return false;
	}
}
