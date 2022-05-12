package codes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Read {
    public static void main(String args[]) {
    	int charFromFile ;
    	FileInputStream fis =null;
    	String fname="";
    	try {
			fis=new FileInputStream(fname);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		}
    	try {
			System.out.println("Is data is availabe "+fis.available());
		} catch (IOException e) {
			System.out.println("File is closed"+e.getMessage());
			return;
		}
    }
}
