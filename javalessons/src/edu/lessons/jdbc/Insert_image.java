package edu.lessons.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_image {
  public static void main(String args[]) {
	  try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
	  System.out.println("Connection is "+con);
	  PreparedStatement ps =con.prepareStatement("insert into insert_image values(?,?)");
	  ps.setString(1, "Tech");
	  FileInputStream fin= new FileInputStream("D:\\temp\\download.png");
	  ps.setBinaryStream(2, fin,fin.available());
	  int i=ps.executeUpdate();
	  System.out.println(i+"Rows affected");
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
