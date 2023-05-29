package assignment1;

import java.util.Scanner;

public class programme8 {
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		
		a = sc.nextInt();
		
		int count = (a + "").length();
		
		System.out.println(count);
	}
}
