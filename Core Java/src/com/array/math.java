//compute sum and average of an array element.

package com.array;

public class math {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int sum =0 ;
		Double avg;
		
		System.out.println("sum of array element");
		
		for(int i=0; i<=number.length; i++)
		{
			sum = sum+i;
		}
		System.out.println("elemnt sum is"+sum);
		
		System.out.println("  ");
		
		System.out.println("avergae of array element");
		
		int arraylength = number.length;
		
		avg = ((double)sum/(double)arraylength);
		
		System.out.println("element of avg is"+avg);
	}
}
