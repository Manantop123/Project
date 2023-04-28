package inheritance;

public class Inherit {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		b1.printA();
		c1.printB();
	
	}
}
class A
{
	void printA()
	{
		System.out.println("this is parent class");
	}
}
class B extends A
{
	void printB()
	{
		System.out.println("this is child class");
	}
}
class C extends B
{
	void printC()
	{
		System.out.println("this is child sub class");
	}
}
