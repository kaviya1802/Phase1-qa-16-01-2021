package com.simplilearn.constructors;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(); //Default Constructor
		p1.id = 100;
		p1.name = "John Smih";
		p1.age = 30;
		
		Person p2 = new Person("Mike Smith");//Parameterized Constructor
		Person p3 = new Person(101, "Kaviya");
		Person p4 = new Person(102, "Selva", 26);
		
		System.out.println("Data :: id ->" +p1.id+ " name ->"+p1.name+" age ->"+p1.age);
		System.out.println("Data :: id ->" +p2.id+ " name ->"+p2.name+" age ->"+p2.age);
		System.out.println("Data :: id ->" +p3.id+ " name ->"+p3.name+" age ->"+p3.age);
		System.out.println("Data :: id ->" +p4.id+ " name ->"+p4.name+" age ->"+p4.age);	}
}
