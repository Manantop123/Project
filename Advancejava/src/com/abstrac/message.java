package com.abstrac;


abstract class parent
{
	abstract void message();
}
class firstclass extends parent
{
	void message() {
		System.out.println("first subclass");
	}
}
class secondclass extends parent
{
	void message() {
		System.out.println("second subclass");
	}
}
public class message {
	public static void main(String[] args) {
		parent p1 = new firstclass();
		p1.message();
		parent p2 = new secondclass();
		p2.message();
	}
}
