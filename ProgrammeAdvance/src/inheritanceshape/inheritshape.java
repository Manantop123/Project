package inheritanceshape;

import calculate.rect;

class shape
{
	public void shapper() 
	{
		System.out.println("this is shape");
	}
}

class rectangle extends shape
{
	public void rectan()
	{
		super.shapper();
		System.out.println("this is rectangle shape");
	}
}

class square extends rectangle{
	
	public void squa()
	{
		super.shapper();
		System.out.println("square is rectangle");
	}
}
class Circle extends shape
{
	public void circ()
	{
		System.out.println("this is circle shape");
	}
}

public class inheritshape {
	public static void main(String[] args) {
		square s1 = new square();
		s1.shapper();
		s1.rectan();
	}
}
