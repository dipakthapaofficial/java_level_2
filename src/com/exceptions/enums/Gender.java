package com.exceptions.enums;


public enum Gender {
	
	OTHERS("Others", 1),
	MALE("Male", 2),
	FEMALE("Female", 3);
	
	private String value;
	
	private int id;
	
	private Gender(String value, int id) {
		this.value = value;
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public int getId() {
		return id;
	}
	
	public static Gender findGenderById(int id) {
		for (Gender gen : Gender.values()) {
			if (gen.id == id) {
				return gen;
			}
		}
		return null;
	}
	
}
