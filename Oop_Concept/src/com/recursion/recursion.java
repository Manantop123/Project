package com.recursion;

//class call itself its called recursion.

public class recursion {
	static int facto(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n * facto(n-1);
		}
	}
	public static void main(String[] args) {
		recursion r1 = new recursion();
		int x =5;
		System.out.println("the factorial of n is"+ " "+facto(x) );
	}
}
