package com.chainsys.unittest;

import edu.lessons.opps.interfaces.ExpliciteImplementor;
import edu.lessons.opps.interfaces.InterfaceA;

public class TestInterfaceA {
	public static void main(String[] args) 
	{
		InterfaceA.echo();
		InterfaceA a1=new ExpliciteImplementor();
		a1.print();
		a1.print("Hello");
	}
}