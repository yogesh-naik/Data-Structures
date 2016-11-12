package com.serial;
/*
 * This class is basically a data object.
 */
public class Listing {
	
	private int no;
	private String name;
	
	Listing(int i, String name) {
		// TODO Auto-generated constructor stub
		this.no = i;
		this.name = name;
	}


	@Override
	public String toString(){
		return (" No "+no + "\n  Name "+name);
	}
}
