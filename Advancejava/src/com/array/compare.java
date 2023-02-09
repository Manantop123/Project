package com.array;

public class compare {
	public static void main(String[] args) {
		String str1 = "topsint.com" ,str2 = "TOPSint.com";
		CharSequence cs = "topsint.com";
		System.out.println("compare"+str1+"and"+cs+":"+str1.contentEquals(cs));
		System.out.println("compare"+str2+"and"+cs+":"+str2.contentEquals(cs));
		
		//here programme that compare last 2 char
		
		String str3 = "Java Exercises" , str4="Java Exercise";
		CharSequence cse = "Java Exercise";
		
		System.out.println("compare last two char"+str3+"and"+cse+":"+str3.contentEquals(cse));
		System.out.println("compare last two char"+str4+"and"+cse+":"+str4.contentEquals(cse));
		
		String str5 = "Red is favourite color" ,str6=" Orange is favourite color";
		CharSequence css = "Red is favourite color";
		
		System.out.println("compare color"+str5+"and"+css+":"+str5.contentEquals(css));
		System.out.println("compare color"+str6+"and"+css+":"+str6.contentEquals(css));
	}
}
