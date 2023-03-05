package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileIO {
	public static void main(String[] args) {
		try
		{
			FileOutputStream fo = new FileOutputStream("fotext.txt");
			String s = "Hello Manan how r u ?";
			byte[] b = s.getBytes();
			fo.write(b);
			fo.flush();
			fo.close();
			
			FileInputStream fis = new FileInputStream("fotext.txt");
			int i;
			while((i=fis.read())!=-1)
				{
					System.out.print((char)i);
				}
			fis.close();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}	
