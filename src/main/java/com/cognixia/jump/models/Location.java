package com.cognixia.jump.models;

public class Location {
	
private	int idLocation;
private	String name;
private String phone;
private int address;

public Location() {
	
}

public Location(String name, String phone, int address) {

	this.name = name;
	this.phone = phone;
	this.address = address;
}

public Location(int idLocation, String name, String phone, int address) {
	
	this.idLocation = idLocation;
	this.name = name;
	this.phone = phone;
	this.address = address;
}

public int getIdLocation() {
	return idLocation;
}

public void setIdLocation(int idLocation) {
	this.idLocation = idLocation;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public int getAddress() {
	return address;
}

public void setAddress(int address) {
	this.address = address;
}

@Override
public String toString() {
	return "ShelterLocation [idLocation=" + idLocation + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
}


}