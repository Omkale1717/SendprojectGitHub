package com.java.insert.update.delete.operation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDataDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker","root","root");
	CallableStatement cs=	con.prepareCall("{call insertData(?,?,?,?)}");
	cs.setString(1, "Ganesh Mali");
	cs.setString(2, "Bhihar");
	cs.setInt(3, 400);
	cs.setInt(4, 24);
	
	

	
	cs.setString(1, "Ravi kumar");
	cs.setString(2, "UterPradesh");
	cs.setInt(3, 588);
	cs.setInt(4, 20);
	
	
	cs.setString(1, "Sundher Raut");
	cs.setString(2, "Bhihar");
	cs.setInt(3, 500);
	cs.setInt(4, 27);
	
	
	cs.setString(1, "Manglu yadhav");
	cs.setString(2, "Uter,pradesh");
	cs.setInt(3, 400);
	cs.setInt(4, 28);
	
	
	cs.setString(1, "Manoj sharma");
	cs.setString(2, "delhi");
	cs.setInt(3, 400);
	cs.setInt(4, 29);
	

	
	
	
	cs.execute();
	System.out.println("Insert Data Succfully ");
	cs.close();
	con.close();
		
	
	}

}
