package com.loop;

public class forloop {
	
	void display()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		forloop fl = new forloop();
		fl.display();
		
		for(int a=0; a<=10;a++)
		{
			if(a==7)
			{
				break;
			}
			System.out.println("tops"+a);
		}
		System.out.println("after loop");
		System.out.println("tops");
	}
}
