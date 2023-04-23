package interleavingstring;

public class interleaving {
	public static void main(String[] args) {
		String str1 ="WX";
		String str2 = "YZ";
		String str3 = "YWZX";
		
		System.out.println("the interleaving string is"+ str1 + "and" + str2);
		System.out.println("the given string is interleaving :"+checkInterleaved(str1, str2, str3));
		
	}
	
	public static boolean checkInterleaved(String str1 , String str2 , String CheckString)
	{
		int i=0 , j=0  , k=0;
		
		if(str1.length() + str2.length() != CheckString.length())
		{
			return false;
		}
		
		while(k<CheckString.length())
		{
			if(i<str1.length() && str1.charAt(i)==CheckString.charAt(k))
			{
				i++;
			}
			else if(j<str2.length() && str2.charAt(j)== CheckString.charAt(k))
			{
				j++;
			}
			else
			{
				return false;
			}
			k++;
		}
		if(!(i==str1.length() && j==str2.length() && k== CheckString.length()))
		{
			return false;
		}
		return true;
	}
}
