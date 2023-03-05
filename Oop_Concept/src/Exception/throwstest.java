package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 
 	--> throws keyword is used along with method
 	
 	--> throw leyword used inside method
 	
 	throws keyword is used when we dont want to compile time exception 
 	&
 	exception genrate when another class is used that method.
 	
 	throws keyword is used for compile time exception.
 	
 	
 	
 */

class testers
{
	void ReadAndWrite() throws FileNotFoundException
	{
		FileInputStream Fis = new FileInputStream("D:manan.txt");
	}
}
public class throwstest extends testers{
	public static void main(String[] args) {
		throwstest t1 = new throwstest();
		try
		{
		t1.ReadAndWrite();
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
		System.out.println("hello");
	}
}

