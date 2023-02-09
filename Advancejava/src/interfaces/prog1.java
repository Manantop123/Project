package interfaces;


interface printable
{
	void print();
}
class A6 implements printable
{
	public void print() {
		System.out.println("bais interface programme");
	}
}
public class prog1 {
	public static void main(String[] args) {
		A6 a= new A6();
		a.print();
	}
}
