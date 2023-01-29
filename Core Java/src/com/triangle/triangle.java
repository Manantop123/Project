package com.triangle;

public class triangle {
	public static void main(String[] args) {
		/*
	// normal pattern 
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		
		/*
		 
		 // normal reveres pattern
		  * 
		 
		for(int i=1; i<=4; i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		int number;
		for(int i=1; i<=5; i++)
		{
			number =1;
			for(int j=1; j<=i;j++)
			{
				System.out.print(number++);
			}
			System.out.println("");
		}
		for(int i=1; i<=4; i++)
		{
			number =1;
			for(int j=4; j>=i; j--)
			{
				System.out.print(number++);
			}
			System.out.println("");
		}
	}
}

