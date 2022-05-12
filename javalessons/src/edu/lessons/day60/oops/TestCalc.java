package edu.lessons.day60.oops;

import com.chainsys.variables.Calculator;

import edu.lessons.opps.interfaces.ICalculator;

public class TestCalc {
public static void main(String args[]) {
	testMarker();
}
	
	
	public static void testA() {}
	
	public static void testMarker() {
	Calculator firstCalculator =new Calculator();
    if(firstCalculator instanceof ICalculator) {
    	ICalculator contract=(ICalculator) firstCalculator;
    	int output =0;
    	output =contract.add(10,5);
    	System.out.println(output);
    	output=contract.multiply(10,5);
    	System.out.println(output);
    	output=contract.divide(10,5);
    	System.out.println(output);
    }
    else
    	System.out.println(firstCalculator.getClass().getName()+"does not implement ICalculator");
	}
}
