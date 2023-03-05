package Arrayconcept;

/*
 	--> array is an object that hold fixed size of value of similar data type.
 	
 	--> array is a data structure where we store similar data type.
 	
 	--> why we use array...
 	
 		bcz we have 100 student details which is similar data type. we will need to declare 100 variable 
 		
 		 	example 
 		 		int stud1;
 		 		int stud2;
 		 		int stude3;
 		 		int stude4;
 		 		
 		 		after creating 100 of variable our project size will be increase. the concept is come where 
 		 		we use array to store multiple value of same type.
 		 		
 		 		syntax of array
 		 		
 		 			datatype array_name = new data_type[size_of_array]
 		 			
 		 			note :- every array have their own index position that starts with 0
 		 			
 		 			
 		 			int name[] = new int[100];
 		 			
 		 			--> in java array is an object. so array have super class which is class object.
 		 			
 		 			--> the length  of an array is assigned when array is created and after creation ,it's
 		 			length is fixed.
 		 			
 		 			
 		 			some feature of arrray:-
 		 			
 		 			---> In java array variable can be declare same like normal varaible declaration with [] brackets.
 		 			
 		 			---> the variable in array are order . and each have an own index.
 		 			
 		 			---> the length of an array can be find using length methos.
 		 			
 		 			---> array are object . so array value are store inside heap memory.
 		 			
 		 			
 		 			som advantage of array
 		 			
 		 			---> array can be store multiple type of datatype.
 		 			
 		 			---> we can access array element by calling it's index position.
 		 			
 		 			---> array can be used  to implment data structur like stack,queues,tree,graph,etc...
 		 			
 		 			some disadvantage of array
 		 			
 		 			---> fixed size..
 		 			
 		 			---> memory  wastage..
 		 			
 		 			---> strongly type..
 		 			
 		 			---> no method..
 		 			
 		 		There are three type of an array
 		 			i] single
 		 			 	1) 1-D
 		 			ii] multi-dimenstional
 		 				1) 2-D
 		 				2) 3-D
 		 			.
 		 			
 		<----> There are four pillars of array to declare , create , initalize , retrive single dimensional array
 				
 				single dimenstional array have multiple column in table.
 			
 			i] declaration
 				data_type vaiable_name
 				example : int a
 				
 			ii] creation
 					[]
 					
 					there are 4 way to create array
 					
 					1) int[] a;
 					2) int a[];
 					3) int[]a;
 					4) int []a;
 					
 			iii] initialization
 					new data_type[size_of_array]
					new int[100]
					
					syntax of declaration , creation , initialization at 1 line.
					
					1) int[] a = new int[100];
					2) int[] a= {10,20,30};
			
			iv] retrive
			
					int[] a = new int[10];
					for(int i=0; i<a.length;i++)
					{
						syso(a[i]);
					}


		<---> two dimensional array having multiple rows and cols is  known as 2-D array.
		
				there are 4 way to create and declare @-D array
			
			i] create and declare array
				
				1) int[][] a;
				2) int a[][];
				3)int[][]a;
				4)int [][]a;
			
			ii]initialize array
				1) 
					int[][] a = new int[2][3];
					int[][] a = {{10,20,30},{10,20,30}}
					
					
			iii] retrive array
				
				for(int i=0;i<a.length; i++)
				{
					for(int j=0; j<a[i]; j++)
					{
						syso(a[i][j]+" ");
					}
					sysoln();
				}
	
 
 	********array are in form of matrix and jagged array********
 		
 		1)Matrix array
 		
 			int[][] a = new int[2][3];
 			
 			int a[][] = {{10,20,30},{40,50,60}};
 		
 		2)jagged array
 		
 			int[][] a = new int[][];
 			a[0] = new int[2];
 			a[1] = new int[3];
 			
 			int a[][] = {{10,20,30},{40,50,60}};
 
 	
 
 */

public class basic {
	public static void main(String[] args) {
		double[][] a;
		a = new double[2][];
		a[0] = new double[3];
		a[1] = new double[3];
		
		a[0][0]= 10;
		a[0][1]= 20;
		a[0][2]= 30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
