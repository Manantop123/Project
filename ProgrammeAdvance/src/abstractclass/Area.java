package abstractclass;

import calculate.area;

abstract class Shape
{
	public abstract float RectangleArea();
	
	public abstract float SquareArea();
	
	public abstract float CircleleArea();
	
	
}
class Are{
	float length , breadth , radius;
	
	Are(float l ,float b, float r)
	{
		this.length =l;
		this.breadth = b;
		this.radius = r;
	}
	
	public float RectangleArea()
	{
		return length * breadth;
	}
	
	public float SquareArea()
	{
		return length * length;
	}
	
	public float CircleleArea()
	{
		return 3.15f*radius*radius;
	}
}

public class Area {
	public static void main(String[] args) {
		Are A1 = new Are(3,4, 5);
		
		System.out.println("rectangle area is"+" "+A1.RectangleArea());
		
		System.out.println("square area is"+ " "+A1.SquareArea());
		
		System.out.println("circle area is"+" "+A1.CircleleArea());
	}
}
