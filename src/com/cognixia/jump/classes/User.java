package com.cognixia.jump.classes;

public class User {

private	int idUser;
private	String userName;
private	String userPhone;
private	String userEmail;
private	String userPassword;
private	int locationId;

public User() {
	
}

public User(String userName, String userPhone, String userEmail, String userPassword, int locationId) {	
	this.userName = userName;
	this.userPhone = userPhone;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.locationId = locationId;
}

public User(int idUser, String userName, String userPhone, String userEmail, String userPassword, int locationId) {
	this.idUser = idUser;
	this.userName = userName;
	this.userPhone = userPhone;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.locationId = locationId;
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
	return "User [idUser=" + idUser + ", userName=" + userName + ", userPhone=" + userPhone + ", userEmail=" + userEmail
			+ ", userPassword=" + userPassword + ", locationId=" + locationId + "]";
}
	

	

}