package com.polymorphism;


class first
{
	void display()
	{
		System.out.println("main first class");
	};
}
class second extends first
{
	void display()
	{
		System.out.println("second class");
	}
}
class thoird extends first
{
	void display()
	{
		System.out.println("third class");
	}
}
public class prog4 {
	public static void main(String[] args) {
	first f1 = new second();
	f1.display();
	first f2 = new thoird();
	f2.display();
	}
}
