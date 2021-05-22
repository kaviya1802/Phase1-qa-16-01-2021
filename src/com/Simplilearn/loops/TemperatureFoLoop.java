package com.Simplilearn.loops;

public class TemperatureFoLoop {

	public static void main(String[] args) {
		// Use case : Temperature counte using for loop
		
		float temp = 0.0f;
		for(;temp<100;) {
			System.out.println("The current temperature is:"+temp);
			temp = temp+20;
			System.out.println("Increased temperature is:"+temp);
		}
		for(;temp>0;) {
			System.out.println("The current temperature is:"+temp);
			temp = temp-20;
			System.out.println("Increased temperature is:"+temp);
		}
	}

}
