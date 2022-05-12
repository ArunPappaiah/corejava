package edu.lessons.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
	public static void main(String args[]) {
		usingStringArrayList();
	}
	public static void usingStringArrayList() {
ArrayList <String> stringArrayList = new ArrayList <String> ();
System.out.println("Initial size of StringAarrayList :"+stringArrayList.size());
try {
	stringArrayList.add("Car");
	stringArrayList.add("Auto");
	stringArrayList.add("Egg");
	stringArrayList.add("Box");
	stringArrayList.add("Doll");
	stringArrayList.add("Fan");
	//will insert a new value
	//pushing the current value of index 1 to the next index
	stringArrayList.add(1,"Animal");
	stringArrayList.add(1,"Girl");
	stringArrayList.add(1,"Fan");
	System.out.println("Size of stringArrayList after additions :"+stringArrayList.size());
	System.out.println("Contents of string ArrayList after additions :"+stringArrayList);
	//wil replace the value in index 2
	stringArrayList.set(2,"xenas");
	System.out.println("After set(2) :"+stringArrayList);
	System.out.println("Last Index of :"+stringArrayList.lastIndexOf("Fan"));
	//remove the first instance of 'Fan' 
	 stringArrayList.remove("Fan");
	 stringArrayList.remove(2);
	 System.out.println("Size after remove (2) :"+stringArrayList.size());
	 System.out.println("Contents of StringArrayList"+stringArrayList);
	 //will reduse the capacity
	 stringArrayList.trimToSize();
    } catch(Exception err) {
    	System.out.println(err.getMessage());
   }
	}
}
