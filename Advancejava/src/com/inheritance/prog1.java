package com.inheritance;


class shape 
{
	void printshape()
	{
		System.out.println("this is shape");
	}
}
class rect extends shape
{
	void printrect()
	{
		System.out.println("this is rect");
	}
}

class circle extends shape
{
	void printcircle()
	{
		System.out.println("this is circle");
	}
}
class square extends rect
{
	void squara()
	{
		System.out.println("this is square of rect");
	}
}
public class prog1 {
	public static void main(String[] args) {
		square s1 = new square();
		s1.printshape();
		s1.printrect();
	}
}
