package com.paintshopping.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.CartMapper;
import com.paintshopping.model.CartModel;

@Service
public class CartService {
	@Autowired CartMapper cartMapper;
	
	
	public CartModel selectCartByUserId(int cartUserId) {
		return cartMapper.selectCartByUserId(cartUserId);
	}
	
	public int selectPendingCartIdByUserId(int cartUserId) {
			return cartMapper.getPendingCartId(cartUserId);
	}
	
	public int checkPendingCartByUserId(int cartUserId) {
		return cartMapper.checkPendingCart(cartUserId);
	}
	
	public int insertCart(int cartUserId) {
		return cartMapper.insertCart(cartUserId);
	}
	
	public int updateCart(int cartCouponId, int cartId) {
		return cartMapper.updateCart(cartCouponId, cartId);
	}
	
	public int deleteCart(int cartId) {
		return cartMapper.deleteCart(cartId);
	}
	
	public int updateCartStatus(int cartId) {
		return cartMapper.updateCartStatus(cartId);
	}
	
	public int countUsedCoupon(int cartCouponId) {
		return cartMapper.countUsedCoupon(cartCouponId);
	}
	
	public int countUsedCouponByUserId(int cartCouponId, int cartUserId) {
		return cartMapper.countUsedCouponByUserId(cartCouponId, cartUserId);
	}
	
	public int countUsedVoucher(int cartVoucherId) {
		return cartMapper.countUsedVoucher(cartVoucherId);
	}
	
	public int countUsedVoucherByUserId(int cartVoucherId, int cartUserId) {
		return cartMapper.countUsedVoucherByUserId(cartVoucherId, cartUserId);
	}
}
