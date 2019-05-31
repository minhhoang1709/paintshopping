package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.paintshopping.api.dto.UserDto;
import com.paintshopping.api.service.AuthService;

@Controller
@RequestMapping(path="/api")
public class AuthController {
	@Autowired AuthService authService;
	
	@RequestMapping(path="/auth", method={ RequestMethod.GET })
	@ResponseBody
	public UserDto authByUserNameAndPassword(String userName, String userPass) {
		return authService.authByUserNameAndUserPass(userName, userPass);
	}
}
