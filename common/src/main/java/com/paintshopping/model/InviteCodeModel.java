package com.paintshopping.model;

import com.paintshopping.ref.CodeStatus;
import com.paintshopping.ref.InviteCodeType;

public class InviteCodeModel {
	private int inviteId;
	private String inviteTitle;
	private String inviteDescription;
	private InviteCodeType inviteType;
	private int inviteProductId;
	private int inviteUserId;
	private byte inviteAmount;
	private String inviteStartedDate;
	private String inviteExpiredDate;
	private byte inviteLimitPerUser;
	private CodeStatus inviteStatus;

	public InviteCodeModel() {
		// TODO Auto-generated constructor stub
	}

	public InviteCodeModel(int inviteId, String inviteTitle, String inviteDescription, InviteCodeType inviteType, int inviteProductId,
			int inviteUserId, byte inviteAmount, String inviteStartedDate, String inviteExpiredDate,
			byte inviteLimitPerUser, CodeStatus inviteStatus) {
		super();
		this.inviteId = inviteId;
		this.inviteTitle = inviteTitle;
		this.inviteDescription = inviteDescription;
		this.inviteType = inviteType;
		this.inviteProductId = inviteProductId;
		this.inviteUserId = inviteUserId;
		this.inviteAmount = inviteAmount;
		this.inviteStartedDate = inviteStartedDate;
		this.inviteExpiredDate = inviteExpiredDate;
		this.inviteLimitPerUser = inviteLimitPerUser;
		this.inviteStatus = inviteStatus;
	}

	public int getInviteId() {
		return inviteId;
	}

	public void setInviteId(int inviteId) {
		this.inviteId = inviteId;
	}

	public String getInviteTitle() {
		return inviteTitle;
	}

	public void setInviteTitle(String inviteTitle) {
		this.inviteTitle = inviteTitle;
	}

	public String getInviteDescription() {
		return inviteDescription;
	}

	public void setInviteDescription(String inviteDescription) {
		this.inviteDescription = inviteDescription;
	}

	public InviteCodeType getInviteType() {
		return inviteType;
	}

	public void setInviteType(InviteCodeType inviteType) {
		this.inviteType = inviteType;
	}

	public int getInviteProductId() {
		return inviteProductId;
	}

	public void setInviteProductId(int inviteProductId) {
		this.inviteProductId = inviteProductId;
	}

	public int getInviteUserId() {
		return inviteUserId;
	}

	public void setInviteUserId(int inviteUserId) {
		this.inviteUserId = inviteUserId;
	}

	public byte getInviteAmount() {
		return inviteAmount;
	}

	public void setInviteAmount(byte inviteAmount) {
		this.inviteAmount = inviteAmount;
	}

	public String getInviteStartedDate() {
		return inviteStartedDate;
	}

	public void setInviteStartedDate(String inviteStartedDate) {
		this.inviteStartedDate = inviteStartedDate;
	}

	public String getInviteExpiredDate() {
		return inviteExpiredDate;
	}

	public void setInviteExpiredDate(String inviteExpiredDate) {
		this.inviteExpiredDate = inviteExpiredDate;
	}

	public byte getInviteLimitPerUser() {
		return inviteLimitPerUser;
	}

	public void setInviteLimitPerUser(byte inviteLimitPerUser) {
		this.inviteLimitPerUser = inviteLimitPerUser;
	}

	public CodeStatus getInviteStatus() {
		return inviteStatus;
	}

	public void setInviteStatus(CodeStatus inviteStatus) {
		this.inviteStatus = inviteStatus;
	}

}
