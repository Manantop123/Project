package Exception;


/*
 	Finalize is genrate their body if exception is genrate or not.
 	
 	syntax of finally block
 	/*
 	try
 	{
 		//code
 	}
 	finally
 	{
 		//code
 	}
 	
	//another syntax
	
	 	try
	 	{
	 		//code
	 	}
	 	catch()
	 	{
	 		//code
	 	}
	 	finally
	 	{
	 		//code
	 	}
	 
	
	 Rules of finally block
	 
	 --> we can use more than 1 catch block but we can only use 1 finally block.
	 
	 --> whenever we use jump statment finally after try block finally block must be execute.
	 
	 
	 what is diffrence between final , finalize & finally.
	 
	 ans ...
	 		-->	
 */

public class finallytest {
	public static void main(String[] args) {
		
		try
		{
			int a=10, b=0, c;
			System.out.print(a);
			System.out.println();
			System.out.print(b);
			System.out.println();
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		finally {
			System.out.println("must be execute");
		}
		
	}
}
