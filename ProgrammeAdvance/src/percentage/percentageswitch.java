package percentage;

public class percentageswitch {
	public static void main(String[] args) {
		String grade ="AA";
		
		switch (grade) {
		case "AA":
			System.out.println("student has scored 91 to 100");
			break;
		
		case "AB":
			System.out.println("student has scored between 81 to 90");
			break;
			
		case "BC":
			System.out.println("student has scored between 71 to 80");
			break;
			
		default:
			System.out.println("student is not valid");
			break;
		}
	}
}
