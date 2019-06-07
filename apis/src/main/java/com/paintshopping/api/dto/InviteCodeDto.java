package com.paintshopping.api.dto;

public class InviteCodeDto {
	private String inviteTitle;
	private String inviteDescription;
	
	public InviteCodeDto() {
	}
	
	public InviteCodeDto(String inviteTitle, String inviteDescription) {
		this.inviteTitle = inviteTitle;
		this.inviteDescription = inviteDescription;
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
}
