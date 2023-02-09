package com.abstrac;


abstract class marks{
	abstract void getpercentage();
	
}
class A extends marks
{
	int physics,chem,maths;
	
	A(int p,int c,int m)
	{
		physics =p;
		chem = c;
		maths = m;
	}
	
	@Override
	void getpercentage() {	
		System.out.println((physics+chem+maths)/3);
	}
	
}
class B extends marks
{
	int physics,maths,chem,eng;
	
	B(int p, int m, int c,int e)
	{
		physics = p;
		maths = m;
		chem =c;
		eng = e;
	}
	
	@Override
	void getpercentage() {
		System.out.println((physics+maths+chem+eng)/4);
	}
}
public class pro5 {
	public static void main(String[] args) {
	A a1= new A(100,100,100);
	B b1 = new B(100,100,100,100);
	
	a1.getpercentage();
	b1.getpercentage();
}
}
