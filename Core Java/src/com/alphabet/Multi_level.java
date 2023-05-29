package com.alphabet;

class Member
{
	
	String name;
	int age;
	int phone_number;
	String address;
	double salary;
	
	public Member(String name , int age, int number , String add , double salary)
	{
		this.name = name;
		this.age  =age;
		this.phone_number = number;
		this.address = add;
		this.salary = salary;
	}
	
	public void printSalary()
	{
		System.out.println("employee salary is"+" "+salary);
	}
}

class Employee extends Member
{
	public Employee(String name, int age, int number, String add, double salary) {
		super(name, age, number, add, salary);
	}
	String pecialization;
	String department;
	
	
}

class Mananger extends Member
{
	public Mananger(String name, int age, int number, String add, double salary) {
		super(name, age, number, add, salary);
	}
	String pecialization;
	String department;
	
}

public class Multi_level {
	public static void main(String[] args) {
		Employee e = new Employee("Manan", 21,910686533, "Ahmedabad", 22000);
		System.out.println("name is "+ " "+ e.name);
		System.out.println("age is"+ " "+e.age);
		System.out.println("number is"+" "+e.phone_number);
		System.out.println("address is"+" "+e.address);
		e.printSalary();
		
		System.out.println();
		
		Mananger m = new Mananger("Bhavin", 32, 990450, "Ahmedabad", 50000);
		System.out.println("name is "+ " "+ m.name);
		System.out.println("age is"+ " "+m.age);
		System.out.println("number is"+" "+m.phone_number);
		System.out.println("address is"+" "+m.address);
		m.printSalary();
	}
}
