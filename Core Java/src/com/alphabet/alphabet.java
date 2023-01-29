//programme2
package com.alphabet;

import java.util.Scanner;

public class alphabet {
	public static void main(String[] args) {
		char ans;
		System.out.println("enter chareacter");
		Scanner sc = new Scanner(System.in);
		ans = sc.next().charAt(0);
		
		
		if(ans=='a' || ans=='e' || ans=='i' || ans=='o' || ans== 'u' || ans=='A' || ans=='E' || ans=='I' || ans=='O' || ans== 'U')
		{
			System.out.println("vowel");
		}
		else if(ans=='b' || ans == 'c' || ans=='d' || ans=='f' || ans=='g' || ans=='h' || ans=='j' || ans=='k'|| ans=='l' || ans=='m' ||
				ans=='n' || ans == 'p' || ans=='q' || ans=='R' || ans=='s' || ans=='t' || ans=='v' || ans=='w'|| ans=='x' || ans=='y'
				|| ans=='z' || ans=='B' || ans == 'C' || ans=='D' || ans=='F' || ans=='G' || ans=='H' || ans=='J' || ans=='K'|| ans=='L' || ans=='M' ||
				ans=='N' || ans == 'P' || ans=='Q' || ans=='R' || ans=='S' || ans=='T' || ans=='V' || ans=='W'|| ans=='X' || ans=='Y'
				|| ans=='Z')
		{
			System.out.println("constant");
		}
		else
		{
			System.out.println("number or symbol not allowed");
		}
	}
}
