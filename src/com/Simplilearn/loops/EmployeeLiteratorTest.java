package com.Simplilearn.loops;

import java.util.Scanner;

public class EmployeeLiteratorTest {

	public static void main(String[] args) {
		// Employee Iterator Test
		
		String[] employees = {"John", "David", "Kaviya", "Archana", "Selva"};
		String company = "Simplilearn Tech";
		
		Scanner input = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("Employee Verification Tool");
		System.out.println("*******************************");
		System.out.println("Please enter the emloyee name:");
		String empName = input.next();	
		findEmployee(employees,empName);
	}
	public static void findEmployee(String[] employee, String empName) {
		boolean found = false;
		for (int i=0; i<employee.length;i++) {
			if(empName.equals(employee[i])) {
				System.out.println("Employee found at position "+i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not available");
		}
	}
}