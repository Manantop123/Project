package com.keyword;


class person
{
	int id;
	String fname;
	
	person(int id, String fname)
	{
		this.id = id;
		this.fname = fname;
	}
}
class emp extends person
{
	float salary;
	
	emp(int id, String fname, float salary)
	{
		super(id, fname);
		this.salary=salary;
	}
	void display()
	{
	System.out.println("id is"+" "+id+" "+"fname"+" "+fname+" "+" "+"salary"+" "+salary);	
	}
}

public class superkeyword {
	public static void main(String[] args) {
		emp e1 = new emp(1, "manan", 50000f);
		e1.display();
	}
}
