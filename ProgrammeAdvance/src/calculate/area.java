//example of method overloading
package calculate;

public class area {
	public static void main(String[] args) {
		calculatearea c1 = new calculatearea();
		c1.area(4);
		c1.area(10,12);
	}
}
class calculatearea
{
	void area(float x)
	{
		System.out.println("the area of square is"+Math.pow(x, 2));
	}
	void area(float x , float y)
	{
		System.out.println("the area of rectangle is"+x*y);
	}
}
