package com.abstrac;


abstract class red
{
	abstract void run();
}
public class simplepro extends red{
	
	void run() {
		System.out.println("running safely");
	}
	public static void main(String[] args) {
	
	red r1 = new simplepro();
	r1.run();
	}
}
