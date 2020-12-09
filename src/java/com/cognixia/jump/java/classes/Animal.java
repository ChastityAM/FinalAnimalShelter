package com.cognixia.jump.entities;

import java.sql.Date;

public class Animal {

int idAnimal;
String animalType;
String animalStatus;
Date animalDate;
int locId;


	public Animal() {

	}

	public void Animal(int idAnimal, String animalType, String animalStatus, Date animalDate, int locId) {

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

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", animalType=" + animalType + ", animalStatus=" + animalStatus
				+ ", animalDate=" + animalDate + ", locId=" + locId + "]";
	}



}