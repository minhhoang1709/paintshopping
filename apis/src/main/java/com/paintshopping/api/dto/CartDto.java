package com.paintshopping.api.dto;

import java.util.List;

public class CartDto {
	private List<CartItemsDto> cartItems;
	private CouponDto cartCoupon;

	public CartDto() {
	}

	public CartDto(List<CartItemsDto> cartItems, CouponDto cartCoupon) {
		this.cartItems = cartItems;
		this.cartCoupon = cartCoupon;
	}

	public List<CartItemsDto> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemsDto> cartItems) {
		this.cartItems = cartItems;
	}

	public CouponDto getCartCoupon() {
		return cartCoupon;
	}

	public void setCartCoupon(CouponDto cartCoupon) {
		this.cartCoupon = cartCoupon;
	}

}
