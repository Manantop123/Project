package Exception;


/*
 	exception can be identified as  unwanted situation or unexpected event which occur during run time programmes
 */

public class basic {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println(100/2);
		
		//at this line we getting arithmetic exception
		System.out.println(100/0);
		System.out.println("6");
		System.out.println("7");
	}
}

/*
	exception handling means handling unwanted situation or unexpected event it's called exception handling.
*/


/*		Exception hirerchy


	--> every class have parent class it's called object class.
	
	--> object class -- throwable class -- 
										(i) Exception class  (ii)errors class
										
		i) exception 	:- occur because of programme.
						   exception are recoverable e.g. programmer can handle by using try catch block.	
						   there are two types of exception
						   			1) compile time (checked exception)  2)runtime exception (unchecked exception)
						   			
		
		ii) error :- occur because lack of system resources.
					 exception are not recverable.programmer can handle them to their level.
					 error are only one type.
					 				1)runtime (unchecked exception)
					 
					 
					 There are 5 keyword in java to handle exception.
					 	1)try
					 	2)catch
					 	3)finally
					 	4)throw
					 	5)throws
					 	
					 	
			

*/