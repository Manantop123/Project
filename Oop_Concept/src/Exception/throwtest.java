package Exception;

import java.util.Scanner;

/*
 	--> throw keyword is used to create user define exception
 	--> for custom exception
 	
 	
 	throw keyword only used for create exception object only cannot handle exception.
 	
 	for handle exception need to use ttry & catch block
 */

class YoungerAgeException extends RuntimeException
{
	public YoungerAgeException(String msg) {
		super(msg);
	}
}
public class throwtest {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int ans = sc.nextInt();
		try
		{
		if(ans<20)
		{
			throw new YoungerAgeException("u r not eligible");
		}
		else
		{
			System.out.println("u eligible");
		}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
