package com.alloperation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techemp", "root", "root");
		CallableStatement cs = con.prepareCall("{call insertData(?,?,?,?)}");
		cs.setString(1, "rajkadam");
		cs.setString(2, "pune");
		cs.setInt(3, 21);
		cs.setInt(4, 4000);   
		
		cs.setString(1, "Rahul Jadhav");
		cs.setString(2, "Mumbai");
		cs.setInt(3, 23);
		cs.setInt(4, 5000);
		
		cs.setString(1, "Ranveer Ingle");
		cs.setString(2, "Baramati");
		cs.setInt(3, 24);
		cs.setInt(4, 7000);
		
		cs.setString(1, "sham patil");
		cs.setString(2, "Sangli");
		cs.setInt(3, 22);
		cs.setInt(4, 6000);
		
		cs.setString(1, "Niranjan");
		cs.setString(2, "Dhrashive");
		cs.setInt(3, 21);
		cs.setInt(4, 60000);
		
		cs.executeUpdate();
		
		System.out.println("Data Succfully Insert Into Mysql DataBase");
		cs.close();
		con.close();

	}

}
