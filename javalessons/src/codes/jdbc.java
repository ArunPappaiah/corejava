package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 public class jdbc {

/*	public static void main(String[] args) throws SQLException {
	  
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		Connection conn =DriverManager.getConnection("jdbc:Oracle:thin:@//localhost:1521/XE","system","Arunps2244#");
		PreparedStatement ps= conn.prepareStatement("select * from customer");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	//	ResultSetMetaData rsm=rs.getMetaData();
		//System.out.println(rsm.getColumnCount());
		//System.out.println(rsm.getColumnName(1));
	
	}   */
	
	/*	public static void main(String args[]) throws Exception {
			try {
				Class.forName("Oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con =DriverManager.getConnection("jdbc:Oracle:thin:@//localhost:1521/XE","system","Arun");
		    Statement stmt=con.createStatement();
		    String query ="select * from title";
		    ResultSet rs=stmt.executeQuery(query);
		     while(rs.next()) {
		    	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
		     }
		     stmt.close();
		     rs.close();
		     con.close();
		}  */
	 
  /*   public static void main(String args[]) {
		 try {
			 DriverManager.registerDriver(new OracleDriver());
		      System.out.println("Driver loaded successfully");
		      DriverManager.getConnection("jdbc:Oracle:thin:@//localhost:1521/XE","system","Arun");
		      System.out.println("Connection successful");
		 }catch(SQLException e) {
			 System.out.println("some error");
			 e.printStackTrace();
		 }
		 
	 }  */ 
	 
	/* public static void main(String args[]) {
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#"); 
		// String jdbc_url ="jdbc:oracle:thin:@localhost:1521:xe";
		 Statement stmt =con.createStatement();
		 ResultSet rs =stmt.executeQuery("select * from employees where employee_id =111");
		 while(rs.next()) 
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			 con.close();
		 
		 }catch(Exception e) {
			 System.out.println(e);
		 } 
	}   */
	 
  /*	 public static void main(String args[]){  
		 try{  
		 //step1 load the driver class  
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
		   
		 //step2 create  the connection object  
		 Connection con=DriverManager.getConnection(  
		 "jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");  
		   
		 //step3 create the statement object  
		 Statement stmt=con.createStatement();  
		   
		 //step4 execute query  
		 ResultSet rs=stmt.executeQuery("select * from employees");  
		 while(rs.next())  
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		   
		 //step5 close the connection object  
		 con.close();  
		   
		 }catch(Exception e){ 
		  System.out.println(e);
		  }  
		   
		 }   */
	 
	 public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employees");
			while(rs.next()) 
				System.out.println(rs.getInt(1));
			con.close();
		}catch (Exception e) {
			System.out.println(e);
		}
			 
	 }
 }