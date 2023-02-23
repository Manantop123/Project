package com.inheritance;

//Parent class
class Bicycle
{
	//variable declaration
	protected int speed;
	protected int gear;
	
	
	//constructor
	public Bicycle(int speed, int gear)
	{
		this.speed= speed;
		this.gear = gear;
	}
	
	//method
	public void sppedup(int incr)
	{
		speed+=incr;
	}
	
	public void breakdown(int decr)
	{
		speed -= decr;
	}
}
// child class
class mountainbike extends Bicycle
{
	//variable declaration
	int setheight;
	
	public mountainbike(int setheight , int speed , int gear)
	{
		//keyword super to refer parent class variable 
		super(speed, gear);
		//use this keyword to refer current class variable
		this.setheight = setheight;
	}
}
//main class
public class inheritance
{
	//main method
	public static void main(String[] args) {
		mountainbike m1 = new mountainbike(20, 10, 1);
		System.out.println("mountain height is" + " " +m1.setheight);
		System.out.println("speed is"+ " "+m1.speed);
		System.out.println("gear is"+ " " + m1.gear);
		m1.breakdown(1);
		System.out.println("bike spped after apply is"+ " "+m1.speed);
		m1.sppedup(2);
		System.out.println("bike speed after apply is"+ " "+m1.speed);
	}
}



/*

	--> Inheritance is a relationship.
	--> relationship between 2 or more than 2 class. where 1 class is parenta class and other is child class.
	--> child class inherit properties of parent class.
	
	"""
	--> in this example create Bicycle class as parent class. and mountainbike as child class.
	
		so, child class can use all properties of parent class.
		
		we use super method to inherit variable of parent class variable.
		
		in inheritance use extend keyword to inherit properties.

	"""
	
		---> there are 3 types of inheritance.
		
			i) single level
			ii) multi-level
			iii) hirerchical level
			
			
			

*/