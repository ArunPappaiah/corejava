package com.chainsys.unittest;

import edu.lessons.opps.interfaces.Calculator;

public class TestCalculator extends Calculator {
	public static void main(String args[]) {
		 Calculator obj = new Calculator();
		   System.out.println(obj.add(10,5));
		   System.out.println(obj.multiply(5,10));
		   System.out.println(obj.divide(10,2));
	 }
}
