package com.positive;

import java.util.Scanner;

public class positive {
	
	public static void main(String[] args) {
		double number,count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter only number");
		number = sc.nextInt();
		
		for(count =0 ; number>0; number=number/10)
		{
			count=count+1;
		}
		System.out.println(count);
	}
}
