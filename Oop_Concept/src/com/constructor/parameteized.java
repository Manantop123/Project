package com.constructor;

public class parameteized {
	
	double width,height,depth;

	public parameteized(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	void volume()
	{
		System.out.println((width*depth*height));
	}
	
	public static void main(String[] args) {
		parameteized p1 = new parameteized(10, 1,20);
		p1.volume();
	}

}
