package com.constructor;

/*
 	constructor is block having same name as class name.
 	
 	constructor execute automatically when object is created. 
 	
 	the only modifiers are applicable for constructor are private , public , default , protected.
 	
 	it is special member function who's task to initialize value.
 	
	example of class
	
	class test
	{
		public test()
		{
		
			}
			main()
			{
				
			}
	}
 	
 	there are 3 types of constructor
 		i)default constructor
 		ii)parametrized constructor
 		iii)copy constructor
 		

 		
 		
 */

//default constructor

public class constructor {
	double width,height,depth;
	
	constructor()
	{
		width =30;
		height = 40;
		depth = 10;
		

	}
	
	protected void volume()
	{
		System.out.println("volume of box is"+" "+(width*height+depth));
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		c1.volume();
	}

}
