package com.simplilearn.collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// Array List: can have multiple objects
		
		List<String> namelist = new java.util.ArrayList<String>();
		
		namelist.add("Bob");
		namelist.add("John");
		namelist.add("Mike");
		namelist.add("Bill");
		namelist.add("David");
		System.out.println("The Namelist is::"+namelist);
		System.out.println(namelist.get(2));
		
		System.out.println("**********************");
		//Old way of iterator collection using Iterator
		Iterator<String> itr = namelist.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Name ::"+itr.next());
		}
		System.out.println("**********************");
		//Enhanced for loop or foreach
		for (String name : namelist) {
			System.out.println("Name ::"+name);
		}
	}
	

}
