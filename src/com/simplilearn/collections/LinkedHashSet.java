package com.simplilearn.collections;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		// Linked Hash Set --> not allows duplicate
		//preserve insertion order
		
		java.util.LinkedHashSet<String> emplist = new java.util.LinkedHashSet<String>();
		emplist.add("John Smith");
		emplist.add("Mike Smith");
		emplist.add("Mary Smith");
		emplist.add("David Smith");
		emplist.add("Will Smith");
		emplist.add("John David");
		
		System.out.println("The Employee List is ::"+emplist);
		
		emplist.remove("Mary Smith");
		
		Iterator<String> itr = emplist.iterator();
		while(itr.hasNext()) {
			System.out.println(" -->"+itr.next());
		}
	}

}
