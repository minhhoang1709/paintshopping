package com.paintshopping.api.dto;

public class CartItemsDto {
	private PaintDto cartPaint;
	private byte cartPaintQuantity;
	private int cartPaintPrice;
	private CouponDto cartCoupon;
	private InviteCodeDto cartinviteCode;

	public CartItemsDto(PaintDto cartPaint, byte cartPaintQuantity, int cartPaintPrice, CouponDto cartCoupon,
			InviteCodeDto cartinviteCode) {
		this.cartPaint = cartPaint;
		this.cartPaintQuantity = cartPaintQuantity;
		this.cartPaintPrice = cartPaintPrice;
		this.cartCoupon = cartCoupon;
		this.cartinviteCode = cartinviteCode;
	}

	public CartItemsDto() {
	}

	public PaintDto getCartPaint() {
		return cartPaint;
	}
	public void setCartPaint(PaintDto cartPaint) {
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
	public CouponDto getCartCoupon() {
		return cartCoupon;
	}
	public void setCartCoupon(CouponDto cartCoupon) {
		this.cartCoupon = cartCoupon;
	}
	public InviteCodeDto getCartinviteCode() {
		return cartinviteCode;
	}
	public void setCartinviteCode(InviteCodeDto cartinviteCode) {
		this.cartinviteCode = cartinviteCode;
	}
}
