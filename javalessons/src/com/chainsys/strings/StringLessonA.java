package com.chainsys.strings;

import java.util.Scanner;

public class StringLessonA {
    public static void lessonOne() {
    	String firstString= "Chainsys";
    	System.out.println(firstString);
    	char dataOne[]= {'C','h','a','i','n'};
    	String secondString=new String(dataOne);
    	System.out.println(secondString);
    	String thirdString = new String(new char[]{ 'C','h','a','i','n'});
    	System.out.println(thirdString);
    }
 
    public static void lessonTwo() {
    	String firstString="Hello";
    	String secondString="Hello";
    	String thirdString="Hello";
    	int firstNumber=100;
    	int secondNumber=100;
    	int thirdNumber=100;
    	System.out.println(firstString);
    	System.out.println(secondString);
    	firstString="welcome";
    	System.out.println(firstString);
    	System.out.println(secondString);
    }
    public static void creatingStringinaForLoop() {
    	for(int count=0;count<10;count++) {
    		String s1="Hello";
    	}
    }
    public static void stringToCharArray() {
    	java.util.Scanner Scanner =new java.util.Scanner(System.in);
    	System.out.println("Enter a WORD");
    	String firstString =Scanner.nextLine();
    	Scanner.close();
    	int stringlength=firstString.length();
    	System.out.println("Length "+stringlength);
    	char[] data=firstString.toCharArray();
    	int dataarraylength=data.length;
    	System.out.println("Length "+dataarraylength);
    }
    public static void stringToUpperLower() {
    	java.util.Scanner Scanner =new java.util.Scanner(System.in);
    	System.out.println("Enter a WORD");
    	String firstString =Scanner.nextLine();
    	Scanner.close();
    	System.out.println(firstString);
    	String stringInUppercase= firstString.toUpperCase();
    	System.out.println("toUpperCase "+stringInUppercase);
    	
    	System.out.println("s1="+firstString);
    	String stringInLowercase =firstString.toLowerCase();
    	System.out.println("toLowercase="+stringInLowercase);
    	System.out.println("s1="+firstString);
    	//subString
    	//from the 4th char till end
    	String substring =firstString.substring(2);
    	System.out.println(substring);
    	//from 3rd char to 6t char (i.e excluding 7th char)
    	//from index 2 to index 5
    	substring =firstString.substring(2,6);
    	System.out.println(substring);
    	//replace
    	String replacedstring= firstString.replace('a','e');
    	System.out.println(replacedstring);
    	//equals
    	boolean flag1= firstString.equals(stringInUppercase);//false
    	System.out.println(flag1);
    	//equalsIgnoreCase
    	boolean flag = firstString.equalsIgnoreCase(stringInUppercase);
    	System.out.println(flag);
    }
    public static void testStringTrim() {
    	String secondString ="   Hope      it      rain   ";
    	System.out.println("Before Trim: "+secondString.length());
    	secondString =secondString.trim();
    	System.out.println("After Trim: "+secondString.length());
    }
    public static void testSplit() {
    	String firstString ="  Mon;Tue;Wed;Thu;Fri;Sat;Sun  ";
    	String trimmedString =firstString.trim();
    	String[] data=trimmedString.split(";");
    	int count=data.length;
    	System.out.println("Days Count "+count);
    }
    public static void reverse() {
    	java.util.Scanner scanner =new Scanner(System.in);
    	System.out.println("Enter a Sentence");
    	String sentence="abca";
    	try {
    		sentence=scanner.nextLine();
    	}finally {
    		scanner.close();
    	}
    	char c[]=sentence.toCharArray();
    	for(int i=c.length-1;i>=0;i--) {
    		System.out.print(c[i]);
    	}
    	
    	//System.out.println(sentence.);
    }
    public static void verifyStrng(String s1) {
    	System.out.println("Enter ");
    	Scanner scanner=new Scanner(System.in);
    	 s1=scanner.nextLine();
    	if(null==s1) {
    		System.out.println("String is Null ");
    		return;
    	}
    	else
    		System.out.println("String is NOT Null "+s1);
    
    if(!s1.isEmpty())
    	System.out.println("\t Not Empty "+s1);
    else
    	System.out.println("\t String is Empty");
}
}