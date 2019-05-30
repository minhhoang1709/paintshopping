package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.UserMapper;
import com.paintshopping.model.UserModel;

@Service
public class UserService {
	@Autowired UserMapper userMapper;
	
	public UserModel loginByUserNameAndPassword(String userName, String userPass) {
		return userMapper.findByUserNameAndPassword(userName, userPass);
	}
	
	public UserModel getUserById(int userId) {
		return userMapper.findByUserId(userId);
	}
	
	public UserModel getUserByEmail(String userEmail) {
		return userMapper.findByUserEmail(userEmail);
	}
	
	public int insertUser(UserModel userModel) {
		return userMapper.inserUser(userModel);
	}
	
	public int updateUser(UserModel userModel) {
		return userMapper.updateUser(userModel);
	}
}
