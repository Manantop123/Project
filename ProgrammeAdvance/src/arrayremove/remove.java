//using arraylist.remove method
package arrayremove;

import java.util.ArrayList;

public class remove {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(5);
		//adding elemtn to array list
		arr.add("pink");
		arr.add("green");
		arr.add("yellow");
		arr.add("black");
		arr.add("white");
		
		System.out.println("the list of size is:"+arr.size());
		
		//showing all elemnt
		
		for(String i:arr)
		{
			System.out.println("colour is" + " " +i);
		}
		
		//removing elemnt
		
		arr.remove(3);
		
		System.out.println("after removing element the size of arraylist is" + arr.size());
		
		//showing removing elemtnt
		
		for(String i:arr)
		{
			System.out.println(i);
		}
	}
}
