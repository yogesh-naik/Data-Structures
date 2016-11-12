package com.serial;
/*
 * Programming Exercises Chapter 3 - Problem 20
 */
public class ExpandableStack {

	private int TOP;
	private int MAX=3;
	private Listing[] data;
	
	ExpandableStack(){
		data = new Listing[MAX];
		TOP = -1;		
	}
	
	public boolean push(Listing node){
		if(TOP<MAX-1){
			TOP++;
			data[TOP] = node;
			return true;
		}
		else{
			System.out.println("Stack reached to MAX");
				MAX = MAX *2;
				Listing[] temp = data;
				data = new Listing[MAX];
				
				for(int i=0;i<=TOP;i++)
					data[i] = temp[i];
				
					TOP++;
					
					data[TOP] = node;					
					
			}
		return true;
	}
	
	public void displayStack(){
		if(TOP ==-1)
			System.out.println("Stack is empty");
		else{
			for(int i=TOP;i>=0;i--)
				System.out.println(data[i].toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpandableStack st = new ExpandableStack();
		
		Listing l1 = new Listing(1,"Yogesh");
		Listing l2 = new Listing(2,"Naik");
		Listing l3 = new Listing(3,"Rajendra");
		Listing l4 = new Listing(4,"Esha");
		
		st.push(l1);
		st.push(l2);
		st.push(l3);
		st.push(l4);
		
		st.displayStack();
		System.out.println("new max "+st.MAX);
		
	}

}
