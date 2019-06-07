package com.paintshopping.model;

import com.paintshopping.ref.CodeStatus;
import com.paintshopping.ref.CouponType;

public class CouponModel {
	private int couponId;
	private String couponCode;
	private String couponTitle;
	private String couponDescription;
	private CouponType couponType;
	private int couponTypeId;
	private float couponDiscountPercent;
	private int couponMinimum;
	private byte couponAmount;
	private String couponStartedDate;
	private String couponExpiredDate;
	private byte couponLimitPerUser;
	private CodeStatus couponStatus;
	
	
	public CouponModel() {
	}
	
	public CouponModel(int couponId, String couponCode, String couponTitle, String couponDescription, CouponType couponType,
			int couponTypeId, float couponDiscountPercent, int couponMinimum, byte couponAmount,
			String couponStartedDate, String couponExpiredDate, byte couponLimitPerUser, CodeStatus couponStatus) {
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponTitle = couponTitle;
		this.couponDescription = couponDescription;
		this.couponType = couponType;
		this.couponTypeId = couponTypeId;
		this.couponDiscountPercent = couponDiscountPercent;
		this.couponMinimum = couponMinimum;
		this.couponAmount = couponAmount;
		this.couponStartedDate = couponStartedDate;
		this.couponExpiredDate = couponExpiredDate;
		this.couponLimitPerUser = couponLimitPerUser;
		this.couponStatus = couponStatus;
	}
	
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
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
	public CouponType getCouponType() {
		return couponType;
	}
	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}
	public int getCouponTypeId() {
		return couponTypeId;
	}
	public void setCouponTypeId(int couponTypeId) {
		this.couponTypeId = couponTypeId;
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
	public byte getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(byte couponAmount) {
		this.couponAmount = couponAmount;
	}
	public String getCouponStartedDate() {
		return couponStartedDate;
	}
	public void setCouponStartedDate(String couponStartedDate) {
		this.couponStartedDate = couponStartedDate;
	}
	public String getCouponExpiredDate() {
		return couponExpiredDate;
	}
	public void setCouponExpiredDate(String couponExpiredDate) {
		this.couponExpiredDate = couponExpiredDate;
	}
	public byte getCouponLimitPerUser() {
		return couponLimitPerUser;
	}
	public void setCouponLimitPerUser(byte couponLimitPerUser) {
		this.couponLimitPerUser = couponLimitPerUser;
	}
	public CodeStatus getCouponStatus() {
		return couponStatus;
	}
	public void setCouponStatus(CodeStatus couponStatus) {
		this.couponStatus = couponStatus;
	}
}
