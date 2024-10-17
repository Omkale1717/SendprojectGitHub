package com.sit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/accenture","root","root");
		   String sql="insert into student (rollno,name,addr,emailid) values ( 101,'omkar','pune','omkale@1730gamil.com')";
		   Statement smt=con.createStatement();
		   smt.execute(sql);
		   con.close();
		   smt.close();
		   System.out.println("Save Data");
	
	}
	

}
