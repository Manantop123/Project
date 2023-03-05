package com.programme;

public class prime {
	public static void main(String[] args) {
		for(int j=1; j<=100; j++)
		{
		int flag =0;
		
		for(int i=2; i<=j-1; i++)
		{
			if(j%i==0)
			{
				flag=flag+1;
			}
		}
		if(flag==0)
		{
			System.out.println("is prime number"+j);
		}
		else
		{
			flag=0;
			//System.out.println("is not prime number");
		}
		}
	}
}
