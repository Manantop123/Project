package com.array;

public class Getcharacter {
	public static void main(String[] args) {
		char[] name = {'T','O','P','S',' ','T','E','C','h','N','O','L','O','G','I','E','S'};
		
		System.out.println("The character at position 0 is"+name[0]);
		System.out.println("The character at position 10 is"+name[10]);
		
		
		//for loop
		
		int nameleg = name.length;
		System.out.println("the length of array is"+(nameleg-1));
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
	}
}
