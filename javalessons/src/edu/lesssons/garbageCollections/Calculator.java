package edu.lesssons.garbageCollections;


public class Calculator
{
	public Calculator()
	{
		System.out.println("Object Created "+this.hashCode());
	}
	/*
	 * The finalized method will be called on an object by the GC
	 * before remove the object from the HEAD
	 */
	protected void finalize()//overrides Object.finalize() method
	{
		System.out.println("Object Finalized "+this.hashCode());
	}
	public int add(int x,int y)
	{
		Object obj=new Object();
		System.out.println("From Add");
		return x+y;
	}
	//....
	public int div(int x,int y)
	{
		System.out.println("From div");
		return x/y;
	}
	public int product(int x,int y)
	{
		System.out.println("From product");
		return x*y;
	}

}