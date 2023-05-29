package com.alphabet;


class Rectangle
{
	double length;
	double breadth;
	
	Rectangle(double length ,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	//method for area
	public void area()
	{
		double areaofrectangle;
		
		areaofrectangle = this.length *this.breadth;
		
		System.out.println("area of rectangle is "+ " "+ areaofrectangle);
	}
	
	public void per()
	{
		double areaofper;
		
		areaofper = 2*(this.breadth*this.length);
		
		System.out.println("area of per is"+ " "+areaofper);
	}
}
public class inherit extends Rectangle{
	inherit(double length, double breadth) {
		super(length, breadth);
	
	}

	public static void main(String[] args) {
		inherit i = new inherit(10,2);
		i.area();
		i.per();
	}
}
