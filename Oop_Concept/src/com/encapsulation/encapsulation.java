package com.encapsulation;


/*
 	data encapsulation :- try to break word data encapsulation.
 		
 			en capsul ation.
 			
 			--> where capsul means a pack of lot of things inside cube shape.
 			
 			--> in java encapsulation means restrict access of properties outside world.
 			
 			--> data encapsulation provide security to restrict access to instance of properties.
 			
 			--> data encapsulation is binding of data(variable) and code acting of data(method) together as single unit.
 			
 			--> in data encapsulation have getter and setter method.
 			
 			--> getter method said that you have your own way to give access to properties.
 			So, anybody can use name properites which is only one way it's by caling getter method.
 			
 			--> setter method is used to overwritten properties value.
 			
 			
 			step to achive ancapsulation :-
 			
 			1) declare variable of class as private.
 			2) provide getter and setter method to modify and view the variable valuess.
 			 
 */

public class encapsulation {
	private String name,address;
	private int age;
	
	public encapsulation(String name, String address , int age)
	{
		this.name = name;
		this.address= address;
		this.age = age;
	}
	
	public String getname()
	{
		return this.name;
	}
	public String getaddress()
	{
		return this.address;
	}
	public int getage()
	{
		return this.age;
	}
	
	public void setname(String name)
	{
		this.name =name;
	}
	
	public void setaddress(String address)
	{
		this.address = address;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public String tostring()
	{
		return "student name is"+" "+this.name+" "+"student address is"+" "+this.address+" "+"student age is"+""+this.age;
	}
	
	public static void main(String[] args) {
		encapsulation e1 = new encapsulation("manan","ahemadabad",22);
		String a;
		a=e1.tostring();
		System.out.println(a);
		
		
	}
	
	
}
