package com.abstrac;


abstract class bike
{
	public bike() {
		System.out.println("first called");
	}
	abstract void run();
	
	void changegerar()
	{
		System.out.println("last called");
	}
}

class honda extends bike
{
	@Override
	void run() {
		System.out.println("second called");
	}
}
public class pro4 {

	public static void main(String[] args) {
		bike b1 = new honda();
		b1.run();
		b1.changegerar();
	}
}
