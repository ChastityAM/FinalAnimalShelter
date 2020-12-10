package com.cognixia.jump.enums;

public enum AnimalType {
	CAT("Cat"),
	DOG("Dog"),
	BIRD("Bird"),
	SNAKE("Snake");
	
	private String name;

	AnimalType(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
