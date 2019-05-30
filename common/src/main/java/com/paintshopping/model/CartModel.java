package com.paintshopping.model;

public class CartModel {
	private int cartId;
	private int cartUserId;
	private int cartPaintId;
	private short cartPaintQuantity;
	private int cartPaintPrice;
	private String cartCouponTitle;
	private float cartCouponDiscountPercent;
	private String cartCreatedDate;
	
	public CartModel() {
		// TODO Auto-generated constructor stub
	}

	public CartModel(int cartId, int cartUserId, int cartPaintId, short cartPaintQuantity, int cartPaintPrice,
			String cartCouponTitle, float cartCouponDiscountPercent, String cartCreatedDate) {
		super();
		this.cartId = cartId;
		this.cartUserId = cartUserId;
		this.cartPaintId = cartPaintId;
		this.cartPaintQuantity = cartPaintQuantity;
		this.cartPaintPrice = cartPaintPrice;
		this.cartCouponTitle = cartCouponTitle;
		this.cartCouponDiscountPercent = cartCouponDiscountPercent;
		this.cartCreatedDate = cartCreatedDate;
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

	public int getCartPaintId() {
		return cartPaintId;
	}

	public void setCartPaintId(int cartPaintId) {
		this.cartPaintId = cartPaintId;
	}

	public short getCartPaintQuantity() {
		return cartPaintQuantity;
	}

	public void setCartPaintQuantity(short cartPaintQuantity) {
		this.cartPaintQuantity = cartPaintQuantity;
	}

	public int getCartPaintPrice() {
		return cartPaintPrice;
	}

	public void setCartPaintPrice(int cartPaintPrice) {
		this.cartPaintPrice = cartPaintPrice;
	}

	public String getCartCouponTitle() {
		return cartCouponTitle;
	}

	public void setCartCouponTitle(String cartCouponTitle) {
		this.cartCouponTitle = cartCouponTitle;
	}

	public float getCartCouponDiscountPercent() {
		return cartCouponDiscountPercent;
	}

	public void setCartCouponDiscountPercent(float cartCouponDiscountPercent) {
		this.cartCouponDiscountPercent = cartCouponDiscountPercent;
	}

	public String getCartCreatedDate() {
		return cartCreatedDate;
	}

	public void setCartCreatedDate(String cartCreatedDate) {
		this.cartCreatedDate = cartCreatedDate;
	}
}
