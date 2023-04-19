package inheritance;


class person
{
	String name="Manan";
	public void show()
	{
		System.out.println("student inheriting properites from person");
	}
}
public class Singlelevel extends person
{
	String cource = "technical java cource";
	public void show1()
	{
		System.out.println("I am student belong to personal class");
	}
	
	public static void main(String[] args) {
		Singlelevel s1 = new Singlelevel();
		s1.show();
		s1.show1();
		System.out.println("name is"+s1.name);
		System.out.println("couce name is"+s1.cource);
	}
}

