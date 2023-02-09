//looping construct to copy array 

package com.array;

import java.util.Arrays;

public class loopconstruct {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		int[] copy = new int[5];
		
		for(int i=0; i<number.length; i++)
		{
			copy[i]=number[i];
		}
		
		//here we convert array to string 
		System.out.println(Arrays.toString(copy));
	}
}
