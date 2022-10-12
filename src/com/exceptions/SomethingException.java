package com.exceptions;

public class SomethingException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public SomethingException() {
		this.message = "Something Exception";
	}
	
	public SomethingException(String message) {
		super();
		this.message = message;
	}
	
}
