package com.paintshopping.api.dto;

import com.paintshopping.ref.Gender;

public class UserDto {
	private String userName;
	private String userFullname;
	private Gender userGender;
	private String userBirthday;
	private String userAddress;
	private String userPhone;
	private String userEmail;
	
	public UserDto(String userName, String userFullname, Gender userGender, String userBirthday, String userAddress, String userPhone, String userEmail) {
		this.userName = userName;
		this.userFullname = userFullname;
		this.userGender = userGender;
		this.userBirthday = userBirthday;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
	
	public UserDto() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFullname() {
		return userFullname;
	}

	public void setUserFullname(String userFullname) {
		this.userFullname = userFullname;
	}

	public Gender getUserGender() {
		return userGender;
	}

	public void setUserGender(Gender userGender) {
		this.userGender = userGender;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
