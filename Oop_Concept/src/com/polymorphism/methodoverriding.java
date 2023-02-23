package com.polymorphism;

/*
 poly morphism concept devide into 2 parts.
 		1)method overloading
 		2)method overriding
 		
 		here we see method overriding.
 		
 		means , diffrent class name , same method name , same argument,inheitance.

 */


class ABC
{
	void show()
	{
		System.out.println("abc class");
	}
}
class XYZ extends ABC
{
	
	void show()
	{
		System.out.println("xyz class");
	}
}

public class methodoverriding extends XYZ{
	public static void main(String[] args) {
		XYZ x1 = new XYZ();
		x1.show();
		System.out.println();
		ABC a1 = new ABC();
		a1.show();
	}
}
