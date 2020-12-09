package com.cognixia.jump.entities;

public class Location {
private	int idLocation;
private	String locationAddress;

	public Location() {
		
	}
	public Location( String locationAddress) {
		
		this.locationAddress = locationAddress;
	}

	public Location(String locationAddress, int idLocation) {
		this.locationAddress = locationAddress;
		this.idLocation = idLocation;
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