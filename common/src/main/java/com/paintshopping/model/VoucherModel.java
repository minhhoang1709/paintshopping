package com.paintshopping.model;

import com.paintshopping.ref.CodeStatus;
import com.paintshopping.ref.CouponType;

public class VoucherModel {
	private int voucherId;
	private String voucherCode;
	private String voucherTitle;
	private String voucherDescription;
	private CouponType voucherType;
	private int voucherTypeId;
	private int voucherTotal;
	private int voucherAmount;
	private String voucherStartedDate;
	private String voucherExpiredDate;
	private byte voucherLimitPerUser;
	private CodeStatus voucherStatus;

	public VoucherModel(int voucherId, String voucherCode, String voucherTitle, String voucherDescription,
			CouponType voucherType, int voucherTypeId, int voucherTotal, int voucherAmount, String voucherStartedDate,
			String voucherExpiredDate, byte voucherLimitPerUser, CodeStatus voucherStatus) {
		this.voucherId = voucherId;
		this.voucherCode = voucherCode;
		this.voucherTitle = voucherTitle;
		this.voucherDescription = voucherDescription;
		this.voucherType = voucherType;
		this.voucherTypeId = voucherTypeId;
		this.voucherTotal = voucherTotal;
		this.voucherAmount = voucherAmount;
		this.voucherStartedDate = voucherStartedDate;
		this.voucherExpiredDate = voucherExpiredDate;
		this.voucherLimitPerUser = voucherLimitPerUser;
		this.voucherStatus = voucherStatus;
	}

	public VoucherModel() {
	}

	public int getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherCode() {
		return voucherCode;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

	public String getVoucherTitle() {
		return voucherTitle;
	}

	public void setVoucherTitle(String voucherTitle) {
		this.voucherTitle = voucherTitle;
	}

	public String getVoucherDescription() {
		return voucherDescription;
	}

	public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

	public CouponType getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(CouponType voucherType) {
		this.voucherType = voucherType;
	}

	public int getVoucherTypeId() {
		return voucherTypeId;
	}

	public void setVoucherTypeId(int voucherTypeId) {
		this.voucherTypeId = voucherTypeId;
	}

	public int getVoucherTotal() {
		return voucherTotal;
	}

	public void setVoucherTotal(int voucherTotal) {
		this.voucherTotal = voucherTotal;
	}

	public int getVoucherAmount() {
		return voucherAmount;
	}

	public void setVoucherAmount(int voucherAmount) {
		this.voucherAmount = voucherAmount;
	}

	public String getVoucherStartedDate() {
		return voucherStartedDate;
	}

	public void setVoucherStartedDate(String voucherStartedDate) {
		this.voucherStartedDate = voucherStartedDate;
	}

	public String getVoucherExpiredDate() {
		return voucherExpiredDate;
	}

	public void setVoucherExpiredDate(String voucherExpiredDate) {
		this.voucherExpiredDate = voucherExpiredDate;
	}

	public byte getVoucherLimitPerUser() {
		return voucherLimitPerUser;
	}

	public void setVoucherLimitPerUser(byte voucherLimitPerUser) {
		this.voucherLimitPerUser = voucherLimitPerUser;
	}

	public CodeStatus getVoucherStatus() {
		return voucherStatus;
	}

	public void setVoucherStatus(CodeStatus voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
