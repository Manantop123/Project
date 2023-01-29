package com.constructor;


class base
{
	base()
	{
		System.out.println("base class");
	}
	void baserange()
	{
		System.out.println("base class method");
	}
}
class derived extends base
{
	derived()
	{
		System.out.println("derived class");
	}
}
public class inheritancewithconstructor {
	public static void main(String[] args) {
		System.out.println("manan");
		derived d1 = new derived();
		d1.baserange();
	}
}
