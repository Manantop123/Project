package inheritance;


class person3
{
	public void show()
	{
		System.out.println("i am person");
	}
}
class student1 extends person3
{
	public void show1()
	{
		System.out.println("i am student1");
	}
}
class student3 extends student1
{
	public void show2()
	{
		System.out.println("i am doctor");
	}
}
class student4 extends student3
{
	public void show3()
	{
		System.out.println("i am enginner");
	}
}
public class hiererchicallevel {
	public static void main(String[] args) {
		student4 s4 = new student4();
		s4.show();
		s4.show1();
		s4.show2();
		s4.show3();
	}
}
