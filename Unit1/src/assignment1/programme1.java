package assignment1;

import java.util.Scanner;

public class programme1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number one");
		a= sc.nextInt();
		
		System.out.println("enter number two");
		b=sc.nextInt();
		
		System.out.println("enter number three");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is higher number");
			}
			else
			{
				System.out.println("c is higher number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is higher number");
			}
			else
			{
				System.out.println("c is higher number");
			}
		}
		
	}
}
