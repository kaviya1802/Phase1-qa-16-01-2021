package com.simplilearn.constructors;

public class MainClass {

	public static void main(String[] args) {
		
		Item item1= new Item();
		item1.item_id=100;
		item1.item_name="Masala";
		item1.item_desc="Masala with good taste";
		item1.item_price=35.5f;
		item1.item_quantity=1;
		
		Item item2 = new Item(101, "Badam", "Good protein");
		
		
		System.out.println("Item Details:");
		System.out.println("ID-> "+item1.item_id+" Name ->"+item1.item_name+" Description -> "+item1.item_desc+
				" Price -> "+item1.item_price+" Quantity -> "+item1.item_quantity);
		
		System.out.println("ID-> "+item2.item_id+" Name ->"+item2.item_name+" Description -> "+item2.item_desc+
				" Price -> "+item2.item_price+" Quantity -> "+item2.item_quantity);

	}

}
