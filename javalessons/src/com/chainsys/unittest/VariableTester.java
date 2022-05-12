package com.chainsys.unittest;

import com.chainsys.variables.Demo;

public class VariableTester {
	/*
	 * Tester class for global variables
	 * @author Chainsys -Arun
	 * @category To test Demo class, it's fields ,and methods
	 * date: Mar 24 2022
	 */
	public class variableTester {
	  /*
	   * Test static variable
	   */
		public static void testGlobalVariable() {
			//display the value of static field
			//value is zero(default value)
			//DataA is accessed without creating an object
			System.out.println("DataA: "+Demo.DataA);
			//display the value of immutable field
			//this is not possible without an object
			//System.out.println("DataB: "+Demo.DataB);
			//display the value of constant field
			System.out.println("DataC: "+Demo.DataC);
			//modifying value of the static field DataA
			Demo.DataA=2345;
			System.out.println("DataA: "+Demo.DataA);
			
			//modifying value of the static field DataC
			//ERROR: The final Demo.DataC cannot be assigned
			//Demo.DataC=2345;
		}
	
}

	public static void testImmutableVariable() {
		// TODO Auto-generated method stub
		/*cannot make a static reference toyhe non-static field demo.DataB
		 * Demo.DataB =123;
		 * 
		/ * first create an object or the class
		 * pass an int value as an argument to the constructor
		 * access the immutable instance field using the object reference
		 */
		Demo firstObject = new Demo(123);
		System.out.println(firstObject.DataB);
		/*value assignment to an immutale field can not be changed
		 * value for the immutable field can be assigned only through the constructor 
		 * 
		 */
//		firstObject.DataB=567;
	}
    /**
     * Calling static method using class name
     * Without creating an object
     * Created on: 25 March 2022
     */
      public static void testStaticMethod() {
    	  Demo.SayHello();
      }
      /**
       * Calling non static method using class name
       * Without creating an object, non-Static method cannot be called
       * Created on: 25 March 2022
       */
      public static void tesNontStaticMethod() {
    	  //ERROR
    	  //Demo.greenUser();
    	  Demo firstObject =new Demo(111);
    	  //call the non static method
    	  firstObject.greenUser();
      }
	}
