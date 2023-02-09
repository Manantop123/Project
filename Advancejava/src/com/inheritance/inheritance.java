package com.inheritance;


class a
{
	void parentmethod()
	{
		System.out.println("this is parent class");
	}
}
class b extends a
{
	void childclass()
	{

		System.out.println("this is child class");
	}
}
class c extends b
{
	void childcclass()
	{
		System.out.println("this is child child class");
	}
}

public class inheritance {
	public static void main(String[] args) {
		c c1 = new c();
		c1.childclass();
		c1.childcclass();
		c1.parentmethod();
	}
}
