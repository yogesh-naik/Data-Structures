package com.serial;

/*
 * This class runs the Stack demo.
 */
public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listing l1 = new Listing(1,"Yogesh");
		Listing l2 = new Listing(2,"Naik");
		Listing l3 = new Listing(3,"Rajendra");
		Listing l4 = new Listing(4,"Esha");
		Listing l5 = new Listing(5,"Priyanka");
		
		Stack st = new Stack();
		st.push(l1);
		st.push(l2);
		st.push(l3);
		st.push(l4);
		st.push(l5);
		
		//st.displayStack();
		
		st.pop();
		
		
		Listing l = st.pop();
		
		System.out.println(l);
		
		//st.displayStack();
		
	}

}
