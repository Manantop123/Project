package com.constructor;

public class prog2 {
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id + " "+name);
	}
	public static void main(String[] args) {
		prog2 p2 = new prog2();
		prog2 p3 = new prog2();
		p2.display();
		p3.display();
	}
}
