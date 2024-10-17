package com.alloperation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techemp", "root", "root");
		CallableStatement cs=con.prepareCall("{ call updateData(?,?,?,?,?)}");
		cs.setString(1, "Shantnun Naydu");
		cs.setString(2, "Banglore");
		cs.setInt(3, 23);
		cs.setInt(4, 7000);
		cs.setInt(5, 1);
		
		cs.setInt(1, 700000);
		cs.setInt(2, 1);
		cs.executeUpdate();
		System.out.println("The Data ==Update Succfully== in mysql DataBase");
		cs.close();
		con.close();
		
	}

}
