package Findout;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("enter character");
		ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':	
			{
				System.out.println("vowel");
				break;
			}
			
			case 'B':
			case 'b':
			case 'c':
			case 'C':
			case 'd':
			case 'D':
			case 'F':
			case 'f':
			case 'g':
			case 'G':
			{
				System.out.println("constant");
				break;
			}
			default:
				System.out.println("error");
		}
	}
}
