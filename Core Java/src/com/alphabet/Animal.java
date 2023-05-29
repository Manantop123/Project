package com.alphabet;

public class Animal {
	
	//fields
    String colur="red";
    int age=3;
	
	//constructur
	public Animal(String co , int ag)
	{
		this.colur = co;
		this.age =ag;
	}
	
	public Animal()
	{
		//default constructor
	}
	
	//method
	public void run()
	{
		System.out.println("this is behaviour of animal");
	}
	public static void main(String[] args) {
		Animal Dog = new Animal("brown",10);
		System.out.println("dog colur is"+" "+Dog.colur);
		System.out.println("dog age is"+" "+Dog.age);
		Dog.run();
		
		Animal Cat = new Animal("black",5);
		System.out.println("cat colour is"+" "+Cat.colur);
		System.out.println("cat age is"+" "+Cat.age);
		Cat.run();
		
		Animal Goat = new Animal();
		System.out.println("Goat clour is"+" "+Goat.colur);
		System.out.println("GOat age is"+" "+Goat.age);
		Goat.run();
	}
}
