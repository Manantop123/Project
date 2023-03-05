package com.recursion;

public class factorecursive {
	
	public static void main(String[] args) {
		int x=5;
		System.out.println(facto(x));
	}
	static int facto(int i)
	{
		if(i==0 || i==1)
		{
			return 1;
		}
		else
		{
			return i * facto(i-1);
		}
	}
}
