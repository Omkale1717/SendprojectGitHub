package com.sit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql");
		String sql="update  student set rollno = 101,name='samrath',addr='tuljapur',emailid='samrth@17gamil.com')";
		Statement smt=con.createStatement();
		int update =smt.executeUpdate(sql);
		System.out.println(update);
	}

}
