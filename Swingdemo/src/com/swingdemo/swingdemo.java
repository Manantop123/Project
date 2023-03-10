package com.swingdemo;


/*
 * 	Swing : it is used to java foundation classes.
 * 			it is used to develop desktop app.
 * 
 */

/*
 	JDBC Step
 	
 	there are 6 step 
 	
 	i) import driver
 	
 	Class.Forname(com.mysql.jdbc.Driver);
 	
 	ii) establish connection
 	
 	DrvierManager.getConnection("url","username","");
 	
 	iii) write query
 	String sql ="insert into tablename() values()";
 	
 	iv)prepare statenet
 	PrepareStatment pst = conn.PrepareStatment();
 	
 	 v) execute query
 	 	
 	 	for insert/update/delete = > executeUpdate();
 	 	for select -> ResultSet rs = conn.executeQuery();
 	 
 	 vii)close connection
 		conn.close();
 		
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class swingdemo implements ActionListener{
	
	JFrame f;
	
	JLabel l1,l2,l3,l4,l5;
	
	JTextField t1,t2,t3,t4,t5;
	
	JButton b1,b2,b3,b4;
	
	swingdemo()
	{
		f = new JFrame("employee registration");
		f.setVisible(true);
		f.setSize(400,500);
		//f.setLayout(new FlowLayout());
		f.setLayout(null);
		f.setResizable(false);
		
		l5 = new JLabel("id");
		l1 = new JLabel("first  name : ");
		l2 = new JLabel("last name : ");
		l3 = new JLabel("email : ");
		l4 = new JLabel("mobile : ");
		
		t5 = new JTextField(20);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		
		b1 = new JButton("Insert");
		b2 = new JButton("search");
		b3 = new JButton("update");
		b4 = new JButton("delete");
		
		f.add(l5);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		f.add(t5);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
	
		
		l5.setBounds(50, 50, 100, 80);
		l1.setBounds(50,100,100,80);
		l2.setBounds(50, 150,100, 80);
		l3.setBounds(50, 200, 100, 80);
		l4.setBounds(50,250,100,80);
		
		t5.setBounds(150, 80, 150, 25);
		t1.setBounds(150, 130, 150, 25);
		t2.setBounds(150, 180,150,25 );
		t3.setBounds(150, 230, 150, 25);
		t4.setBounds(150, 280, 150, 25);
		
		b1.setBounds(50, 330, 100, 30);
		b2.setBounds(200, 330, 100, 30);
		b3.setBounds(50, 380, 100, 30);
		b4.setBounds(200, 380, 100, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			System.out.println("insert clicked");
			
			
			
			try {
				//import driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//establish connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance", "root", "");
				
				//write the qury
				String sql = "insert into TEST(name,lname,email,number) values(?,?,?,?)";
				
				//prepare statment
				java.sql.PreparedStatement pst = conn.prepareStatement(sql);
				
				
				pst.setString(1, t1.getText());
				pst.setString(2,t2.getText());
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				
				
				//execute qury
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(f, "data insert");
				
				//close connection
				pst.close();
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
			}
		}
		else if(ae.getSource()==b2)
		{
			try
			{
				//import driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//establish connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance", "root", "");
				
				//write qury
				String sql ="select * from Test where id=?";
				
				//prepared statment
				java.sql.PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t5.getText()));
				ResultSet rs = pst.executeQuery();
				
				if(rs.next())
				{
					t1.setText(rs.getString("name"));
					t2.setText(rs.getString("lname"));
					t3.setText(rs.getString("email"));
					t4.setText(rs.getString("number"));
				}
				
				JOptionPane.showMessageDialog(f, "data searched");
				
//				t5.setText("");
//				t1.setText("");
//				t2.setText("");
//				t3.setText("");
//				t4.setText("");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b3)
		{
			try
			{
				//import driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//establish connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance", "root" , "");
				
				//write query
				String sql = "update TEST set name=? ,lname=?,email=?,number=? where id=?";
				
				//prepared statment
				java.sql.PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setString(1, t1.getText());
				pst.setString(2,t2.getText());
				pst.setString(3, t3.getText());
				pst.setString(4, t4.getText());
				pst.setInt(5, Integer.parseInt(t5.getText()));
				//execute statment
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(f, "update successfully");
				
				//close connection
				pst.close();
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b4)
		{
			try
			{
				//import driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//esablish connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","");
				
				//write query
				String sql = "delete from TEST where id=?"; 
				
				//prepare statment
				java.sql.PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setInt(1, Integer.parseInt(t5.getText()));
				
				//execute update
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(f, "data delete success");
				
				//close connection
				pst.close();
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		swingdemo s1 = new swingdemo();
	}

	
}
