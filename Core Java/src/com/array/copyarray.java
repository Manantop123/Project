package com.array;

import java.util.Arrays;

public class copyarray {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int[] addnumbers = number;
		
		for(int i=1; i<=addnumbers.length; i++)
		{
			System.out.println(i);
		}
		
		//now we only change only first index array.
		
		System.out.println("now we only change only first index array");
		
		number[0] = -1;
		for(int i=1; i<=addnumbers.length; i++)
		{
			System.out.println(i);
		}
		
		//using arraycopy() method
		System.out.println("using arraycopy() method");
		
		int[] n1 = {2,3,4,5,7};
		int[] n3 = new int[5];
		
		//now creating n2 array having length of n1 array
		
		int[] n2 = new int[n1.length];
		
		//copy entire n1 to array n2
		
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.out.println("n2 = "+Arrays.toString(n2));
		
		System.arraycopy(n1, 2, n3, 2, 3);
		System.out.println("n3 = "+Arrays.toString(n3));
	}
}
