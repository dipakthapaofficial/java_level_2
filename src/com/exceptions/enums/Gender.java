package com.exceptions.enums;


public enum Gender {
	
	MALE("M"),
	OTHERS("O"),
	FEMALE("F");
	
	private String val;
	
	Gender(String val) {
		this.val = val;
	}
	
	public String getValue() {
		return this.val;
	}
}
