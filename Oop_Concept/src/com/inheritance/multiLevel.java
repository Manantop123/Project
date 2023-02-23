package com.inheritance;


class Box
{
	protected double height;
	protected double width;
	protected double depth;
	public Box(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public double volume()
	{
		return height*depth*width;
	}
	
}
class BoxWeight extends Box
{
	double weight;

	public BoxWeight(int height, int width, int depth, double weight) {
		super(height, width, depth);
		this.weight = weight;
	}
}
class ShipMent extends BoxWeight
{
	double cost;

	public ShipMent(int height, int width, int depth, double weight, double cost) {
		super(height, width, depth, weight);
		this.cost = cost;
	}
}
public class multiLevel {
	public static void main(String[] args) {
		ShipMent s1 = new ShipMent(1, 2, 3, 5, 1.31);
		double vol = s1.volume();
		System.out.println("the volumn of shipment is"+" "+vol);
		System.out.println("weight of shipment is"+" "+s1.weight);
		System.out.println("shiiping cost is"+" "+s1.cost);
	}
}
/*
	there are more than 2 class in multi-level inheritance.
	
	like example class A, class B, class C
	
	Class A is parent class. class B is child class for class A . class c is child class for parent clsss B.
	

*/