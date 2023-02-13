
package com.encapsulation;

public class encapsulation {
	
	
	//define properies of entity
	
	private String name;
	private int age;
	private String address;
	
	//use constructor to intitailize value
	
	public encapsulation(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	//now we use setter method to overrite value
	
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
		this.address = address;
	}
	
	//now we use getter method to view overrirte return value
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
		return this.address;
	}
	
	public String tostring()
	{
		return("name is"+this.name+"age is"+this.age+"address is"+this.address);
	}
	public static void main(String[] args) {
		encapsulation e1 = new encapsulation("manan", 22, "ahmedabad");
		System.out.println(e1.tostring());
	}
}
