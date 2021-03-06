package com.paintshopping.core.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paintshopping.core.mapper.CartMapper;
import com.paintshopping.core.util.PsStringToDate;
import com.paintshopping.model.CartModel;

@Service
public class CartService {
	@Autowired CartMapper cartMapper;
	
	@Autowired PsStringToDate psStringToDate;
	
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
		Date today = new Date();
		String sToday = psStringToDate.dateToString(today);
		return cartMapper.insertCart(cartUserId, sToday);
	}
	
	public int updateCart(int cartCouponId, int cartId) {
		return cartMapper.updateCart(cartCouponId, cartId);
	}
	
	public int deleteCart(int cartId) {
		return cartMapper.deleteCart(cartId);
	}
	
	public int updateCartStatusById(int cartId) {
		return cartMapper.updateCartStatusById(cartId);
	}
	
	public int updateCartStatusByUserId(int cartUserId) {
		return cartMapper.updateCartStatusByUserId(cartUserId);
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
	
	public int selectCouponIdByCartId(int cartId) {
		return cartMapper.selectCouponIdByCartId(cartId);
	}
	
	public CartModel selectCartById(int cartId) {
		return cartMapper.selectCartById(cartId);
	}
}
