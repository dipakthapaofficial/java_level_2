package exception.demo;


public class DipakException extends Exception {
	
	String message;
	
	int statusCode;
	
	String cause;
	
	DipakException() {
		this.message = "This is a default message for exception";
	}
	
	DipakException(String message) {
		super();
		this.message = message;
	}
	
	DipakException(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}
	
	DipakException(String message, int statusCode, String cause) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.cause = cause;
	}
	
}
