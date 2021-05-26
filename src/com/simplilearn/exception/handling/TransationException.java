package com.simplilearn.exception.handling;

public class TransationException extends Exception {

		String message;
		
		public TransationException(String message){
			this.message= message;
		}
		
		
		public String getMessage() {
			return message;
		}

		public String toString() {
			return "::Transaction Exception ::" +message;
		}
	}
