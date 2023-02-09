package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapcopy {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("manan", 10);
		map.put("soni", 20);
		
		//inistialize of hashmap
		
		HashMap<String, Integer> map2 = new HashMap<>(map);
		
		System.out.println("mapping of hashmap"+map);
		System.out.println("mapping of hashmap2"+map2);
		
	}
}
