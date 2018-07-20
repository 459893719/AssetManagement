package com.example.service;

import com.example.model.User;

public interface UserService {
    public User getUserByAccount(String userAccount);
    public User getUserById(int userId);
    boolean addUser(User record);
    boolean userLogin(String account, String password);
    boolean deleteUser(int userId);
    boolean updateUser(User record);
}
