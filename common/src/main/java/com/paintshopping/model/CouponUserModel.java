package com.paintshopping.model;


import com.paintshopping.ref.CouponType;

public class CouponUserModel {
	private int counponuserId;
	private CouponType couponType;
	private int couponId;
	private String couponStartedDate;
	private boolean isPending;

	public CouponUserModel() {
		// TODO Auto-generated constructor stub
	}

	public CouponUserModel(int counponuserId, CouponType couponType, int couponId, String couponStartedDate,
			byte couponAmount, boolean isPending) {
		super();
		this.counponuserId = counponuserId;
		this.couponType = couponType;
		this.couponId = couponId;
		this.couponStartedDate = couponStartedDate;
		this.isPending = isPending;
	}

	public int getCounponuserId() {
		return counponuserId;
	}

	public void setCounponuserId(int counponuserId) {
		this.counponuserId = counponuserId;
	}

	public CouponType getCouponType() {
		return couponType;
	}

	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponStartedDate() {
		return couponStartedDate;
	}

	public void setCouponStartedDate(String couponStartedDate) {
		this.couponStartedDate = couponStartedDate;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

}
