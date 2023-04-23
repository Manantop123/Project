package comparestring;

public class startswith {
	public static void main(String[] args) {
		String s1 = "red is faviourit colour";
		String s2 = "orange is faviourite colour";
		
		String start_str="red";
		
		boolean start1 = s1.startsWith(start_str);
		boolean start2 = s2.startsWith(start_str);
		
		System.out.println("\"" + s1 + "\" start with " + "\"" +start_str +"\"?"+start1);
		System.out.println("\""+s2+"\" start with" + "\"" +start_str + "\"?" +start2);
	}
}
