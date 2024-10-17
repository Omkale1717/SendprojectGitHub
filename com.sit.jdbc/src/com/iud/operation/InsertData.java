package com.iud.operation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhos:3306/framer","root","root");
		CallableStatement cs= con.prepareCall("{call insert data(?,?,?,?)}");
		cs.setString(1, "rajarambapu");
		cs.setString(2,"TUljapur");
		cs.setString(3, "mangrul");
		cs.setInt(4, 500000);
		cs.execute();
		System.out.println("Insert Data Succfully");
		cs.close();
		con.close();
	}

}
