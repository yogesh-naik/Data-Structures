package com.serial;
/*
 * Basic stack with push ,pop and display operations.
 */
public class Stack {
	private Listing[] Data;
	private int TOP = -1;
	
	public Stack(){
		Data = new Listing[100];		
	}
	
	public boolean push(Listing node){
		if(TOP <= 99){
			TOP++;
			Data[TOP] = node;
			return true;
		}
		else{
			return false;
		}
	}
	
	public Listing pop(){
		Listing temp;
		
		if(TOP == -1){
			return null;
		}else{
			temp = Data[TOP];
			TOP--;
			return temp;
		}
	}

	public void displayStack(){
		if(TOP ==-1)
			System.out.println("Stack is empty");
		else{
			for(int i=TOP;i>=0;i--)
				System.out.println(Data[i].toString());
		}
	}
}
