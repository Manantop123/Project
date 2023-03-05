package com.thread;

/*
 	thread : it is smallest unit of code.
 			it is run single thread at time.
 			
 			java provide inbuilt thread class.
 			
 	
 there is 3 main componenet in thread.
 	
 	output --> Thread[main , 5 , main]
 	
 	(i) thread name : name
 	(ii) priority
 			min_priority : value is 1
 			norm_priority : value is 5
 			max_priority : value is 10
 	(iii) group name 
 
 */

public class threaddemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		t.setName("manan");
		System.out.println(t);
		t.setPriority(6);
		System.out.println(t);
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+" "+t);
			Thread.sleep(1000);
			
		}
		System.out.println("exit");
	}
}
