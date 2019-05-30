package com.paintshopping.model;

public class UserModel {
	
	private int userId;
	private String userName;
	private String userPass;
	private String userFullName;
	private boolean userGender;
	private String userBirthday;
	private String userAddress;
	private String userPhone;
	private String userEmail;
	private String userCreatedDate;
	private String userUpdatedDate;
	
	public UserModel() {
		
	}
	
	public UserModel(int userId, String userName, String userPass, String userFullName, boolean userGender,
			String userBirthday, String userAddress, String userPhone, String userEmail, String userCreatedDate,
			String userUpdatedDate) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userFullName = userFullName;
		this.userGender = userGender;
		this.userBirthday = userBirthday;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userCreatedDate = userCreatedDate;
		this.userUpdatedDate = userUpdatedDate;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public boolean isUserGender() {
		return userGender;
	}
	public void setUserGender(boolean userGender) {
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
	public String getUserCreatedDate() {
		return userCreatedDate;
	}
	public void setUserCreatedDate(String userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}
	public String getUserUpdatedDate() {
		return userUpdatedDate;
	}
	public void setUserUpdatedDate(String userUpdatedDate) {
		this.userUpdatedDate = userUpdatedDate;
	}
}
