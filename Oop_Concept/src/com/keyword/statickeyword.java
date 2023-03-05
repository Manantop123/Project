package com.keyword;

/* note about static keyword
 
 	--> used to declare class , method , variable as static.
 	--> declare attribute or behaviour as static is assosiated with class rather than it's object..
 	--> static keyword cannot use with outer clss.
 	
 	--> static keyword is used for memory manangement.use static for programme memory efficience.

 	--> and vlaue which are same for every object we can define as static.
 
 	--> we cannot use this keyword with inside static method block
 
 
 */
public class statickeyword {
	//variable
	String sname;
	int age;
	//use static keyword
	static String cname="j g collage";
	
	//constructor
	public statickeyword(String name , int age) {
		this.sname = name;
		this.age =age;
	}
	//normal method
	void display()
	{
		System.out.println(this.sname+" "+this.age+" "+this.cname);
	}
	
	//static method
	static void show()
	{
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		statickeyword s1 = new statickeyword("manan", 22);
		statickeyword s2 = new statickeyword("ronak", 23);
		s1.display();
		s2.display();
		//static method call using class name
		statickeyword.show();
	}
}
