package com.paintshopping.model;

import com.paintshopping.ref.CodeType;

public class CodeUserModel {
	private int codeUserId;
	private CodeType codeType;
	private int codeId;
	private int userId;
	private String codeStartUsingDate;
	private String codeLastUsingDate;
	private int voucherUsedTotal;
	private boolean codePending;
	

	public CodeUserModel(int codeUserId, CodeType codeType, int codeId, int userId, String codeStartUsingDate,
			String codeLastUsingDate, int voucherUsedTotal, boolean codePending) {
		this.codeUserId = codeUserId;
		this.codeType = codeType;
		this.codeId = codeId;
		this.userId = userId;
		this.codeStartUsingDate = codeStartUsingDate;
		this.codeLastUsingDate = codeLastUsingDate;
		this.voucherUsedTotal = voucherUsedTotal;
		this.codePending = codePending;
	}

	public CodeUserModel() {
	}

	public int getCodeUserId() {
		return codeUserId;
	}
	public void setCodeUserId(int codeUserId) {
		this.codeUserId = codeUserId;
	}
	public CodeType getCodeType() {
		return codeType;
	}
	public void setCodeType(CodeType codeType) {
		this.codeType = codeType;
	}
	public int getCodeId() {
		return codeId;
	}
	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCodeStartUsingDate() {
		return codeStartUsingDate;
	}
	public void setCodeStartUsingDate(String codeStartUsingDate) {
		this.codeStartUsingDate = codeStartUsingDate;
	}
	public String getCodeLastUsingDate() {
		return codeLastUsingDate;
	}
	public void setCodeLastUsingDate(String codeLastUsingDate) {
		this.codeLastUsingDate = codeLastUsingDate;
	}
	public int getVoucherUsedTotal() {
		return voucherUsedTotal;
	}
	public void setVoucherUsedTotal(int voucherUsedTotal) {
		this.voucherUsedTotal = voucherUsedTotal;
	}
	public boolean isCodePending() {
		return codePending;
	}
	public void setCodePending(boolean codePending) {
		this.codePending = codePending;
	}
}
