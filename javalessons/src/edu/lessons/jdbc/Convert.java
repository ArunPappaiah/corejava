package edu.lessons.jdbc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Convert {
	public static byte[] toByteArray(BufferedImage bi, String format) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(bi, format, baos);
		byte[] bytes =baos.toByteArray();
		return bytes;
	}
	public static BufferedImage toBufferedImage(byte[] bytes) throws IOException{
		InputStream is =new ByteArrayInputStream(bytes);
		BufferedImage bi =ImageIO.read(is);
		return bi;
	}
	public static void main(String args[]) throws IOException {
		BufferedImage bi =ImageIO.read(new File("\"D:\\\\temp\\\\new.jpg\""));
	}
}