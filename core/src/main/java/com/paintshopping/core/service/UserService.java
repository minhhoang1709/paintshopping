package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.UserMapper;
import com.paintshopping.model.UserModel;

@Service
public class UserService {
	@Autowired UserMapper userMapper;
	
	public UserModel loginByUserNameAndPassword(String userName, String userPass) {
		return userMapper.selectByUserNameAndUserPass(userName, userPass);
	}
	
//	public UserModel getUserById(int userId) {
//		return userMapper.selectByUserId(userId);
//	}
//	
//	public UserModel getUserByEmail(String userEmail) {
//		return userMapper.selectByUserEmail(userEmail);
//	}
	
	public int insertUser(UserModel userModel) {
		return userMapper.insertUser(userModel);
	}
	
	public int updateProfileWhenRegister(UserModel userModel) {
		return userMapper.updateProfileWhenRegister(userModel);
	}
	
	public int updateProfile(UserModel userModel) {
		return userMapper.updateProfile(userModel);
	}
	
	public int registerUser(String userName, String userPass) {
		return userMapper.registerUser(userName, userPass);
	}
	
	public boolean checkUserName(String userName) {
		if(userMapper.checkUserName(userName)==0) {
			return true;
		}else {
			return false;
		}
	}
}