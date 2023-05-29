package com.alphabet;


class GrandFather
{
	public void whoIs()
	{
		System.out.println("this is parent class");
	}
}
class Father extends GrandFather
{
	public void who()
	{
		System.out.println("this is parent child class");
	}
}

public class SIngleInheritance {
	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		Father f = new Father();
		f.whoIs();
	}

}
