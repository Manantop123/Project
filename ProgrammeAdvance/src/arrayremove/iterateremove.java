package arrayremove;

import java.util.ArrayList;
import java.util.Iterator;

public class iterateremove {
	public static void main(String[] args) {
		
		//creating arraylist having default size 10
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(10);
		
		//Adding element to the arraylist
		
		numbers.add(12);
		numbers.add(1);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		System.out.println("the list of size is"+numbers);
		
		//showing all element in array list
		
		for(Integer i:numbers)
		{
			System.out.println("number is"+numbers);
		}
		
		//removing element greater than 10
		
		Iterator itr = numbers.iterator();
		
		while(itr.hasNext())
		{
			int data = (Integer)itr.next();
			if(data>10)
			{
				itr.remove();
			}
			System.out.println("\n after removing element the size of ana array is"+numbers.size());
			
			//showing all element in arraylist
			for(Integer number : numbers)
			{
				System.out.println("numbers is"+number);
			}
		}
	}
}
