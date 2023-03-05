package com.constructor;


//create class
public class copyconstructor {
	//variable declaration which store float and integer value
	double width,height,depth;

	
	//create default constructor
	public copyconstructor() {
		
		//initialize varaible value
		width=20;
		height=2;
		depth=3;
	}


	//crate parameterized constructor with 3 argument
	public copyconstructor(double width, double height, double depth) {
		
		//refer current class variable 
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}


	//create copy constructor
	public copyconstructor(copyconstructor c1) {
		
		//refer default constructor. here we assign variable value using default constructor object
		
		width = c1.width;
		height=c1.height;
		depth=c1.depth;
	}
	
	//method
	void volume()
	{
		System.out.println("multiplication of box is"+ " "+(width*depth*height));
	}
	
	//main
	public static void main(String[] args) {
		copyconstructor c1 = new copyconstructor();
		c1.volume();
		copyconstructor c2 = new copyconstructor(1.5,2.5,3);
		c2.volume();
		copyconstructor c3 = new copyconstructor(c1);
		c3.volume();
	}
}
