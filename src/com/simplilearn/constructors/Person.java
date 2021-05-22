package com.simplilearn.constructors;

public class Person {
	
	public int id;
	public String name;
	public int age;
	
	public Person() {};
	
	public Person(String name) {
	 this.name=name;
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Person(int id, String name, int age) {
		this.id = id;
		this.name=name;
		this.age=age;
	}
	}

