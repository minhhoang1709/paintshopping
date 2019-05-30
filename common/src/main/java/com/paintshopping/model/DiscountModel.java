package com.paintshopping.model;

import com.paintshopping.ref.CodeStatus;
import com.paintshopping.ref.DiscountType;

public class DiscountModel {
	private int discountId;
	private String discountTitle;
	private String discountDescription;
	private DiscountType discountType;
	private int discountProductId;
	private float discountPercent;
	private byte discountAmount;
	private String discountStartedDate;
	private String discountExpiredDate;
	private byte discountLimitPerUser;
	private CodeStatus discountStatus;

	public DiscountModel() {
		// TODO Auto-generated constructor stub
	}

	public DiscountModel(int discountId, String discountTitle, String discountDescription, DiscountType discountType,
			int discountProductId, float discountPercent, byte discountAmount, String discountStartedDate,
			String discountExpiredDate, byte discountLimitPerUser, CodeStatus discountStatus) {
		super();
		this.discountId = discountId;
		this.discountTitle = discountTitle;
		this.discountDescription = discountDescription;
		this.discountType = discountType;
		this.discountProductId = discountProductId;
		this.discountPercent = discountPercent;
		this.discountAmount = discountAmount;
		this.discountStartedDate = discountStartedDate;
		this.discountExpiredDate = discountExpiredDate;
		this.discountLimitPerUser = discountLimitPerUser;
		this.discountStatus = discountStatus;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountTitle() {
		return discountTitle;
	}

	public void setDiscountTitle(String discountTitle) {
		this.discountTitle = discountTitle;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public DiscountType getDiscountType() {
		return discountType;
	}

	public void setDiscountType(DiscountType discountType) {
		this.discountType = discountType;
	}

	public int getDiscountProductId() {
		return discountProductId;
	}

	public void setDiscountProductId(int discountProductId) {
		this.discountProductId = discountProductId;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}

	public byte getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(byte discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountStartedDate() {
		return discountStartedDate;
	}

	public void setDiscountStartedDate(String discountStartedDate) {
		this.discountStartedDate = discountStartedDate;
	}

	public String getDiscountExpiredDate() {
		return discountExpiredDate;
	}

	public void setDiscountExpiredDate(String discountExpiredDate) {
		this.discountExpiredDate = discountExpiredDate;
	}

	public byte getDiscountLimitPerUser() {
		return discountLimitPerUser;
	}

	public void setDiscountLimitPerUser(byte discountLimitPerUser) {
		this.discountLimitPerUser = discountLimitPerUser;
	}

	public CodeStatus getDiscountStatus() {
		return discountStatus;
	}

	public void setDiscountStatus(CodeStatus discountStatus) {
		this.discountStatus = discountStatus;
	}

}
