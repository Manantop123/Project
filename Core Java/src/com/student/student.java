package com.student;

public class student {
	
	String name;
	int age;
	String address;
	
	public student(String name,int age, String address)
	{
		this.name = name;
		this.age= age;
		this.address = address;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	public void setage(int age)
	{
		this.age = age;
	}
	
	public void setaddress(String address)
	{
		this.address= address;
	}
	
	public String getname()
	{	
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	public String getaddress()
	{
		return address;
	}
	
/*	
	public void tostring()
	{
		System.out.println("student name is"+" "+this.name+" "+"student age is"+" "+this.age+" "+"student address is"+" "+this.address);
	}
*/	
	public static void main(String[] args) {
		student s1 = new student("manan", 22, "ahmedbad");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address);
		vehical v1 = new vehical();
		v1.display();
	}
}
