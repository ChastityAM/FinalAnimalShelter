package com.cognixia.jump.enums;

public enum AnimalStatus {
	AVAILABLE("available"),
	ADOPTED("adopted");

	private String text;
	
	AnimalStatus(String text) {
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
