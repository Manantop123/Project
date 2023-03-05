package com.filehandling;


/*
 	it is an innterfacr. serialization is marker interface. it is used for file data security. 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class employee implements Serializable
{
	int eid;
	String ename,eaddress;
	
	employee(int id, String name , String address)
	{
		this.eid = id;
		this.ename = name;
		this.eaddress = address;
	}
	
	public String tosString()
	{
		return "ename"+this.ename+" "+"eid"+this.eid+" "+"addres"+this.eaddress;
		
	}
}

public class serialization{

	public static void main(String[] args)  throws Exception
	{
		employee e = new employee(1, "manan", "ahmedabad");
		employee e2 = new employee(2, "rush", "surat");
		employee e3 = new employee(3, "rinish", "banglore");
		
		FileOutputStream fos= new FileOutputStream("ser1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("ser1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee e4 = (employee)ois.readObject();
		employee e5 = (employee)ois.readObject();
		employee e6 = (employee)ois.readObject();
		
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
	}
}
