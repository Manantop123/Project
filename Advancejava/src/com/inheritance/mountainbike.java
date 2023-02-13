package com.inheritance;

public class mountainbike extends bicycle {
	
	//extra properties
	public int setheight;
	
	public mountainbike(int gear, int speed,int setheight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.setheight = setheight;
	}
	
	public void setheight(int newvalue)
	{
		this.setheight = setheight;
	}

}
