package interfaces;


interface drawabless
{
	void print();
	
	static int cube(int x)
	{
		return x*x*x;
	}
}

class rectangless implements drawabless
{
	public void print() {
		System.out.println("without static method");
	}
}
public class pro4 {
	public static void main(String[] args) {
		rectangless r1 = new rectangless();
		r1.print();
		System.out.println(drawabless.cube(3));
	}
}
