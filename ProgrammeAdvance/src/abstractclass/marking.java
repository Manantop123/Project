package abstractclass;


abstract class marks
{
	public abstract int getPercentage();
}

class A extends marks
{
	int maths,sci,eng;
	
	public A(int m , int s, int e) {
		this.eng = e;
		this.sci = s;
		this.maths = m;
	}
	
	public int getPercentage()
	{
		return ((eng + sci + maths)/300)*100;
	}
	
}

class B extends marks
{
	int maths,sci,eng,social;
	
	public B(int m , int s , int e , int ss)
	{
		this.maths = m;
		this.sci = s;
		this.eng = e;
		this.social = ss;
	}
	
	public int getPercentage()
	{
		return ((maths+sci+eng+social)/400)*100;
	}
}

public class marking {
	public static void main(String[] args) {
		A a1 = new A(100,100,100);
		
		B b1 = new B(100,100,100,100);
		
		System.out.println("percentage of marks for student A:" + a1.getPercentage() + "%");
		
		System.out.println("percentage of marks for student B:" + b1.getPercentage() + "%");
	}
}
