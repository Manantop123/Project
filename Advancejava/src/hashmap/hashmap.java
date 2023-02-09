package hashmap;

import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {
		//creating hashmap by declaing object
		//of string and integer type.
		
		HashMap<String, Integer> map = new HashMap<>();
		
		
		//adding element to map object using put()
		map.put("manan", 10);
		map.put("soni", 20);
		
		//print size and content of map
		
		System.out.println("size of map is"+map.size());

		//printing element in object of map
		
		System.out.println(map);
		
		//checking if key present and if present
		//print value by passing random element
		
		if(map.containsKey("gopal"))
		{
			//mapping
			Integer a = map.get("gopal");
			System.out.println("value for key is"+"manan"+a);
		}
	}
}
