package com.constructor;

//constructor overloading

public class prog5 {
	
	int id;
	String name;
	int age;
	
	prog5(int i,String n)
	{
		id = i;
		name = n;
	}
	prog5(int i, String n , int a)
	{
		id = i;
		name = n;
		age = a;
	}
	void display()
	{
		System.out.println(id + " "+name+" "+age);
	}
	
	public static void main(String[] args) {
		prog5 p5 = new prog5(10,"manan");
		p5.display();
		prog5 p6 = new prog5(10,"rohan" ,22);
		p6.display();
		
		
	}
}
