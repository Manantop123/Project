//Programm2 

package com.alphabet;

import java.util.Scanner;

public class alphabetcase {
	public static void main(String[] args) {
		char ch;
		System.out.println("enter charcater");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
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
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		{
			System.out.println("constant");
		}
		default:
			System.out.println("number or symbol");
		}
	}
	}
