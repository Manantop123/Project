package com.programme;

/* reverse string programme
 
 --> here use length and charAt function
 
 */
public class reverse {
	public static void main(String[] args) {
		
		//String type variable
		String name = "Manan";
		
		//length function to check no of character in string
		int lan = name.length();
		
		//use String datatype to store reverse string
		String rev = " ";
		
		
		//& for loop 
		for(int i=lan-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("reverce name is"+ " "+name +" "+"reverse is"+" "+rev);
	}
}
