package com.exceptions.enums;


public enum Gender {
	
	OTHER("Other", 1, 40.5f),
	MALE("Male", 2, 40.5f),
	FEMALE("Female", 3, 40.5f);
	
	private String value;
	
	private float wage;
	
	private int id;
	
	private Gender(String value, int id, float d) {
		this.value = value;
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public int getId() {
		return id;
	}
	
	public float getWage() {
		return wage;
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
