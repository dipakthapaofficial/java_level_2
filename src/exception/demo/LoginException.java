package exception.demo;


public class LoginException extends Exception {
	
	String message;
	
	LoginException() {
		this.message = "This is a default message for exception";
	}
	
	LoginException(String message) {
		super();
		this.message = message;
	}
	
}
