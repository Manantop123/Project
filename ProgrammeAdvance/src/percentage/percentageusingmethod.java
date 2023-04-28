package percentage;


class marks
{
	String grade="BB";
	public void getgrade()
	{
		if(grade=="AA")
		{
			System.out.println("student has scored between 90 to 100");
		}
		
		else if(grade =="AB")
		{
			System.out.println("student has scored between 80 to 90");
		}
		else if(grade =="BB")
		{
			System.out.println("student has scored between 71 to 80");
		}
		else if(grade =="BC")
		{
			System.out.println("student has scorde between 61 to 70");
		}

	}
}
public class percentageusingmethod {
	public static void main(String[] args) {
		marks m1 = new marks();
		m1.getgrade();
	}
}
