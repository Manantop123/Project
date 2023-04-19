package countinteger;

import java.util.Scanner;

public class countinteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("enter number");
		
		number = sc.nextInt();
		
		int count =(number+"").length();
		
		System.out.println(count);
		

	}
}
