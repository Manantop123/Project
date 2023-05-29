package assignment1;

import java.util.Scanner;

public class programme5 {
	public static void main(String[] args) {
		int i,sum=0,avg;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=1; i<=5; i++)
		{
			System.out.println("enter  number between 1 to 5 is"+i);
			sum = sum+i;
		}
		System.out.println("sum is"+" "+sum);
		
		avg = sum/5;
		System.out.println("averages is"+" "+avg);
	}
}
