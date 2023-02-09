package com.array;

import java.awt.print.Printable;

public class interleaving {
	
	static void printinterleaving(String s1,int i,String s2,int j,String ans)
	{
		if(i==s1.length() && j==s2.length())
		{
			System.out.println(ans);
		}
		if(i<s1.length())
		{
			printinterleaving(s1, i+1, s2, j, ans+s1.charAt(i));
		}
		if(j<s2.length())
		{
			printinterleaving(s1, i, s2, j+1, ans+s2.charAt(j));
		}
	}
	public static void main(String[] args) {
		String s1 = "AB";
		String s2 = "CD";
		
		printinterleaving(s1, 0, s2, 0, "");
	}
}
