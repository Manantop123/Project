//add array element using converting arr to arraylist

package arrayadd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class add2 {
	public static Integer[] addX(Integer myarray[] ,int x)
	{
		//converting arr to arrylist
		
		List<Integer> list = new ArrayList(Arrays.asList(myarray));
		
		//add array elemt
		
		list.add(x);
		
		//converting arraylist to array
		
		myarray = list.toArray(myarray);
		
		return myarray;
	}
	public static void main(String[] args) {
		//initial array
		
		Integer myarray[] = {1,2,3,4,5};
		
		System.out.println("initial array is"+Arrays.toString(myarray));
		
		//element to be addes;
		
		int x = 28;
		
		//call to method to add x in myarray
		
		myarray= addX(myarray, x);
		
		System.out.println("array with"+x+"added" + Arrays.toString(myarray));
	}
}
