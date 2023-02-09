package com.areaprog;

import java.util.Scanner;

public class areaprog {
	
	static int length,width,sq;
	
	void readattribute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of rectangle");
		length = sc.nextInt();
		System.out.println("ente width of rectangle");
		width = sc.nextInt();
	}
	
	void readattributes()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter area of square");
		sq = sc.nextInt();
	}
	
	static int rectanglearea(int l,int b)
	{
		int area = l*b;
		return area;
	}
	static int squarearea(int a)
	{
		int square = a*a;
		return square;
	}
	
	public static void main(String[] args) {
		areaprog a1 = new areaprog();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter details about rectangle");
		a1.readattribute();
		System.out.println("area of rectangle is"+" "+a1.rectanglearea(length, width));
		
		System.out.println("\n enter details about square");
		a1.readattributes();
		System.out.println("area of square is"+" "+squarearea(sq));
	}
}
