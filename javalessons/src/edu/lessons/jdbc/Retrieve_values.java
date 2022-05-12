package edu.lessons.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrieve_values {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("truncate table trans");
			while(rs.next()) 
				System.out.println(rs.getInt(1)+" ");
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
    }
}
