package com.thread;


class mythread extends Thread
{
	
	public mythread()
	{
		super();
		start();
	}
	
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(this + ":" + i);
			try
			{
				Thread.currentThread();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultipleThreadDe {
	public static void main(String[] args) {
		new mythread();
	}
}
