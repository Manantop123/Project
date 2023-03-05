package com.thread;

/*
 	There are 2 ways to creating thread
 		
 		i)First way is by omplementing interface.
 		--> when you are creating your own thread by using an interface , then it is compuslary to use runnable interface.
 		
 		--> so when you use runnable interface it is compulsory to use run method.
 		
 		ii)the second way is to by extending the class 
 */

class NewThread implements Runnable
{
	Thread t;
	
	public NewThread()
	{
		t = new Thread(this,"child thread");
		t.start();
	}
	
	public void run() {
		for(int i=1; i<=5; i++)
		{
			System.out.println(t + ":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("child thread existing");
		
	}
	
}
public class MultipleThreadDemo {
	public static void main(String[] args) {
		//Thread t = Thread.currentThread();
		new NewThread();
	}
}
