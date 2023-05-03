package arrayremove;

import java.util.ArrayList;

public class removeif {
	public static void main(String[] args) {
		//creating an arraylist having default size is 20
		
		ArrayList<String> cities = new ArrayList<String>(10);
		
		//adding element to arraylist
		
		cities.add("Berlin");
		cities.add("bilbo");
		cities.add("cape town");
		cities.add("Nazil");
		cities.add("Urbia");
		
		System.out.println("the list of the size is"+cities.size());
		
		//showing all the element in the arraylist
		
		for(String city : cities)
		{
			System.out.println("city is"+city);
		}
		
		//removing ana element which are start with b remove using removeif() method
		
		cities.removeIf(n->(n.charAt(0)=='B'));
		
		System.out.println("after removnig element the size of arraylist is"+cities.size());
		
		//showing all the elemnt in arraylist
		
		for(String city : cities)
		{
			System.out.println("city is"+city);
		}
	}
}
