package year;

public class leapyear {
	public static void main(String[] args) {
		int i,n =2012;
		for(i=1956; i<=n; i++)
		{
			if((i%4==0) || (i%400==0) || (i%100==0))
			{
				System.out.println("leap year"+i);
			}
			else
			{
				System.out.println("not leap year"+i);
			}
		}
	}
}
