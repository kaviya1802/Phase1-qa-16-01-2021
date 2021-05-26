package com.simplilearn.exception.handling;

public class BalanceNotAvailable extends Exception {

	String message;
	
	public BalanceNotAvailable(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return "::Balance not Exist ::" +message;
	}
}
