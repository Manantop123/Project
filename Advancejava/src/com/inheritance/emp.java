package com.inheritance;

import java.util.Scanner;

class member
{
	String name,address;
	int age;
	double phone;
	int salary;
	
	Scanner sc = new Scanner(System.in);

	
	void empmaster()
	{
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter address");
		address = sc.next();
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("enter phone number");
		phone = sc.nextDouble();
		System.out.println("enter employee salary");
		salary = sc.nextInt();
	}
	void printempmaster()
	{
		System.out.println("name is"+" "+name);
		System.out.println("address is"+" "+address);
		System.out.println("age is"+ " "+age);
		System.out.println("phone number"+ " "+phone);
		System.out.println("salary is"+ " "+salary);
	}
	
}
class employee extends member
{
	String specialization;
	String department;
	
	Scanner sc = new Scanner(System.in);
	
	void empadditional()
	{
		System.out.println("enter specialization");
		specialization = sc.next();
		System.out.println("enter department");
		department = sc.next();
	}
	void printadditional()
	{
		System.out.println("specialization is"+ " "+specialization);
		System.out.println("department is"+ " "+department);
	}
	
}
class manager extends member
{
	String specialization;
	String department;
	
	Scanner sc = new Scanner(System.in);
	
	void manageradditional()
	{
		System.out.println("enter specialization");
		specialization = sc.next();
		System.out.println("enter department");
		department = sc.next();
	}
	void printmanageradditional()
	{
		System.out.println("specialization is"+ " "+specialization);
		System.out.println("department is"+ " "+department);
	}
}
public class emp {
	public static void main(String[] args) {
		employee e1 = new employee();
		manager m1 = new manager();
		
		System.out.println("employee");
		e1.empmaster();
		e1.empadditional();
		
		e1.printempmaster();
		e1.printadditional();
		
		System.out.println("manager");
		
		m1.empmaster();
		m1.manageradditional();
		
		m1.printempmaster();
		m1.printmanageradditional();
	}
}
