//programme 5

package com.math;

import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		int i=1, sum=0, avg=0;
		Scanner sc = new Scanner(System.in);
		for(i=1; i<=5;i++)
		{
			sum=sum+i;
			System.out.println("number is "+""+i);
			System.out.println("5 number sum is"+" " +sum);
			

		}
		avg=sum/5;
		System.out.println("5 number avg is"+" " +avg);
	}
}
