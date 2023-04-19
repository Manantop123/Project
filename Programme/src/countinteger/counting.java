package countinteger;

public class counting {
	public static void main(String[] args) {
		String test = "Manansoni 315 @ gmail.com";
		int count = (test +"").length();
		System.out.println(count);
		
		count(test);
	}
	
	public static void count(String x)
	{
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i=0; i<x.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			} 
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("letter is"+letter);
		System.out.println("space is"+space);
		System.out.println("num is"+num);
		System.out.println(" is"+other);
	}
}
