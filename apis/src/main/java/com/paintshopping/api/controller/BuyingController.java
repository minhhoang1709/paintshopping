package com.paintshopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paintshopping.api.dto.CartDto;
import com.paintshopping.api.service.BuyingService;

@Controller
@RequestMapping(path = "/api")
public class BuyingController {
	@Autowired BuyingService buyingService;
	
	@RequestMapping(path = "/pendingcart", method={ RequestMethod.GET })
	@ResponseBody
	public int getPendingCartId(int cartUserId) {
		return buyingService.getPendingCartId(cartUserId);
	}
	
	@RequestMapping(path = "/showcart", method={ RequestMethod.GET })
	@ResponseBody
	public CartDto getCartByUserId(int cartUserId) {
		return buyingService.getCartByUserId(cartUserId);
	}
}
