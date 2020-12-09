package com.cognixia.jump.entities;

public class User {

	int idUser;
	String userName;
	int userPhone;
	String userEmail;
	String userPassword;
	int locationId;

	public User() {

	}

	public void User(int idUser, String userName, int userPhone, String userEmail, String userPassword, int locationId) {

	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", userPhone=" + userPhone + ", userEmail="
				+ userEmail + ", userPassword=" + userPassword + ", locationId=" + locationId + "]";
	}

}