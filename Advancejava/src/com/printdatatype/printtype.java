package com.printdatatype;



public class printtype {
	
	public int print(int a)
	{
		System.out.println(a);
		return a;
	}
	public float print(float b)
	{
		System.out.println(b);
		return b;
	}
	public double print(double c)
	{
		System.out.println(c);
		return c;
	}
	public String print(String d)
	{
		System.out.println(d);
		return d;
	}
	
	public static void main(String[] args) {
		printtype p1 = new printtype();
		p1.print(10);
		p1.print(10.1);
		p1.print(0.221);
		p1.print("manan");
	}
}
