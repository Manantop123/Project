package assignment1;

public class programme9 {
	public static void main(String[] args) {
		
		String str = "Manan Soni 315@gmil.com";
		
		int count = str.length();
		
		System.out.println(count);
		
		count(str);
	}
	
	public static void count(String x)
	{
		char[] ch = x.toCharArray();
		
		int letter = 0;
		int num = 0;
		int space = 0;
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
		System.out.println(letter);
		System.out.println(num);
		System.out.println(space);
		System.out.println(other);
	}
}
