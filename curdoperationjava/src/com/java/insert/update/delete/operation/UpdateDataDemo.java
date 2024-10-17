package com.java.insert.update.delete.operation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateDataDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker", "root", "root");
		
		     CallableStatement cs=    con.prepareCall("{call updateData(?,?,?,?,?)}");
		     cs.setString(1, "Ravi Shukala");
		     cs.setString(2, "Chatisgad");
		     cs.setInt(3, 500);
		     cs.setInt(4, 33);
		     cs.setInt(5, 1);
		     cs.executeUpdate();
		    
		     System.out.println("Data Update Succfully In Mysql ");
		     con.close();
		     cs.close();
		    
		     
	}

}
