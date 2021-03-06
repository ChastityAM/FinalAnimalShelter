package com.cognixia.jump.enums;

public enum ShelterLocation {
	NEW_YORK("New York", "NY", 1),
	LOS_ANGELES("Los Angeles", "LA", 2),
	CHICAGO("Chicago", "CHI", 3);
	
	
	private String full;
	private String acronym;
	private int code;
	
	ShelterLocation(String full, String acronym, int code) {
		this.setFull(full);
		this.setAcronym(acronym);
		this.setCode(code);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getFull() {
		return full;
	}

	public void setFull(String full) {
		this.full = full;
	}
}
