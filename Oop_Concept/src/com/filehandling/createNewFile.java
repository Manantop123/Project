package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;

public class createNewFile {
	public static void main(String[] args) {
		try
		{
			File f = new File("test.txt");
		if(f.createNewFile())
		{
			System.out.println("create new file");
		}
		else
		{
			System.out.println("alrady exist");
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
