package assignment1;

public class programm12 {
	public static void main(String[] args) {
		int a=1, n=100;
		
		for(int i=a; i<=n; i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		
		for(int i=a; i<=n; i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		
		for(int i=a; i<=n ; i++)
		{
			if((i%3==0) && (i%5==0))
			{
				System.out.print(i+" ");
			}
		}
	}
}
