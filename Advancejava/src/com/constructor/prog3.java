package com.constructor;

public class prog3 {
	
	int id;
	String name;
	
	prog3()
	{
		
	}
	
	prog3(int i , String n)
	{
		id =i;
		name =n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		prog3 p3 = new prog3();
		p3.display();
		prog3 p4 = new prog3(10,"manan");
		p4.display();
	}
}
