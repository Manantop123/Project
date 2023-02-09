package hashmap;

import java.util.HashMap;
import java.util.Map;

public class findchar {
	
	public static void countchar(String str)
	{
		//creating hashmap containing char and integer
				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
				
				//converting given string into char array
				char[] charArray = str.toCharArray();
				
				//checking each char of chararray
				for(char c : charArray)
				{
					if(map.containsKey(c))
					{
						map.put(c, map.get(c)+1);
					}
					else
					{
						map.put(c, 1);
					}
				}
				
				//traverses has map check
				//if count greater than 1 then print
				//the character and its frequncy.
				
				for(Map.Entry<Character, Integer> entry : map.entrySet() )
				{
					if(entry.getValue()>1)
					{
						System.out.println(entry.getKey()+ ":"+entry.getValue());
					}
				}
				
				
	}
	public static void main(String[] args) {	
		String str ="mananananan soniinin";
		countchar(str);
	}
}
