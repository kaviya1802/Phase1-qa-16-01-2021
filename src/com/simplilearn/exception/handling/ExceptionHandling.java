package com.simplilearn.exception.handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// Exception handling: 
		transaction(100, "John");


	}
	
	public static void transaction(int amount, String username) {
		
		int balance = 2000;
		int res = 0;
		try {
			res = balance/amount;
		}catch(Exception e){
			System.out.println("Exception occurs...");
		}
		
		System.out.println("Response :" +res);	
	}

}
