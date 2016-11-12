package com.serial;

import java.util.Stack;

public class DemoQueuq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listing l1 = new Listing(1,"Yogesh");
		Listing l2 = new Listing(2,"Naik");
		Listing l3 = new Listing(3,"Rajendra");
		Listing l4 = new Listing(4,"Esha");
		Listing l5 = new Listing(5,"Priyanka");
		
		Listing l6 = new Listing(6,"Raje");
		Listing l7 = new Listing(7,"Kshitij");
		
		Queue qt = new Queue();
		
		qt.addQueue(l1);
		qt.addQueue(l2);
		qt.addQueue(l3);
		qt.addQueue(l4);
		qt.addQueue(l5);
		
		//qt.display();
		
		qt.removeQueue();
		qt.removeQueue();
		
		qt.addQueue(l6);
		qt.addQueue(l7);
		qt.removeQueue();
		qt.removeQueue();
//		qt.removeQueue();
//		qt.removeQueue();
//		qt.removeQueue();
		
		qt.display();
		
	
		
	}

}
