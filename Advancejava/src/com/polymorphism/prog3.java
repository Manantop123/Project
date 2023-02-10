package com.polymorphism;

public class prog3 {
	static int a= 10;
	static int b=a*2;
	
	static void meth(int x)
	{
		System.out.println("x"+x);
		System.out.println("a"+a);
		System.out.println("b"+b);
	}
	{
		System.out.println("bloack 1 called");
	}
	{
		System.out.println("static block initialize");
	}
	{
		System.out.println("bloack 2 is called");
	}
	public static void main(String[] args) {
		meth(12);
	}
}
