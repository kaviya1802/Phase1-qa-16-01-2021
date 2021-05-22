package com.Simplilearn.loops;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		// While Loop Test: Simple Counter Examples
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number value:");
		
		int n = input.nextInt();
				
		int count = 0;
		while(count<n)
		{
			//While with true -> Always running loop
			System.out.println("The count value is: "+count);
			count ++; //Terminator
		}
	}

}
