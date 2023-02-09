package hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmapforloop {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Manna");
		map.put(2, "soni");
		map.put(3, "gopal");
		
		System.out.println(map);
		
		//for loop
		
		for(Map.Entry<Integer, String> e : map.entrySet())
		{
			System.out.println("key"+e.getKey() +"value"+e.getValue());
		}
	}
}
