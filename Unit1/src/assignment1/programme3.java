package assignment1;

import java.util.Scanner;

public class programme3 {
	public static void main(String[] args) {
		int n=2023;
		
		for(int i=1956; i<=n; i++)
		{
			if((i%4==0) || (i%400==0) ||(i%100==0))
			{
				System.out.println("leap year"+ " "+ i);
			}
			else
			{
				System.out.println("not leap year"+ " "+i);
			}
		}
	}
}
