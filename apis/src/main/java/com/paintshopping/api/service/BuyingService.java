package com.paintshopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.api.dto.CartDto;
import com.paintshopping.api.util.PSModelMapper;
import com.paintshopping.core.service.CartService;
import com.paintshopping.model.CartModel;

@Service
public class BuyingService {
	
	@Autowired PSModelMapper psModelMaper;
	@Autowired CartService cartService;
	
	public int getPendingCartId(int cartUserId) {
		return cartService.selectPendingCartIdByUserId(cartUserId);
	}
	
	public CartDto getCartByUserId(int cartUserId) {
		CartModel cartModel = cartService.selectCartByUserId(cartUserId);
		return psModelMaper.convertToDto(cartModel);
	}
}
