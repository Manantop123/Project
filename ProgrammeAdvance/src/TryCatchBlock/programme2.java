package TryCatchBlock;

import java.util.Scanner;

public class programme2 {
	public static void main(String[] args) {
		try
		{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter no 1 :");
		a=sc.nextInt();
		
		System.out.println("enter no 2 :");
		b=sc.nextInt();
		
		c = a/b;
		System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("doesnot devide by 0");
		}
	}
}
