package com.filehandling;

import java.io.File;

public class fileinfo {
	public static void main(String[] args) {
		File f1 = new File("test1.txt");
		if(f1.exists())
		{
			System.out.println("file name"+f1.getName());
			System.out.println("Absoulte path"+f1.getAbsolutePath());
			System.out.println("writable"+f1.canWrite());
			System.out.println("readable"+f1.canRead());
			System.out.println("file size in byte"+f1.length());
		}
		else
		{
			System.out.println("file doesnot exist");
		}
	}
}




