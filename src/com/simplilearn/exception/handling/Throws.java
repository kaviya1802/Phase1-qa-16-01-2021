package com.simplilearn.exception.handling;

import java.io.IOException;

import org.omg.CORBA.TRANSACTION_MODE;

public class Throws {

	public static void main(String[] args) {
		// Throws keyword is used to declare(annunce_ the exception
		try {
			transaction(100);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Name:"+e.getClass());
			System.out.println("Error Name:"+e.getMessage());
		}
	}
	
	public static void transaction(int amount) throws IOException {
		if(amount>0) {
			System.out.println("Valid Amount:"+amount);
		}else {
			throw new IOException("Invalid Amount:"+amount);
			
		}
	}
}
