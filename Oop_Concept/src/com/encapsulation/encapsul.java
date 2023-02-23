package com.encapsulation;


class employee
{
	private int id;
	
	public void setid(int id1)
	{
		this.id = id1;
	}
	public int getid()
	{
		return this.id;
	}
}
public class encapsul {
	public static void main(String[] args) {
		employee e = new employee();
		e.setid(101);
		System.out.println(e.getid());
	}
}
