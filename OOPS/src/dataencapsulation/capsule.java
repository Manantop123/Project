package dataencapsulation;


/*
 *	 capusul means a pack of lot of think inside qube it's called capsule.
 *	
 *	 data encapsulation in genral, is the action of enclosing or binding something. In oop, it is way of combining
 *   both data and function that operate on that data , into a single unit.
 *   
 *   
 *   real world example of data encapsulation : 
 *   
 *   in organization , there are so many departments like sales , account , payroll , purchase ,  production, etc.
 *   each department has its own personal or staff taht maintain its data.
 *   
 *   suppose an employee of the production department wants to know the quantity of raw matirial that has been 
 *   purchsed for the next month. the enployee would not be allowed to go through the data files of the purchase dept.
 *   
 *	 rather he will have to issue a memo to the purchse departmet requesting for the require information.
 *   then some employee of the purchase dept will  go through the data  files of purchase and send the reply 
 * 	 with the asked information.
 * 		
 * 		This practice ensures that the user access the data accuraely and the unexpert outsider do not corrupt this data.
 * 	therefore we can say that the data and employee of the department encapsulate together into single entity, the
 *  department.
 * 
 * 	
 * 	Encapsulation in java
 * 	
 * 	achiving encapsulation in java , we have to 
 * 
 *  	--> declare the variable of  a class as private , so that they cannot be accessed directly from outside the  class
 *  
 *  	--> provide seeter and getter methods that are declared as public , to view and change the value of the variable
 *  
 *  
 *  // setter method set the value of variable , 
 *  	
 *  // getter method are used to get or return the values.
 * 
 */
public class capsule {
	
	//declaring variable as private
	
	private String name;
	private String profile;
	private int age;

	public String getName()
	{
		return name;
	}
	public void setName(String NAME)
	{
		this.name=NAME;
	}
	
	public String getProfile()
	{
		return profile;
	}
	public void setProfile(String PROFILE)
	{
		this.profile=PROFILE;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int AGE)
	{
		this.age=AGE;
	}
	public static void main(String[] args) {
		capsule c1 = new capsule();
		
		//setting value of the variable though setter method
		
		c1.setName("Manan Soni");
		c1.setProfile("support engineer");
		c1.setAge(22);
		
		//displaying values of the variable throgh getter method
		System.out.println("name of employee"+c1.getName());
		System.out.println("age of employee"+c1.getAge());
		System.out.println("profile of employee"+c1.profile);
	}
}
