package com.abstrac;


abstract class banking
{
	abstract int getbalance();
}
class bankA extends banking
{
	@Override
	int getbalance() {
		return 100;
	}
}
class bankB extends banking
{
	@Override
	int getbalance() {
		return 150;
	}
}
class bankC extends banking
{
	@Override
	int getbalance() {
		return 200;
	}
}
public class balance {
	public static void main(String[] args) {
		banking b1 = new bankA();
		System.out.println("bank 1 balance"+" "+b1.getbalance());
		banking b2 = new bankB();
		System.out.println("bank 2 balance"+" "+b2.getbalance());
		banking b3 = new bankC();
		System.out.println("bank 3 balance "+" "+b3.getbalance());
	}
}
