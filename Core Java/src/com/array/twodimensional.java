package com.array;

public class twodimensional {
	public static void main(String[] args) {
		int[][] a = 
			
			{
					
					{1,-2,3},
					{4},
					{6,7,-8,9}
					
			};
		//calculate  length of each row
		System.out.println("length of  0 row"+a[0].length);
		System.out.println("length of  1 row"+a[1].length);
		System.out.println("length of  2 row"+a[2].length);
		
		
		//using for loop
		
		System.out.println("using for loop");
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
			System.out.println(a[i][j]);	
			}
		}
	}
}
