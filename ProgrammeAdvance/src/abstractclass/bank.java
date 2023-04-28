package abstractclass;

abstract class banking
{
	public abstract void getBalance();
	
}
class bankA extends banking
{
	public void getBalance()
	{
		System.out.println("deposited: $100");
	}
}
class bankB extends banking
{
	public void getBalance()
	{
		System.out.println("deposited: $150");
	}
}
class bankC extends banking
{
	public void getBalance()
	{
		System.out.println("deposited: $200");
	}
}
public class bank {
	public static void main(String[] args) {
		bankA ba = new bankA();
		ba.getBalance();
		
		bankB bb = new bankB();
		bb.getBalance();
		
		bankC bc = new bankC();
		bc.getBalance();
	}
}
