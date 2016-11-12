package com.serial;

public class Queue {

	private Listing[] data;
	private int MAX=-1;
	private static int count=0;
	
	Queue(){
		data = new Listing[100];
	}
	
	public boolean addQueue(Listing node){
	
		if(MAX <= 99){
			MAX++;
			data[MAX] = node;
			return true;
		}else{
			return false;
		}
	}
	
	public Listing removeQueue(){
		Listing temp = null;
		
		if(MAX == -1)
			return temp;
		if(count <= MAX){
			temp = data[count];
			count++;			
		}
		if(count > MAX){
			MAX = -1;
		}
		return temp;
	}
	
	public void display(){
		if(MAX==-1)
			System.out.println("Queue is empty");
		else{
			for(int i=count;i<=MAX;i++)
				System.out.println(data[i].toString());
		}
	}
}
