package com.simplilearn.multilevel;

public class Main {

	public static void main(String[] args) {
	Bike bike = new Bike();
	bike.service();
	System.out.println("No of wheels:"+bike.getWheels());
	System.out.println("Speed is: "+bike.run());
	}

}
