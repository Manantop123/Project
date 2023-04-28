package Factorials;

public class factwhile {
	public static void main(String[] args) {
		int i=1;
		int flag=1;
		int no=5;
		
		while(i<=no)
		{
			flag=flag*i;
			System.out.println(i + " " + flag);
			i++;
		}
	}
}
