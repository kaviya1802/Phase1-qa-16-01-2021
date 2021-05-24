package com.simplilearn.staticfinal;

public class StaticTest {

	public static void main(String[] args) {
		// Static variable/methods are directly accessible with class name.
		Student.getMarks();
		
		//Non - static variable/methods need instance/object to operate
		Student st = new Student();
		st.getAvgarks();
	}

}
