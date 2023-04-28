package calculate;


class  tri
{
	int a,b,c;
	
	public double getArea()
	{
		double p=(a+b+c)/2.0;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public double getPerimeter()
	{
		return (a+b+c)/2.0;
	}
}

public class triangle {
	public static void main(String[] args) {
		tri t1 = new tri();
		t1.a=3;
		t1.b=4;
		t1.c=5;
		
		System.out.println("perimeter of triangle is"+" "+t1.getPerimeter());
		
		System.out.println("area of triangle is"+" "+t1.getArea());
	}
}
