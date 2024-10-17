package com.java.insert.update.delete.operation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteDataDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker", "root", "root");
		CallableStatement cs=con.prepareCall("{call deleteData (?)}");
		cs.setInt(1, 1);
		cs.executeUpdate();
		System.out.println("Delete Data Succfully");
		cs.close();
		con.close();
		
	}

}
