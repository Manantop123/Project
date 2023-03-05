package com.keyword;

/*
 	final keyowrd value can not be changed.
 	
 	final keyword method cannot be overrite.
 	
 	final keyword class cannot extend or inherit.
 
 */

// we declare class as final so we will not inherit class
class test
{
	//if we declare age as final we will not overrite it.
	final int age =30;
	
	//if we declare display() method as final we will not overrite it
	void display()
	{
		System.out.println("this is final method");
	}
}
public class finalkeyword extends test{
	final int age=20; 
	
	final void display()
	{
		System.out.println("this is child class");
	}

}
