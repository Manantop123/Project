package comparestring;

public class specified {
	public static void main(String[] args) {
		String s1 = "topsint.com";
		String s2 = "TOPSINT.COM";
		
		CharSequence cs = "topsint.com";
		
		System.out.println("comparing"+s1+"and"+cs+":"+s1.contentEquals(cs));
		System.out.println("comparing"+s2+"and"+cs+":"+s2.contentEquals(cs));
	}
}
