package com.simplilearn.exception.handling;

import java.io.IOException;

public class Throw {

	public static void main(String[] args) {
		// Throw keyword is use to throw exception
		agevalidator(17);
	}
	public static void agevalidator(int age) {
		try {
			if(age>18) {
				System.out.println("Welcome to facebook!!!!");
			}else {
				throw new Exception("Not a valid age.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Name:"+e.getClass());
			System.out.println("Error Name:"+e.getMessage());
		}
		System.out.println("Age is: "+age);
	}
}
