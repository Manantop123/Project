package hashmap;

import java.util.HashMap;

public class hashmapadd {
	public static void main(String[] args) {
		
		//creating hashmap by declaring object
		//of string and integer type
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		//adding element to map object by using put 
		
		map.put(1,"one");
		map.put(2,"two");
		map.put(3, "three");
		
		map2.put(4, "four");
		map2.put(5, "five");
		map2.put(6, "six");
		
		
		System.out.println("mapping of hashmap1"+map);
		System.out.println();
		System.out.println("mapping of hashmap2"+map2);
		
	}
}
