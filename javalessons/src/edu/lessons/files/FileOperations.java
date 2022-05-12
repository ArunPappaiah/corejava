package edu.lessons.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

	public static void main(String[] args) throws IOException {
    // createNewFile();
	//	renameFile();
	//	appendDataToFile();
	//	modifyDataInFile();
	//	readDataFromFile();
    //  deleteFile();
	//	copyFile();
	//	moveFile();
	}
	
	
   public static void createNewFile() {
	   File file = new File("d:\\temp\\Create.txt"); 
	   boolean result;  
	   try {  
	   result = file.createNewFile();   
	      if(result){  
	      System.out.println("file created "+file.getCanonicalPath());
	      }  
	      else{  
	      System.out.println("File already exist at location: "+file.getCanonicalPath());  
	      }  
	      } catch (IOException e){  
	   e.printStackTrace();
	   }   
   }
 //Rename File
  public static void renameFile() {
	  File file= new File("d:/temp/abc.txt"); 
	  File rename =new File("d:/temp/bcd.txt");
	//  file.renameTo(rename);
	  if(file.renameTo(rename)) {
		  System.out.println(" Renamed");
	  }else {
		  System.out.println("Failed");
	  }  
  } 
 //Append Data to File
  public static void appendDataToFile() {
	  FileWriter fw= null;
	  BufferedWriter bw =null;
	  PrintWriter pw =null;
	  try {
		  fw=new FileWriter("d:\\temp\\Append.txt",true);
		  bw=new BufferedWriter(fw);
		  pw=new PrintWriter(bw);
		
		  pw.println("Hi");
		//  pw.println("Hello");
		  System.out.println("Data Successfully appended");
	      pw.flush();
	  }catch(IOException io) {
		  
	  }
	  
	  try ( FileWriter f = new FileWriter("d:\\temp\\Append.txt", true); 
		  BufferedWriter b = new BufferedWriter(f); 
		  PrintWriter p = new PrintWriter(b);	){	
		  
		  p.println("appending");
		//  p.println("app");
	  }catch(IOException io) {
		  io.printStackTrace();
	  }
  }
  //Modify data in File
  public static void modifyDataInFile() throws IOException {
	  String file="d:\\temp\\Modify.txt";
	  java.util.Scanner sc=new java.util.Scanner(new File(file));
	  StringBuffer buffer =new StringBuffer();
	  while(sc.hasNextLine()) {
		  buffer.append(sc.nextLine()+System.lineSeparator());
	  }
	  String fileContents =buffer.toString();
	  System.out.println("Contents of the file : "+fileContents);
	  sc.close();
	  String oldLine="Hi";
	  String newLine="Helloo";
	  fileContents =fileContents.replace(oldLine, newLine);
	  FileWriter writer=new FileWriter(file);
	  System.out.println("");
	  System.out.println("new data :"+fileContents);
	  writer.append(fileContents);
	  writer.flush();
  }
  //Read Data from file
  public static void readDataFromFile() {
	  int charfromfile;
	   FileInputStream fin=null;
	   String fname="d:\\temp\\Readme.txt";
	   try {
		   fin=new FileInputStream(fname);
	   }catch(FileNotFoundException e) {
		   System.out.println("File Not Found");
		   return;
	   }
      // checking if data isAvailable
	   try {
		   System.out.println("IsData Available "+fin.available());
	   }catch(IOException e) {
		   System.out.println("File is Closed "+e.getMessage());
	   }
         //reading data from the file
	   try {
		   do {
			   charfromfile=fin.read();
			   if(charfromfile != -1)
				   System.out.print((char) charfromfile);
		   }while(charfromfile != -1);
		   
	   }catch(IOException e) {
		   System.out.println("Error in read "+e.getMessage());
	   }finally {
		   try {
			   if(null !=fin)  
				   fin.close();
		   }catch(IOException e1) {
			   System.out.println(e1.getMessage());
		   }
	   }
  }
  //Delete File
  public static void deleteFile() {
		try{         
			File file= new File("d:\\temp\\Create.txt"); 
			file.delete();
			if(file.delete()){  
			System.out.println(file.getName() + " deleted"); 
		    }else{  
			System.out.println("failed");  
			}  
		}catch(Exception e){  
		  e.printStackTrace();  
		  }  
  }
  
  //Copy File
  public static void copyFile() throws IOException {
	  FileInputStream fis=null;
	  FileOutputStream fos=null;
	  
	  try {
		  fis=new FileInputStream("d:\\temp\\Copy.txt");
		  fos =new FileOutputStream("d:\\temp\\Paste.txt");
		  int c;
		  while((c=fis.read()) != -1) {
			  fos.write(c);
		  }
		  System.out.println("File Copied Successfully");
	  }
	  finally {
		  if(fis !=null) {
			  fis.close();
		  }
		  if(fos !=null) {
			  fos.close();
		  }
	  }
  }
  //Move File
  public static void moveFile() throws IOException {
	  Path move =Files.move(Paths.get("d:\\temp\\Move.txt"),Paths.get("d:\\temp\\Ooty\\Move.txt"));
    if(move != null) {
    	System.out.println("File Moved Successfully ");
    }else {
    	System.out.println("Failed ");
    }
  }
}
