package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filehandling {
	public static void main(String[] args) {
		try
		{
		FileOutputStream fos = new FileOutputStream("t1.txt");
		String s = "hello world";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("t1.txt");
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
