package com.cognixia.jump.entities;

public class Location {
	int idLocation;
	String locationAddress;

	public Location() {

	}

	public void Location(int idLocation, String locationAddress) {


	}

	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	@Override
	public String toString() {
		return "Location [idLocation=" + idLocation + ", locationAddress=" + locationAddress + "]";
	}	
} 