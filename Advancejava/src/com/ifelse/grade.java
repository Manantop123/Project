package com.ifelse;

import java.util.Scanner;

public class grade {	
	
	float marks;
	void getval()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		marks = sc.nextFloat();
	}
	void display()
	{
		if(marks>=91 && marks<=100)
		{
			System.out.println("AA");
		}
		else if(marks>=81 && marks<=90)
		{
			System.out.println("BB");
		}
		else if(marks>=71 && marks<=80)
		{
			System.out.println("CC");
		}
		else  if(marks>=61 && marks<=70)
		{
			System.out.println("DD");
		}
		else if(marks>=51 && marks<=60)
		{
			System.out.println("EE");
		}
		else if(marks>=41 && marks<=50)
		{
			System.out.println("ff");
		}
		else if(marks<=40)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("enter valid character");
		}
	}
	public static void main(String[] args) {
		grade g1 = new  grade();
		g1.getval();
		g1.display();
	}
}
