package com.constructor;


/*
 * 	constructor : constructor name same name as class name.
 * 
 * 				we don't need to explicit create constructor. constructor is called automatically.
 * 				can create more than one constructor. 
 * 
 *  			constructor name same name as class name.
 *  			no return type.
 *  			constructor is automatically called when object is created.
 *  
 *  
 *  		there are three types of constructor .
 *  		1) default constructor.
 *  		2)copy constructor.  -- > it passed object as an argument.
 *  		3)parameterized constructor.
 *  
 *  
 * 
 */
public class constructor {
	double width,height,depth;

	//default constructor
	
	constructor()
	{
		width = 10;
		height = 20;
		depth = 5;
		
		System.out.println("default constructor");
	}
	// paramaetrized constructor
	constructor(double w , double h, double d)
	{
		width = w;
		height = h;
		depth = d;
		
		System.out.println("parametrized contructor");
	}
	
	//copy constructor
		constructor(constructor c1)
		{
			width=c1.width;
			height=c1.height;
			depth=c1.depth;
			System.out.println("copy constructor");
		}
		
		
	void volume()
	{
		System.out.println("box size is"+(width*height*depth));
	}
	
	
	
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
		constructor c2 = new constructor(20,30,1);
		c2.volume();
		constructor c3 = new constructor(c1);
		c3.volume();
	}
	
}
