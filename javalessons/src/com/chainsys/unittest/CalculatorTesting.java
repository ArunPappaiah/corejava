package com.chainsys.unittest;

import com.chainsys.variables.Calculator;
/**
 * This class is for unit testing the Calculator class and it's methods
 * Methods to test
 * <list>
 * add(param1,param2)
 * Multiply(param1,param2)
 * divided (param1,param2)
 * subtract(param1,param2)
 * </list>
 * @author arun3117
 *Created on : 25 Mar 2022
 */
public class CalculatorTesting {
   public static void main(String args[]) {
	 /*  System.out.println(Calculator.add(8, 4));
	   System.out.println(Calculator.devide(8, 4));
	   System.out.println(Calculator.Multiply(8, 4));
	  System.out.println( Calculator.sun(8, 4));  */
	   testAdd();
	   testMultiply();
	   testDivide();
	   testSubtract();
   }  
   public static void testAdd() {
	   int arg1=100;
	   int arg2=50;
	   int output=Calculator.add(arg1, arg2);
	  System.out.println("Result of Add is :"+output);
   }
   public static void testMultiply() {
	   int arg1=100;
	   int arg2=50;
	   int output=Calculator.Multiply(arg1, arg2);
	  System.out.println("Result of multiply is :"+output);
   }
   public static void testDivide() {
	   int arg1=100;
	   int arg2=50;
	   int output=Calculator.devide(arg1, arg2);
	  System.out.println("Result of Divide is :"+output);
   }
   public static void testSubtract() {
	   int arg1=100;
	   int arg2=50;
	   int output=Calculator.sun(arg1, arg2);
	  System.out.println("Result of Subtract is :"+output); 
   }
   
}
