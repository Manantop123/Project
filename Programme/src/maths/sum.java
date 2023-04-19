package maths;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int i,sum=0,avg;
		Scanner sc = new Scanner(System.in);
		
		for(i=1; i<=5; i++)
		{
			System.out.println("enter 5 numer is "+i);
			sum=sum+i;
		}
		System.out.println("5 number sum is"+sum);
		avg = sum/5;
		System.out.println("avg is"+avg);
	}
}
