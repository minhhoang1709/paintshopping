package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paintshopping.model.*;
import com.paintshopping.api.dto.UserDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.UserService;

@Service
public class AuthService {
	@Autowired UserService userService;
	@Autowired PSModelMapper psModelMapper;
	
	public UserDto authByUserNameAndUserPass(String userName, String userPass) {
		UserModel userModel = userService.loginByUserNameAndPassword(userName, userPass);
		return psModelMapper.convertToDto(userModel);
	}
}
