package com.polymorphism;

public class prog1 {
	
	int add(int a , int b)
	{
		return a+b;
	}
	int add(int a , int b ,int c)
	{
		return a*b*c;
	}
	int add(int a)
	{
		return a;
	}

	public static void main(String[] args) {
		prog1 p1 = new prog1();
		System.out.println(p1.add(10));
		System.out.println(p1.add(10, 20));
		System.out.println(p1.add(10, 20, 30));		
	}
}
