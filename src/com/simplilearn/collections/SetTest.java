package com.simplilearn.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		// Set --> HashSet/LinkedHashSet --> Allows only unique element
		//Hashset -> does not preserver insertion order
		
		HashSet<String> groceries = new HashSet<String>();
		groceries.add("Masala");
		groceries.add("Badam");
		groceries.add("Cashew");
		groceries.add("oil");
		groceries.add("Onion");
		groceries.add("Bread");
		
		System.out.println("The groceries List::"+groceries);
		
		groceries.remove("oil");
		
		System.out.println("The groceries List::"+groceries);
		
		for(String item : groceries) {
			System.out.println("  >"+item);
		}
	}

}
