package com.inheritance;

public class inheritancedemo {
	public static void main(String[] args) {
		mountainbike m1 = new mountainbike(20, 10, 1);
		System.out.println("gear is:"+m1.gear);
		System.out.println("height is"+m1.setheight);
		System.out.println("speed height is"+m1.speed);
		m1.applybreak(1);
		System.out.println("bike speed after applying  break"+m1.speed);
		System.out.println("gear is:"+m1.gear);
		System.out.println("height is"+m1.setheight);
		System.out.println("speed height is"+m1.speed);
		m1.speedup(1);
		System.out.println("bike speed after applying  break"+m1.speed);
	}
}
