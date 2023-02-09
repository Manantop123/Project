package com.samemethod;

public class samemethod {
	
	public void print(int n, char c)
	{
		System.out.println("integer n is"+" "+n+" "+"character c is "+" "+c);
	}
	public void print(char c , int n)
	{
		System.out.println("character  c is"+" "+c+" "+"integer n is"+" "+n);
	}
	
	public static void main(String[] args) {
		samemethod s1 = new samemethod();
		s1.print(10, 'm');
		s1.print('m', 20);
	}
}
