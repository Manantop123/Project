package com.areaprog;

import java.util.Scanner;

public class perimeter {
	public static void main(String[] args) {
		double a,b,c,perimeter,s,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter perimeter  of triangke");
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		perimeter = a+b+c;
		
		s=(a+b+c)/2;
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("the parametre is = %2.f\n"+perimeter);
		System.out.println("the semi parametre is = %2.f\n"+s);
		System.out.println("the area is = %2.f\n"+area);
		
		
	}
}
