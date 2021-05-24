package com.simplilearn.single.inheritance;

public class Bike extends Vehile{
	
	void service() {
		System.out.println("6 months of service");
	}
	//overriding the superclass
	public float run() {
		return 200;
	}
}
