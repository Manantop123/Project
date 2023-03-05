package com.keyword;

/*
 	this keyword and super keyword is refrence variable.
 	
 	this keyword is refrence current class object.
 	
 	super keyword is refrence parent class object.
 */

class tester
{
	int age=22;
	String name="manan";
	
	int no=2;
}
public class superkeyword extends tester {
	static String cname="j g collage";
	int no=20;
	
	public superkeyword() {
		super();
		}
	
	void disp()
	{
		System.out.println(this.age + " "+this.name+" "+this.cname);
	}
	
	void show()
	{
		//this syntaxt output is 20 bcz cuurnt class value is use
		System.out.println(no);
		//here use this keyword to refer currnt class so here output is 20
		System.out.println(this.no);
		//here use super keyword to refer parent class object.
		System.out.println(super.no);
	}
	public static void main(String[] args) {
		superkeyword s1 = new superkeyword();
		s1.disp();
		s1.show();
	}
	
}
