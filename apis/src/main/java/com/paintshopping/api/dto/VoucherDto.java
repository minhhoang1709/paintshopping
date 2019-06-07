package com.paintshopping.api.dto;

public class VoucherDto {
	private String voucherTitle;
	private String voucherDescription;
	private int voucherTotal;

	public VoucherDto() {
	}

	public VoucherDto(String voucherTitle, String voucherDescription, int voucherTotal) {
		this.voucherTitle = voucherTitle;
		this.voucherDescription = voucherDescription;
		this.voucherTotal = voucherTotal;
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

	public int getVoucherTotal() {
		return voucherTotal;
	}

	public void setVoucherTotal(int voucherTotal) {
		this.voucherTotal = voucherTotal;
	}
}
