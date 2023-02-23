package com.interfaces;


interface I1
{
	void show();
}
interface I2
{
	void display();
}
public class interfaces implements I1{
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		interfaces ob1 = new interfaces();
		ob1.show();
		ob1.display();
	}
}

/*
	data abstraction can be achived using 2 ways
		i) using abstract
		ii)using interface
		
		
		in abstract class have abstract method or conacat method 
		
		
		
		&&&
		
		in interface class have all method are abstact. java 8th  version we can create default access modifier with conact method in interface.

																and 9th version we can create public access modifier with conact method in interface.
																			
																			
		--> interface are bkueprint of class. it specify what class must do and not how.
		
		--> it is used to achive abstraction.
		
		--> it suppport multiple inheritance.
		
		--> this example is also used for method overriding.
		
		--> in interface we use implment keyword to inherit class.
		
		--> in interfcae all method are public , and abstratct
		
		--> in interface all fields are public , final , static 
		
		
*/