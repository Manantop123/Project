package com.keyword;


//current class 
public class thiskeyword {
	
	//variable declaration
	String stud_name;
	int stud_age;
	String stud_address;
	
	//constructor
	public thiskeyword(int age, String name, String add)
	{
		this.stud_name=name;
		this.stud_age=age;
		this.stud_address=add;
	}
	
	
	
	//method
	void show()
	{
		System.out.println("name"+this.stud_name + " "+"age"+this.stud_age+""+"address"+this.stud_address);
	}
	
	//to use current class method
	
	void display()
	{
		this.show();
	}
	
	public static void main(String[] args) {
		//object creation
		thiskeyword t1 = new thiskeyword(22, "manan", "ahmedabad");
		t1.show();
		t1.display();
	}
}

/*
	this is keyword. its predrfine reserved word.
	
	-->this keyword refer currebt class instance variable.
	
	-->this keyword refer currnt class method.
	
	-->this keyword is used to passs an argument in  method call.
	
	-->this keyword is used to passs an argument in  constructor  call.
	
*/