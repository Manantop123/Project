package polymorphism;


/*
 * 	Dynamic type polymorphism
 * 
 * 	runtime or dynamically polymorphism is the polymorphism which resolve dynamically at the runtime
 	rather than compile-time is called. we can also call it as dynamic binding or dynamic method.
  
 * 	Since the method invocation is during runtime and not during compile-time , this type of
 	polymorphism is called runtime or dynamic polymorphism.
 	
 	we can also achive dynamic polymorphism in java with help of method overriding.
 	
 	case of method overriding occurd when derived class provides a specific definition of the method that is
 	already present in its parent class. we say that the function in the base class is being overriden.
 	
 	when we define a method of base class with the same name and same parameter and with the same return type 
 	in the child or derived class, then the method in the subclass overrides the method in superclass.
 	This process is method overriding in java.
 	
 	note we can not achive runtime polymorphism with data member . it can only be achived through methods.
 
 */

class shape
{
	void draw()
	{
		System.out.println("drawing shapes...");
	}
}
class square extends shape
{
	//override method of base class with diffrent implementation
	
	void draw()
	{
		System.out.println("drawing square");
	}
}
class circle extends shape
{
	//override method of base class with diffrent implementation
	
	void draw()
	{
		System.out.println("drawing circle");
	}
}
public class polymophism2 {
	public static void main(String[] args) {
		shape s1 = new shape();
		s1.draw();
		
		shape s2 = new square();
		s2.draw();
		
		shape s3 = new circle();
		s3.draw();
	}
}
