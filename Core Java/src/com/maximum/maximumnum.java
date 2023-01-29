//programme 1
package com.maximum;

//here we cannot use parametrized contructor bcz of condition statment 

public class maximumnum {
	
	
	long a,b,c;
	maximumnum()
	{
		a = 1200;
		b =5000;
		c= 2000;
		System.out.println("this is default constructor");
	}
	maximumnum(maximumnum m1)
	{
		a = m1.a;
		b = m1.b;
		c = m1.c;
		System.out.println("copy constructor");
	}
	void size()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is maximum" + a);
			}
			else
			{
				System.out.println("c is maximum"+ c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is maximum" + b);
			}
			else
			{
				System.out.println("c is maximum" + c);
			}
		}
	}
	
	public static void main(String[] args) {
		maximumnum m1 = new maximumnum();
		m1.size();
		maximumnum m3 = new maximumnum(m1);
		m3.size();
	}
}
