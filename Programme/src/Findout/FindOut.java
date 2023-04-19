package Findout;

import java.util.Scanner;

public class FindOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.println("enter character");
		c=sc.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("vowel");
		}
		else if(c=='b'||c=='c'||c=='d')
		{
			System.out.println("constant");
		}
		else
		{
			System.out.println("error");
		}
		
	}
}
