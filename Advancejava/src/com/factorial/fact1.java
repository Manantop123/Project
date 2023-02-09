package com.factorial;

public class fact1 {
	
	static int factorial(int n)
	{
		int i,fact=1;
		for(i=1; i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	static int facto(int f)
	{
		if(f==0)
		{
			return 1;
		}
		return f * facto(f-1);
	}
	
	public static void main(String[] args) {
		int num=4;
		System.out.println("factorial of "+num+"is"+factorial(4));
		System.out.println("factorial of "+num+"is"+facto(4));
	}
}
