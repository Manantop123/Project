package polymorphism;


/*	polymorphism : 
 * 
 *  --> poly means many , morphism means forms.
 *  --> example o building watchman ,  sound , shape
 *  --> devide into 2 parts 1) method overloading 2)method overriding
 *  
 *  1) method overloading :-- (static polymorphism , compile-time polymorphism)
 *  
 *  --> same name as class name , same name as method name , but diffrent argunent.
 *  
 *  --> java allows a function to have the same name if it can 
 *  		distinguish them by their number and type of argument.
 *  
 *  -->  for example ,  following function are diffrent in java:
 *  
 *  		1) float divide(int a , int  b)
 *  		2) float divide(float x , float y)
 *  		3) float devide (float a , int b)
 *  
 *  	that is the function divide() taking two int argument is diffrent from divide() taking two argument
 *  	, and also from divide() taking both int and float arguments. this is called function method overloading.
 *  
 *  		1) static/compile-time polymorpism :--
 *  			
 *  		when the compiler resolved the polymorphism during the compilation of the program , then we call 
 *  		such polymorphism as compile time polymorphism or static polymorphism. 
 *  
 *  		sometimes we also call it static binding.
 *  
 *  		take an example for finding the minimum number of integer types. suppose we want to find 
 *  		minimum number of double data types. then , we can use the concept of method overloading.
 */


public class polymorphism {
	public static void main(String[] args) {
		//for integer type
		int intvar1 =15;
		int intvar2 = 7; 
		int result1 = minFunction(intvar1 , intvar2);
		
		//for double type
		double doublevar1 = 14.5;
		double doublevar2 = 17.3;
		double result2 = minFunction(doublevar1 , doublevar2);
		
		System.out.println("the function value of integer type" + result1);
		System.out.println("the function value of double type" + result2);
	}
		public static int minFunction(int n1 ,int n2)
		{
			int min;
			if(n1>n2)
				min=n2;
			else
				min=n1;
			return min;
		}
		public static double minFunction(double n1, double n2)
		{
			double min;
			if(n1>n2)
				min = n2;
			else
				min = n1;
			
			return min;
		}
}
