package com.paintshopping.api.dto;

public class CouponDto {
	private String couponTitle;
	private String couponDescription;
	private float couponDiscountPercent;
	private int couponMinimum;
	
	public CouponDto() {
	}
	public CouponDto(String couponTitle, String couponDescription, float couponDiscountPercent, int couponMinimum) {
		this.couponTitle = couponTitle;
		this.couponDescription = couponDescription;
		this.couponDiscountPercent = couponDiscountPercent;
		this.couponMinimum = couponMinimum;
	}
	
	public String getCouponTitle() {
		return couponTitle;
	}
	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
	}
	public String getCouponDescription() {
		return couponDescription;
	}
	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}
	public float getCouponDiscountPercent() {
		return couponDiscountPercent;
	}
	public void setCouponDiscountPercent(float couponDiscountPercent) {
		this.couponDiscountPercent = couponDiscountPercent;
	}
	public int getCouponMinimum() {
		return couponMinimum;
	}
	public void setCouponMinimum(int couponMinimum) {
		this.couponMinimum = couponMinimum;
	}
}
