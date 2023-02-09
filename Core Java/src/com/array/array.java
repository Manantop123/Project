package com.array;

public class array {
	public static void main(String[] args) {
		int[] age = {1,2,3,4};
		
		System.out.println("accessing element of an array");
		System.out.println("index of first element"+age[0]);
		System.out.println("index of second element"+age[1]);
		System.out.println("index of third element"+age[2]);
		System.out.println("index of fourth element"+age[3]);
		
		System.out.println("looping through element");
		
		//here we use length function for to  get an array of size.
		
		for(int i=0; i<age.length; i++)
		{
			System.out.println("element wise"+age[i]);
		}
		
	}
}
