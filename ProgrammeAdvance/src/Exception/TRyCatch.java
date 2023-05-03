package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TRyCatch {
	public static void main(String[] args) {
		//checked exception
		
		try {
			//checked
			//FileInputStream fis = new FileInputStream("E:\\Java\\t2.txt");
			int a=10,b=2,c;
			c=a/b;
			System.out.println(c);
			//unchecked
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
