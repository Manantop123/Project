package com.abstrac;

import java.awt.DisplayMode;

abstract class shapeer
{
	abstract int rect(int length,int bredth);
	
	abstract int square(int side);
	
	abstract double round(double radius);
}
class areas extends shapeer
{
	@Override
	int rect(int length, int bredth) {
		
		return length*bredth;
	
	}
	void rect()
	{
		System.out.println(rect(10, 10));
	}
	
	@Override
	int square(int side) {
		return side*side;
	}
	void square()
	{
		System.out.println(square(10));
	}
	@Override
	double round(double radius) {
		return 31.5*(radius*radius);
	}
	void round()
	{
		System.out.println(round(10));
	}
}
public class pro6 {
	public static void main(String[] args) {
		areas a1 = new areas();
		a1.rect();
		a1.square();
		a1.round();
	}
	
}
