package com.cognixia.jump.entities;

import java.sql.Date;

public class Animal {

private int idAnimal;
private String URL;
private String animalType;
private String animalStatus;
private Date animalDate;
private int locId;

	public Animal() {
		
	}
	
	public Animal(String animalType, String animalStatus, Date animalDate, int locId) {
		this.animalType = animalType;
		this.animalStatus = animalStatus;
		this.animalDate = animalDate;
		this.locId = locId;
	}
	
	public Animal(int idAnimal, String animalType, String animalStatus, Date animalDate, int locId, String URL) {
		this.idAnimal = idAnimal;
		this.animalType = animalType;
		this.animalStatus = animalStatus;
		this.animalDate = animalDate;
		this.locId = locId;
		this.URL = URL;
	}



	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getAnimalStatus() {
		return animalStatus;
	}

	public void setAnimalStatus(String animalStatus) {
		this.animalStatus = animalStatus;
	}

	public Date getAnimalDate() {
		return animalDate;
	}

	public void setAnimalDate(Date animalDate) {
		this.animalDate = animalDate;
	}

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}
	
	
	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}
	
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", URL=" + URL + ", animalType=" + animalType + ", animalStatus="
				+ animalStatus + ", animalDate=" + animalDate + ", locId=" + locId + "]";
	}


}