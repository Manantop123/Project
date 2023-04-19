package Programme;

import java.util.Scanner;

/*
Write a Java program to Take three numbers from the user and print the 
greatest number.
 */
public class GreatestNumber {
	

	public static void main(String[] args) {
		int a,b,c;	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		System.out.println("enter value of c");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
	}
}
