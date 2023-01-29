//programme 4
package com.leapyear;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		year = sc.nextInt();
		
		for(int i=2000; i<=year; i++)
		{
			if((i % 4==0) || (i % 400==0) || (i%100==0))
			{
				System.out.println("leap year"+i);
			}
			else
			{
				System.out.println("not leap year"+i);
			}
		}
	}
}
