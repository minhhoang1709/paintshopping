package com.paintshopping.model;

import java.util.List;

import com.paintshopping.ref.CartStatus;

public class CartModel {
	private int cartId;
	private int cartUserId;
	private String cartCreatedDate;
	private List<CartItemsModel> cartItems;
	private int cartCouponId;
	private CouponModel cartCoupon;
	private CartStatus cartStatus;
	
	public CartModel(int cartId, int cartUserId, String cartCreatedDate, List<CartItemsModel> cartItems,
			int cartCouponId, CouponModel cartCoupon, CartStatus cartStatus) {
		this.cartId = cartId;
		this.cartUserId = cartUserId;
		this.cartCreatedDate = cartCreatedDate;
		this.cartItems = cartItems;
		this.cartCouponId = cartCouponId;
		this.cartCoupon = cartCoupon;
		this.cartStatus = cartStatus;
	}
	
	
	public CartModel() {
	}


	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCartUserId() {
		return cartUserId;
	}
	public void setCartUserId(int cartUserId) {
		this.cartUserId = cartUserId;
	}
	public String getCartCreatedDate() {
		return cartCreatedDate;
	}
	public void setCartCreatedDate(String cartCreatedDate) {
		this.cartCreatedDate = cartCreatedDate;
	}
	public List<CartItemsModel> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<CartItemsModel> cartItems) {
		this.cartItems = cartItems;
	}
	public int getCartCouponId() {
		return cartCouponId;
	}
	public void setCartCouponId(int cartCouponId) {
		this.cartCouponId = cartCouponId;
	}
	public CouponModel getCartCoupon() {
		return cartCoupon;
	}
	public void setCartCoupon(CouponModel cartCoupon) {
		this.cartCoupon = cartCoupon;
	}
	public CartStatus getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(CartStatus cartStatus) {
		this.cartStatus = cartStatus;
	}
}
