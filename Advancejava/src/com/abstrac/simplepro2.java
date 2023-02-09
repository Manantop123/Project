package com.abstrac;

abstract class shape
{
	abstract void draw();
}
class rectangle extends shape
{
	@Override
	void draw() {
		System.out.println("rectangle");
	}
}
class square extends shape
{
	void draw() {
		System.out.println("square");
	}
}

public class simplepro2 {
	
	public static void main(String[] args) {
		shape s1 = new square();
		s1.draw();
	}
}
