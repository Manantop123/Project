package Exception;

/*
 	try & catch block .
 	
 	--> java programme run from top to bottom . every method inside code occur exception.
 		
 		So, mthod create  try & catch object . which consist of 3  things.
 		
 		when programm is compiler. jvm check report if it's not define then it handle by default exception handler
 							
 								or else if yes then you need to handle manually.
 		
 		
 		
 		 i) execption name
 		 
 		 ii) exception desc
 		 
 		 iii) stack trace means in which line exception genrate
 		 
 		 
 		 syntax of try & catch block
 		 
 		 try
 		 {
 		 	//risky code
 		 }
 		 catch(exception e)
 		 {
 		 	i) e.printStackTrace();
 		 	
 		 		--> consist of exception name , exception desc , stack trace
 		 		
 		 	ii) syso(e.getMessage());
 		 		
 		 		--> consist of only exception name
 		 		
 		 	iii) syso(e.toString());
 		 	
 		 		--> consist of exception name , exception desc.
 		 }
 	
 */

public class test {
	public static void main(String[] args) {
			
			int a =100 ,b =0,c;
			c=a/b;
			System.out.println(c);
			
		
	}
}
