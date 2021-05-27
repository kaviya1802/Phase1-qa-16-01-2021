package com.simplilearn.collections;

import java.util.TreeSet;

import javax.security.auth.RefreshFailedException;

public class TreeSetTest {

	public static void main(String[] args) {
		// Tree Set 
		
		TreeSet<String> nameset = new TreeSet<String>();
		nameset.add("Kaviya");
		nameset.add("Selva");
		nameset.add("Kaviya");
		nameset.add("Sivam");
		nameset.add("Vishnu");
		nameset.add("Selvi");
		
		TreeSet<String> newset = (TreeSet<String>) nameset.descendingSet();
		for(String name : newset) {
			System.out.println("The Namelist contains::"+name);
		}

	}

}
