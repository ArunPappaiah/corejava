package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		//primitive types
		//Signed data Types
	
		byte byteMinValue=-128;  //less 128,greater than -129(-128...+127)
		System.out.println(" byteMaxValue :"+ byteMinValue);
		short  shortMaxValue=32767; //2^16
		System.out.println(" byteMaxValue "+ shortMaxValue);
		short shortMinValue=-32768; //2^16
		System.out.println("shortMinValue "+shortMinValue);
		int intMaxValue=217483647;
		System.out.println("intMaxValue ="+intMaxValue);
		int intMinValue=-217483648;
		System.out.println("intMinValue ="+intMinValue);
		long longMaxValue=9223372036854775807L;
		System.out.println("longMaxValue ="+longMaxValue);
		long longMinValue=-9223372036854775808L;
		System.out.println("longMinValue ="+longMinValue);
		float floatMaxValue=217483647.5432F;
		System.out.println("floatMaxValue ="+floatMaxValue);
		float floatMinValue=-217483648.11111F;
		System.out.println("floatMinValue ="+floatMinValue);
		double doubleMinValue=9223372036854775807D;
		System.out.println("doubleMinValue ="+doubleMinValue);
		double doubleMaxValue=-9223372036854775808D;
		System.out.println("doubleMinValue ="+doubleMaxValue);
		char c1='A';
		System.out.println("c1 :"+c1);
		char c2='a';
		System.out.println("c2 :"+c2);
		int asciivalueofc1=(int)c1;
		System.out.println(asciivalueofc1);
		char c3=(char)89;
		System.out.println(c3);
		boolean flag;
	}

}
