package com.abstrac;


abstract class bank
{
	abstract int getinterset();
}
class pnb extends bank
{
	@Override
	int getinterset() {
		return 7;
	}
}
class rbi extends bank
{
	@Override
	int getinterset() {
		return 8;
	}
}
public class simplepro3 {
	public static void main(String[] args) {
		bank b;
		
		b = new rbi();
		System.out.println("rate of interst is"+b.getinterset()+"%");
		b = new pnb();
		System.out.println("rate of interest is"+b.getinterset()+"%");
	}
}
