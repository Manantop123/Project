package TryCatchBlock;

public class programme1 {
	public static void main(String[] args) {
		try
		{
		int data = 50/0;
		System.out.println(data);
		}
		catch (Exception e) {
			System.out.println("rest of code");
		}
	}
}
