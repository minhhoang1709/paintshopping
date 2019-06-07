package com.paintshopping.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.CartItemsMapper;
import com.paintshopping.model.CartItemsModel;

@Service
public class CartItemsService {
	
	@Autowired CartItemsMapper cartItemsMapper;
	
	public int insertCartItem(CartItemsModel cartItemsModel) {
		return cartItemsMapper.insertCartItem(cartItemsModel);
	}
	
	public int updateCartItem(CartItemsModel cartItemsModel) {
		return cartItemsMapper.updateCartItem(cartItemsModel);
	}
	
	public int deleteByCartId(int cartId) {
		return cartItemsMapper.deleteByCartId(cartId);
	}
	
	public CartItemsModel selectByPaintId(int cartPaintId) {
		return cartItemsMapper.selectByPaintId(cartPaintId);
	}
	
	public int insertList(List<CartItemsModel> cartItemsList) {
		return cartItemsMapper.insertList(cartItemsList);
	}
}
