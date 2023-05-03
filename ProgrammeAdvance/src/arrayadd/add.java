//add array elemenet using converting array to list

package arrayadd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class add {
	
	public static Integer[] addX(Integer myArray[] , int x)
	{
		
		//turn array into arraylist using asList() method
		
		List<Integer> arrList =new ArrayList(Arrays.asList(myArray));
		
		
		//adding a new element to the array
		
		arrList.add(x);
		
		//transforming the arraylist int an array 
		
		myArray = arrList.toArray(myArray);
		return myArray;
	}
	
	public static void main(String[] args) {

		//initial array
		Integer myArray[]  = {0,1,2,3,4,5,6};
		
		System.out.println("initial array"+Arrays.toString(myArray));
		
		//element to be added
		int x = 28;
		
		//call to method to add x in myarray
		myArray = addX(myArray,x);
		
		System.out.println("array with"+ x + "added : "+Arrays.toString(myArray));
		
	}
}
