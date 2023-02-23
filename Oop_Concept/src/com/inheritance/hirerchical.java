package com.inheritance;

class Animal
{
	void eat()
	{
		System.out.println("animal can eat");
	}
}
class dog extends Animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class lion extends Animal
{
	void roar()
	{
		System.out.println("lion is roaring");
	}
}
public class hirerchical {
	public static void main(String[] args) {
		System.out.println("for dog");
		dog d1 = new dog();
		d1.eat();
		d1.bark();
		System.out.println("for lion");
		lion l1 = new lion();
		l1.eat();
		l1.roar();
	}
}

/*
 Hierarchical inheritance where child class inherit only one parent class.

	like class A, class B, class C
	
	class A is parent class , class B is child class inherit class A parent class , 
	class c is child class inherit class a parent class.	
*/