package com.factorial;

public class factorial {
	public static void main(String[] args) {
		int i,number=5,fact=1;
		for(i=1; i<=number;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of "+ number + "is" + fact);
	}

}
