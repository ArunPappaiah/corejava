package com.chainsys.variables;

public class Demo {
    public static int DataA; //static global variable
    public final int DataB; //immutable global variable (not static)
    public final static int DataC=300; //constant
   //non static member field
    /*
     * Constructor
     * Constructor is a special method
     * The name of the constructor and the name of the class will be same 
     * Constructor don't have return type.
     * Constructor can take parameters
     */
	public Demo(int dataB) {
		/* Assigning value to the global read -only field (this.DataB) */
		this.DataB =dataB;
	}
	public static void SayHello() {
		System.out.println("Hello Developer!!!");
	}/***
	*static method can be called without an object 
	*/
	public void greenUser() {
		System.out.println("Greetings USER!!!");
	}
}
