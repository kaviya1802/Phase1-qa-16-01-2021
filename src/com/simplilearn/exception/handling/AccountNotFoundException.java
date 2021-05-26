package com.simplilearn.exception.handling;

public class AccountNotFoundException extends Exception {
	
	private static final long serialVersionID =1L;
	
	String message;
	public AccountNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		this.message= message;
	}
	
	public String getMessage() {
		return message;
	}


	public String toString() {
		return "::::Account Not Found exception :::" + message;
	}
}
