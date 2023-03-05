package com.recursion;

public class fibborecursive {
	
	static int fibborec(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			int product =1;
			
			for(int i=1; i<=n; i++)
			{
				product = product*i;
			}
			return product;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibborec(5));
	}
}
