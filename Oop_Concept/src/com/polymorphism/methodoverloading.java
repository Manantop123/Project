package com.polymorphism;


/*
	
	poly morphism means poly is many and morphism means form.
	
	its real world example.
	
	sound :- roar and barking
	
	shape :- rectangle and round
	
	in java poly morphism example.
	
	1. compile time. it's also called static polymorphism. achived through method overloading.
	
	2. run time. it's also called dynamic polymorphism. achived through method overriding.
	
 	poly morphism concept devide into 2 parts.
 		1)method overloading
 		2)method overriding
 		
 		here we see method overloading.
 		
 		means 1)same class name 2)same method name 3)diffrent argument
 */

public class methodoverloading {
	
	void show(String a)
	{
		System.out.println("old");
	}
	void show(String a, String b)
	{
		System.out.println("new");
	}
	public static void main(String[] args) {
		methodoverloading m1 = new methodoverloading();
		m1.show("manan");
		m1.show("manan","so");
	}
}
