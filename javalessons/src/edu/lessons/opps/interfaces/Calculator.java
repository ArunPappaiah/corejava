package edu.lessons.opps.interfaces;

public class Calculator implements ICalculator {
	
    public int add(int v1,int v2) {
	int v3=v1+v2;
	return v3;
    }
    public int multiply(int v1,int v2) {
    int v3=v1*v2;
   	return v3;
    }
    public int divide(int v1,int v2) {
    int v3=v1/v2;
    return v3;
    }
}
