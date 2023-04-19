package dataabstraction;


/*
 * a well-designed modules hides all implementation details from the other modules is the most importanat factor
 * that a well-designed object-oriented module from other modules.
 * 
 * module hide all its implementaition details and clenly seprates its interface from is implementation.
 * this modules then  communicate with each other only through the intefaces. this concept is support
 * with the help of abstraction in java.
 * 
 * real world example is 
 * 
 * 		of an email, the user doesnot know about  the complex details such as what happens just after 
 * 		sending an email, which protocol is  used by the server to send the message.
 *		therefore, we just need to mention the address of the reciver, type the content and click the send
 *		button.
 *
 * 		this example is basically called abstraction in which the complex details hidden from the user.
 * 		nternal working.
 * 
 * 		in other words, the user will have just knowledge of what an entity is doing instead of its.
 * 
 *  
 *  	Note :- abstraction define an object in terms of 
 *  			properties(attribute)
 *  			behaviour(method)
 *  			interface(communicating with other object)
 *  
 *  	In java we can achive abstraction using abstract classes and interfaces. 
 *  
 *  	some point :
 *  
 *  		-->every abstarct class have atleast one abstract method as well as non abstract method.
 *  
 *  		-->an abstract class is class whose object cant be created.
 *  
 *  		-->an abstract class is created through the use of an abstract keyword.
 *  
 *  		-->abtsract class can also contain final and static method.
 *  
 *  		-->abstaction method are method with no implemenaion and without a method body.
 *  			they dont contain any method statment.
 *  		
 *  		-->an abstract method is declared with an abstract keyword.
 *  
 *  		-->must end with semicolon.
 *  
 *  
 *  
 */

abstract class BaseClass
{
	//abstract method
	abstract public void show1();
	
	//concrete method
	public void show2()
	{
		System.out.println("concrete method of parent class");
	}
}
//child class
class ChildClass extends BaseClass
{
	public void show1()
	{
		System.out.println("overrideing of an abstract class");
	}
	
	//overrding concrete method
	public void show2()
	{
		System.out.println("overrdieing concrete method");
	}
}
public class abstraction {
	  public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		c1.show1();
		c1.show2();
	}
}
/*
	Question 1: why do we need abstract classes in java?
	
	ans : - if we cant create object from abstratc clases and niether can't use them ,
	then what is the need for abstract classes.
	
	lets take sitcuation where we want to create a class that just declare the general
	form or structure or guildline of a particular idea. without giving a complete implementation
	of every method.
	
	and , we want that this generalization form or structure of the class can be used by all of its child classes
	, and the child class will impose these guidline by fullfilling all the implemetaion detalis according need.
	
	there is no need for implemeting the method in the parent class thus, we can declare these method as abstratc 
	in the parent class . that is , we will not provide any method body or implementation of these abstarct method.
	
	making these method as  abstract will enforce all the derived clases to implement these abstarct method 
	otherwise, there will be a compilation time error
	
	  
*/