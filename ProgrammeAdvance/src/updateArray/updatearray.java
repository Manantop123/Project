package updateArray;

import java.util.ArrayList;
import java.util.List;

public class updatearray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("green");
		list.add("orange");
		list.add("yellow");
		list.add("blue");
		
		//print list
		
		System.out.println(list);
		
		//update third element with white
		
		list.set(2, "white");
		//print list again
		
		System.out.println(list);
	}
}
