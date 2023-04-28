//method overrding
package calculate;

public class areatwo {
	public static void main(String[] args) {
		square s1 = new square();
		s1.area(3);
		
		rectangle r1 = new rectangle();
		r1.area(4, 3);
	}
}
class square
{
	void area(double x)
	{
		System.out.println("area of  square is"+Math.pow(x, 3));
	}
}
class rectangle
{
	void area(double x,double y)
	{
		System.out.println("area of rectangle is"+x*y);
	}
}
