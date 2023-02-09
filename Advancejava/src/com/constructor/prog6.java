package com.constructor;

//copy constructor

public class prog6 {
	
	int id;
	String name;
	
	prog6()
	{
		id=10;
		name="manan soni";
	}
	
	prog6(prog6 p)
	{
		id = p.id;
		name= p.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		prog6 p1 = new prog6();
		p1.display();
		prog6 p2 = new prog6(p1);
		p2.display();
	}
}
