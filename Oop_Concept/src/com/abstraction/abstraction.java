package com.abstraction;


/*
 	--> data abstraction means hidding internal details and showing functionality is known as abstarction.
 	
 	--> every abstarct class have at least 1 or more than one abstract methos.
 	
 	--> child class having responsibility to declare method.
 	
 	--> diffrence between data abstraction & data encapsulation is that data abstraction hiddiing 
 		the implementation details & data encapsulation is hidding data.
 		
 	--> example of data abstartcion is that as in car case , parts like , acceslerator , break , horn etc.
 		are shown to driver bcz they are neccessary for driving. 
 		
 		but the driver does not need to know internal functionality how they all function work.
 		
 	showing relevant data to user and hiding implementation details from user is abstraction.
 	
 	notes:--
 	
 		1) a method without body (no implementation) is known as  abstract method.
 		
 		2) a method must always declare in abstract class.
 		
 		3) if regular class extend abstract class then the class must have implment abstract class method.
 		
 		4) we can't create object of abstact class.
 */

abstract class vehical
{
	int no_Of_Tyre;
	
	abstract void start();
}

class bike extends vehical
{
	int no_Of_Tyre = 2;
	
	public void start()
	{
		System.out.println("bike method");
	}
}
class car extends vehical
{
	int no_Of_Tyre = 4;
	
	public void start()
	{
		System.out.println("car method");
	}
}
public class abstraction {
	public static void main(String[] args) {
		bike b1 = new bike();
		b1.start();
		System.out.println();
		car c1 = new car();
		c1.start();
	}
}
