package interfaces;


interface A1
{
	void print();
}
interface A2
{
	void show();
}
class A7 implements A1,A2
{
	public void print() {
		System.out.println("print from a1");
	}
	public void show() {
		System.out.println("show from a2");
	}
}
public class twointerfaces {
	public static void main(String[] args) {
		A7 a = new A7();
		a.print();
		a.show();
	}
}
