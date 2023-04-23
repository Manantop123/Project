package comparestring;

public class endwith {
	public static void main(String[] args) {
		String s1 ="Java Exercises";
		String s2 = "Java Exercise";
		
		//the string is to check with another string to see if they ends with this value(se).
		String end_str ="se";
		
		//check first two string and with end_str
		boolean ends1 = s1.endsWith(end_str);
		boolean ends2 = s2.endsWith(end_str);
		
		//display result of endswith calls.
		
		System.out.println("\"" +s1 + "\" ends with " + "\"" +end_str +"\"?"+ends1);
		System.out.println("\"" +s2 + "\" ends with " + "\"" +end_str +"\"?"+ends2);
		
		
	}
}
