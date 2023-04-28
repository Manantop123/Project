package inheritance;

import java.util.Scanner;

public class inherit2 {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.basic();
		e1.print();
		e1.printsalary();
		
		Manager m1 = new Manager();
		m1.basic();
		m1.print();
		m1.printsalary();
	}
}
class Member
{
	String name;
	int age;
	long phone_number;
	String address;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	
	
	void basic()
	{
		System.out.println("name of employee");
		name = sc.next();
		System.out.println("name of employee" + " "+name);
		System.out.println("age of employee");
		age=sc.nextInt();
		System.out.println("age of employee"+" "+ age);
		System.out.println("phone_number of employee");
		phone_number=sc.nextLong();
		System.out.println("phone_number of employee"+" "+ phone_number);
		System.out.println("address of employee");
		address = sc.next();
		System.out.println("address of employee"+" "+ address);
	}
	
	void printsalary()
	{
		System.out.println("salary of employee");
		salary = sc.nextDouble();
		System.out.println("salary of employee is"+" "+salary);
	}
}
class Employee extends Member{
	String specialization;
	String department;
	
	void print()
	{
		System.out.println("specialization of employee");
		specialization = sc.next();
		System.out.println("specialization"+" " +specialization);
		System.out.println("department of employee");
		department = sc.next();
		System.out.println("department"+" " +department);

	}
}
class Manager extends Member{
	String specialization;
	String department;
	
	void print()
	{
		System.out.println("specialization of employee");
		specialization = sc.next();
		System.out.println("specialization"+" " +specialization);
		System.out.println("department of employee");
		department = sc.next();
		System.out.println("department"+" " +department);
	}
}