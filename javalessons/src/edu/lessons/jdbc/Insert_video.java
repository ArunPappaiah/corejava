package edu.lessons.jdbc;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Insert_video {
 /*	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Arunps2244#");
		Statement stmt = conn.createStatement();
		File file = new File("d:\\temp\\sample.mp4");
		FileInputStream fileInputStream = new FileInputStream(file);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		while (fileInputStream.available()>0) {
		out.write(fileInputStream.read());
		}
		
		byte[] jpgByteArray = out.toByteArray();
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String INSERT_PICTURE = "insert into MyPictures(name, video) values (?, ?)";
		PreparedStatement ps = null;
		try {
		conn.setAutoCommit(false);
		ps = conn.prepareStatement(INSERT_PICTURE);
		ps.setString(1, "Test1");
		ps.setBytes(2,jpgByteArray);
		ps.executeUpdate();
		ResultSet rs = stmt.executeQuery("select video from insert_video");
		while (rs.next()) {
		File file1 = new File("d:\\temp\\sample.mp4");
		FileOutputStream foStream = new FileOutputStream(file1);
		ByteArrayOutputStream oStream = new ByteArrayOutputStream();
		if(rs.getString("photo") != null){
		InputStream is2 = rs.getBinaryStream(1);
		byte[] bytes=new byte[is2.available()];
		is2.read(bytes);
		oStream.write(bytes);
		oStream.writeTo(foStream);
		}
		conn.commit();
		}}finally {
		ps.close();
		}
		
	}  */
}

