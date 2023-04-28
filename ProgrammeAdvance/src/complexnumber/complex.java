package complexnumber;

public class complex {
	
	//for real and img part of complex number
	
	double real , img;
	
	//constructor to initialize the complex number
	
	complex(double r , double i)
	{
		this.real = r;
		this.img = i;
	}
	
	public static complex sum(complex c1 ,complex c2)
	{
		//creating temprory complex number to hold the sum of two numbers.
		
		complex temp = new complex(0,0);
		
		temp.real = c1.real +c2.real;
		
		temp.img = c1.img + c2.img;
		
		//return complex number
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		complex c1 = new complex(5.5, 4);
		
		complex c2 = new complex(1.2, 3.5);
		
		complex temp = sum(c1, c2);
		
		System.out.println("sum is"+temp.real + " +"+temp.img+"i");
	}
}

