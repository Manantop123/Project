package hashmap;

import java.util.HashMap;

public class updatemap {
	public static void main(String[] args) {
		HashMap<Integer , String> map = new HashMap<Integer,String>();
		
		map.put(1,"manan");
		map.put(2,"soni");
		map.put(3,"gopal");
		
		System.out.println(map);
		
		//update element using put
		
		map.put(2,"soniya");
		
		System.out.println(map);
		
		//remove element using remove
		
		map.remove(2);
		System.out.println(map);
	}
}
