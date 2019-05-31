package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.dto.UserDto;
import com.paintshopping.api.service.AccountService;

@Controller
@RequestMapping(path="/api")
public class AccountController {
	@Autowired AccountService accountService;
	
	@RequestMapping(path="/register" ,method= {RequestMethod.POST})
	@ResponseBody
	public boolean registerUsingUserNameAndPassword(String userName, String userPass) {
		return accountService.register(userName, userPass);
	}
	
	@RequestMapping(path="/profile" ,method= {RequestMethod.PUT})
	@ResponseBody
	public int updateProfileWhenRegister(UserDto userDto) {
		return accountService.updateProfileWhenRegister(userDto);
	}
	
	@RequestMapping(path="/profile" ,method= {RequestMethod.PUT})
	@ResponseBody
	public int updateProfile(UserDto userDto) {
		return accountService.updateProfile(userDto);
	}
}