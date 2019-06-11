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
	
	public int deleteByCartId(int cartId, int cartPaintId) {
		return cartItemsMapper.deleteByCartId(cartId, cartPaintId);
	}
	
	public CartItemsModel selectByPaintId(int cartPaintId, int cartId) {
		return cartItemsMapper.selectByPaintId(cartPaintId, cartId);
	}
	
	public int checkExistPaint(int cartPaintId, int cartId) {
		return cartItemsMapper.checkExistPaint(cartPaintId, cartId);
	}
	
	public int insertList(List<CartItemsModel> cartItemsList) {
		return cartItemsMapper.insertList(cartItemsList);
	}
	
	public int countUsedInvite(int inviteId) {
		return cartItemsMapper.countUsedInvite(inviteId);
	}
	
	public int countUsedInviteByUserId(int inviteId, int userId) {
		return cartItemsMapper.countUsedInviteByUserId(inviteId, userId);
	}
}
