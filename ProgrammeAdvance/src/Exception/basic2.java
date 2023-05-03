package Exception;

import java.io.FileInputStream;

public class basic2 {
	public static void main(String[] args) {
		try
		{
			FileInputStream fis = new FileInputStream("E:\\Java\\t1.txt"); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
