package com.filehandling;

import java.io.FileReader;
import java.io.FileWriter;

public class filewr {
	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("fwr.txt");
			String s ="Manan where r u ?";
			fw.write(s);
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader("fwr.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
