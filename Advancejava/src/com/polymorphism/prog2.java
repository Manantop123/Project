package com.polymorphism;

import java.util.Scanner;

public class prog2 {
	
	static int a;
	
	void getval()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vale");
		a= sc.nextInt();
	}
	void printval()
	{
		System.out.println("value of a is"+a);
	}
	
	public static void main(String[] args) {
		prog2 p2 = new prog2();
		p2.getval();
		p2.printval();
	}
}
