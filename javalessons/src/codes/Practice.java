package codes;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:@localhost:1521:xe","system","Arunps2244#");
			PreparedStatement ps= con.prepareStatement("insert into filetable values(?,?)");
			File f =new File("d:\\temp\\crt.txt");
			FileReader fr=new FileReader(f);
			ps.setInt(1, 123);
			ps.setCharacterStream(2, fr,(int)f.length());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
