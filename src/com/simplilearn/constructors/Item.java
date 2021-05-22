package com.simplilearn.constructors;

public class Item {

	public int item_id;
	public String item_name;
	public String item_desc;
	public float item_price;
	public int item_quantity;
	Item(){};
	
	Item(int id, String name, String desc){
		this.item_id = id;
		this.item_name=name;
		this.item_desc=desc;	
	}
}
	
	
	
	
	



