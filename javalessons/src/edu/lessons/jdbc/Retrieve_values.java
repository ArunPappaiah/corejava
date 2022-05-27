package edu.lessons.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrieve_values {
	public static void main(String args[]) {
	/*	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
			Statement st=con.createStatement();
		//	ResultSet rs=st.executeQuery("truncate table trans");
			//ResultSet rs =st.executeQuery("UPDATE customer_new SET age =40 WHERE cust_name='kalai'");
			ResultSet rs =st.executeQuery("select * from employees");
			while(rs.next()) 
			//	System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"  "+rs.getString(5)+"   "+rs.getString(6)+"   "+rs.getString(7)+"   "+rs.getInt(8)+"   "+rs.getInt(9)+"   "+rs.getInt(10)+" "+rs.getInt(11));
			con.close();
		}catch (Exception e) {
		//	e.printStackTrace();
			System.out.println(e);
		}   */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
			Statement st=con.createStatement();
		//	ResultSet rs=st.executeQuery("truncate table trans");
			//ResultSet rs =st.executeQuery("UPDATE customer_new SET age =40 WHERE cust_name='kalai'");
			ResultSet rs =st.executeQuery("select a.doctor_id,a.name,a.dob,a.speciality,a.city,a.phone_number,a.std_fees,b.appoint_id,b.appoint_date,b.doctor_id,b.patient_name,fees_collected from doctor a full outer join appointment b on a.doctor_id= b.doctor_id");
			while(rs.next()) 
			//	System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4)+"  "+rs.getString(5)+"   "+rs.getString(6)+"   "+rs.getFloat(7)+"   "+rs.getInt(8)+"   "+rs.getString(9)+"   "+rs.getInt(10)+" "+rs.getString(11)+" "+rs.getString(12));
			con.close();
		}catch (Exception e) {
		//	e.printStackTrace();
			System.out.println(e);
		}
    }
}
