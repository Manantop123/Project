package com.inheritance;

public class bicycle {
	protected int gear;
	protected int speed;
	
	public bicycle(int gear, int speed)
	{
		this.gear= gear;
		this.speed = speed;
	}
	
	public void setgear(int newvalue)
	{
		this.gear = newvalue;
	}
	
	public void applybreak(int dcrement)
	{
		speed -= dcrement;
	}
	public void speedup(int increment)
	{
		speed+= increment;
	}
}
