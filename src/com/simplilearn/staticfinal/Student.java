package com.simplilearn.staticfinal;

public class Student {
	
	
	//Static variable
	final static int marks= 100;  // final used to assign a constant/fixed value
	
	public float avr_marks=35.5f;//Non-static variable
	
	//Static method: Static variables can be used only inside static method
	/*cannot acess non-static variable inside static method*/
	public static void getMarks() {
		
		System.out.println("The marks are:"+marks);

	}
	
	//Non-static method
	public void getAvgarks() {
		System.out.println("The average marks is:" +avr_marks);
		System.out.println("The marks is:"+marks);//static va can be acessed inside non static method
	}
}
	
