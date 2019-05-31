package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.UserDto;
import com.paintshopping.core.service.UserService;
import com.paintshopping.model.UserModel;

@Service
public class AccountService {
	
	@Autowired UserService userService;
	
	public boolean register(String userName, String userPass) {
		if(userService.checkUserName(userName)) {
			userService.registerUser(userName, userPass);
			return true;
		}else {
			return false;
		}
		
	}
	
	public int updateProfileWhenRegister(UserDto userDto) {
		UserModel userModel = new UserModel();
		userModel.setUserName(userDto.getUserName());
		userModel.setUserFullname(userDto.getUserFullname());
		userModel.setUserGender(userDto.getUserGender());
		userModel.setUserBirthday(userDto.getUserBirthday());
		userModel.setUserAddress(userDto.getUserAddress());
		userModel.setUserPhone(userDto.getUserPhone());
		userModel.setUserEmail(userDto.getUserEmail());
		
		return userService.updateProfileWhenRegister(userModel);
	}
	
	public int updateProfile(UserDto userDto) {
		UserModel userModel = new UserModel();
		userModel.setUserName(userDto.getUserName());
		userModel.setUserFullname(userDto.getUserFullname());
		userModel.setUserGender(userDto.getUserGender());
		userModel.setUserBirthday(userDto.getUserBirthday());
		userModel.setUserAddress(userDto.getUserAddress());
		userModel.setUserPhone(userDto.getUserPhone());
		userModel.setUserEmail(userDto.getUserEmail());
		
		return userService.updateProfile(userModel);
	}
	
}
