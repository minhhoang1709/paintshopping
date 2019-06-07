package com.paintshopping.model;

public class CartItemsModel {
	private int cartItemsId;
	private int cartPaintId;
	private PaintModel cartPaint;
	private byte cartPaintQuantity;
	private int cartPaintPrice;
	private String cartItemsCreatedDate;
	private int CartId;
	private int cartItemsCouponId;
	private CouponModel cartItemsCoupon;
	private int cartInviteId;
	private InviteCodeModel cartInviteCode;

	public CartItemsModel(int cartItemsId, int cartPaintId, PaintModel cartPaint, byte cartPaintQuantity,
			int cartPaintPrice, String cartItemsCreatedDate, int cartId, int cartItemsCouponId, CouponModel cartItemsCoupon,
			int cartInviteId, InviteCodeModel cartInviteCode) {
		this.cartItemsId = cartItemsId;
		this.cartPaintId = cartPaintId;
		this.cartPaint = cartPaint;
		this.cartPaintQuantity = cartPaintQuantity;
		this.cartPaintPrice = cartPaintPrice;
		this.cartItemsCreatedDate = cartItemsCreatedDate;
		CartId = cartId;
		this.cartItemsCouponId = cartItemsCouponId;
		this.cartItemsCoupon = cartItemsCoupon;
		this.cartInviteId = cartInviteId;
		this.cartInviteCode = cartInviteCode;
	}

	public CartItemsModel() {
	}

	public int getCartItemsId() {
		return cartItemsId;
	}

	public void setCartItemsId(int cartItemsId) {
		this.cartItemsId = cartItemsId;
	}

	public int getCartPaintId() {
		return cartPaintId;
	}

	public void setCartPaintId(int cartPaintId) {
		this.cartPaintId = cartPaintId;
	}

	public PaintModel getCartPaint() {
		return cartPaint;
	}

	public void setCartPaint(PaintModel cartPaint) {
		this.cartPaint = cartPaint;
	}

	public byte getCartPaintQuantity() {
		return cartPaintQuantity;
	}

	public void setCartPaintQuantity(byte cartPaintQuantity) {
		this.cartPaintQuantity = cartPaintQuantity;
	}

	public int getCartPaintPrice() {
		return cartPaintPrice;
	}

	public void setCartPaintPrice(int cartPaintPrice) {
		this.cartPaintPrice = cartPaintPrice;
	}

	public String getCartItemsCreatedDate() {
		return cartItemsCreatedDate;
	}

	public void setCartItemsCreatedDate(String cartItemsCreatedDate) {
		this.cartItemsCreatedDate = cartItemsCreatedDate;
	}

	public int getCartId() {
		return CartId;
	}

	public void setCartId(int cartId) {
		CartId = cartId;
	}

	public int getCartItemsCouponId() {
		return cartItemsCouponId;
	}

	public void setCartItemsCouponId(int cartItemsCouponId) {
		this.cartItemsCouponId = cartItemsCouponId;
	}

	public CouponModel getCartItemsCoupon() {
		return cartItemsCoupon;
	}

	public void setCarCoupon(CouponModel cartItemsCoupon) {
		this.cartItemsCoupon = cartItemsCoupon;
	}

	public int getCartInviteId() {
		return cartInviteId;
	}

	public void setCartInviteId(int cartInviteId) {
		this.cartInviteId = cartInviteId;
	}

	public InviteCodeModel getCartInviteCode() {
		return cartInviteCode;
	}

	public void setCartInviteCode(InviteCodeModel cartInviteCode) {
		this.cartInviteCode = cartInviteCode;
	}
}
