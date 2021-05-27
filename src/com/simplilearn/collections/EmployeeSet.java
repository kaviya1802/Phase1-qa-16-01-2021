package com.simplilearn.collections;

import java.util.LinkedHashSet;

public class EmployeeSet {

	public static void main(String[] args) {
		//LinkedHashSet
		
		Employee emp1 = new Employee(100, "John Smith", 10000, "Engineering");
		Employee emp2 = new Employee(101, "Will Smith", 20000, "IT department");
		Employee emp3 = new Employee(102, "Marry Smith", 20000, "Banking");
		Employee emp4 = new Employee(103, "David Smith", 20000, "Civil dept");
		Employee emp5 = new Employee(104, "Bill Smith", 20000, "HR");
		
		LinkedHashSet<Employee> employees= new LinkedHashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		for (Employee emp :employees) {
			System.out.println(+emp.id+ "  "+emp.name+"  "+emp.salary+ "  "+emp.dept);
		}
	}

}
