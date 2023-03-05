package Arrayconcept;

public class basic3 {
	public static void main(String[] args) {
		int row =2;
		int cols = 3;
		int value=1;
		
		int[][] a = new int[row][cols];
		
		for(int i=0;i<row; i++)
		{
			for(int j=0; j<cols;j++)
			{
				a[i][j]=value;
				value++;
			}
			System.out.print("");
		}
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<cols;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(a[0][1]);
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
	}
}
