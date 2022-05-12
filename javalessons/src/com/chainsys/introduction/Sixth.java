package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

/*	public static void main(String[] args) {
		checkUserName();
	}
    public static void checkUserName() {
    	Scanner sc=new Scanner(System.in); //input stream
    	//prompt a message in the display console
    	System.out.println("Enter Your Name");
    	//get name from the console and store the name in a local variable
    	String userName= sc.nextLine();
    	sc.close();// closing the input stream
    	//Streams are created and managed by the OS. Scanner is just a handle
    	
    	System.out.println("Name is "+userName);  //display the input value received
    	char[] nameAsCharacters= userName.toCharArray();
    	int lengthOfCharArray= nameAsCharacters.length;
    	System.out.println("Length of Your Name is : "+lengthOfCharArray);
    	if(lengthOfCharArray < 3){
    		System.out.println("Name must have atleast 3 chars");
    		return;
    	}
    	if(lengthOfCharArray >15) {
    		System.out.println("Name must NOT have more than 15 chars");
    	}
    	String nameInUppercase =userName.toUpperCase();
    	nameInUppercase =nameInUppercase.trim();
    	char [] uppercaseCharAarray = nameInUppercase.toCharArray();
        
    	int asciivalue=0;
    	for(int index=0;index<lengthOfCharArray;index++) {
    		asciivalue =(int) uppercaseCharAarray[index];
    		System.out.println("ASCII : "+asciivalue);
    		if(asciivalue < 65 || asciivalue >90) {
    			if(asciivalue != 32) {
    				System.out.println("INVALID Character in Name :");
    				return;
    			}
    		}
    	//	System.out.println(index+" "+nameAsCharacters[index]);
    	}
    }  */
	public static void main(String args[]) {
	//	checkUserName();
		//findEvenNumbers();
		swapNumbers();
	}
	//public static void checkUserName() {
	/*	public static void findEvenNumbers() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ant 10 digit Number");
			long value=sc.nextLong();
			sc.close();
			long num=value;
			long reminder =0;
			while(num>0) {
				reminder =num%10;
				if(reminder%2==0) {
					System.out.println(reminder);
				}
				num=num/10;
			}
		
		}  */
  public static void swapNumbers() {
	  int x=67;
	  int y=92;
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  System.out.println("X :"+x+" "+"Y :"+y);
  }
	
}
