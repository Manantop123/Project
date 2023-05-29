package assignment1;

import java.util.Scanner;

public class prograamme2 {
	public static void main(String[] args) {
		String a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character");
		a = sc.next();
	
		if(a.length()>1)
		{
			System.out.println("getting error");
		}
		else
		{
			System.out.println("user enter"+" "+a);
		}
	}
}		


