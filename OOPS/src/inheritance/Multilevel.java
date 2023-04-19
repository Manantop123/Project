package inheritance;


class person2
{
	public void show()
	{
		System.out.println("student inheriting properites from person");
	}
}
class student2 extends person2
{
	public void show1()
	{
		System.out.println("student who belong to parent class");
	}
}
class engineerstudent extends student2
{
	public void show2()
	{
		System.out.println("i m student of enginner field");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		engineerstudent es = new engineerstudent();
		es.show();
		es.show1();
		es.show2();
	}
}
