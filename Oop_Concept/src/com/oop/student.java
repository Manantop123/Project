package com.oop;

public class student {
	protected String name,address;
	int age;
	
	
	//constructor
	public student(String name, String address, int age)
	{
		//use "this" keyword for refer current class variable
		this.name = name;
		this.address = address;
		this .age = age;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	public void setaddress(String address)
	{
		this.address= address;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public String getname()
	{
		return this.name;
	}
	public String address()
	{
		return this.address;
	}
	public int age()
	{
		return this.age;
	}
	
	//string method to return value
	public String tostring()
	{
		return "student name is"+" "+this.name+" "+"\n" +"student addess is"+ " "+this.address+"\n"+"student age is"+" "+this.age;
	}
	public static void main(String[] args) {
		student stud = new student("manan", "ahmedabad", 22);
		//method call
		System.out.println(stud.tostring());
	}
	
}
/*
	oop : its object oriented programming language.
			which concenpt is form of programming paradiagm.
	
			there are some form of programming paradiagm. to solve problem using different way programming 
			language is called programming  paradiam.
			
			1)structure oriented
			2)object oriented
			3)functional oriented
			4)logical oriented
			
			
		object oriented programme has 6 pillars 
		
			i)class
			ii)object & method
			iii)inheritance
			iv)data abstraction
			v)polymophism
			vii)data encapsulation
			
			Here data encapsulation & data abstraction is used for security.
			&&& polymorphism & inheritance used for code reusability.
			
			 i) class
			 --> class is blueprint or programming prototype or  collection of object.
			 
			 --> class doesnt occupy memory.
			 
			 --> class is not real world enitity.
			 
			 --> here in this example use student as class. bcz there collage have external student or regular student.
			 
			 --> another example of class is animal . dog is animal and lion is animal .both can run. both have diffrent sound.
			 

			example of class is 
			
			access_modifiers class class_name
			{
			 	
			 	//properties
			 	//constructor
			 	//method
		}
		
		
			ii) object 
			
			--> object is real world entity.
			--> object can occupy memory.
			--> object are stire in heap memory.
			--> object consist of 3 thing
				i) state/attribute
				2)behaviour
				3)instance of class
		
		like in this example use student class has stud object. 
		student has state/attribute like  student_name,stuent_age,student_address.
		student has behaviour like student can enroll cource. student can speak more than 2 language.
		
		another example animal as class
		
		animal have 2 object i)dog ii)lion
		animal have state/attribute like color,name,breed
		animal have behavior like run , eat.
		
		
		there are 5 way to define object
		
			i)using new keyword
			ii)newinstance method
			iii)clone method
			iv)factory method
			v)deseralization
		 
		 here new keyrod through create object
		 
		 class_name object_name = new class_name();
		 
		 new keyword is allocate memory for an object.
		 
		 and new keyword is follow by a call to class constructor.
		 
		 
		syntax of object
		
		//class
		class animal
		{
			//state/attribute
			String color , name ;
			int age;
			
			//behaviour
			public void run()
			{
				syso("can run");
			}
			public void eat()
			{
				syso("can eat");
			}	
			
			//main method
			main()
			{
			anmimal dog = new animal();
			
			//object with method
			dog.run();
			dog.eat();
		}
		
		
		
		
		
*/