package edu.lessons.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_values {

	public static void main(String[] args) {
	   String url="jdbc:oracle:thin:@localhost:1521:xe";
	   String username ="system";
	   String password="Arunps2244#";
	   try {
		   Connection con =DriverManager.getConnection(url,username,password);
		   String sql ="insert into employee values(1234,'peter','jhon','abc',1212,2233)";
		   Statement stmt =con.createStatement();
		   int rows =stmt.executeUpdate(sql);
		   if(rows >0) {
			   System.out.println("A rows has been inserted ");
		   }
		   con.close();
	   }catch(SQLException e) {
		   System.out.println("opps,error");
		   e.printStackTrace();
	   }
	}

}
