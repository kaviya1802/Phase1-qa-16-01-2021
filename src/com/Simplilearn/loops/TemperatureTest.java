package com.Simplilearn.loops;

public class TemperatureTest {

	public static void main(String[] args) {
		// Use Case: Increase Temperature by 20 till it reaches 100
		
		float temperature = 0.0f;
		while(temperature<100) {
			System.out.println("Current Temperature:"+temperature);
			temperature = temperature+20;
			System.out.println("Increased Temperature"+temperature);
		}
		System.out.println("******************************");
		while(temperature>0.0f) {
			System.out.println("Current Temperature:"+temperature);
			temperature = temperature-20;
			System.out.println("Increased Temperature"+temperature);
		}

	}

}
