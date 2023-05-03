package Arraydimentional;

public class Twod {
	public static void main(String[] args) {
		
		//creation;
		int[][] a;
		//declaration
		a = new int[2][3];
		
		//creation & decaratin at one line
		
		int[][] b= {{10,20,30},{40,50,60}};
		
		//intitialization
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		//retrive
		
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0].length);
	//	System.out.println(a[0][0].length);
		
		
		//retrive using for loop
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
