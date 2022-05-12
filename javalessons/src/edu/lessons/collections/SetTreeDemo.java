package edu.lessons.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeDemo {  
	public static void main(String args[]) {
		demoA();
	}
	

    public static void demoA() {
    	TreeSet<String> ts=new TreeSet<String>();
    	ts.add("Cut");
    	ts.add("fun");
    	ts.add("Assam");
    	ts.add("Ball");
    	ts.add("Dog");
    	ts.add("Aag");
    	ts.add("AAg");
    	ts.add("Event");
    	ts.add("Fan");
    	//ts.add(null);
    	ts.add("Delhi");
    	ts.add("carrot");
    	ts.add("Ball");
    	ts.add("apple");
    	ts.add("boy");
    	ts.add("egg");
    	ts.add("Fool");
    	System.out.println("Size "+ts.size());
    	Iterator<String> itr=ts.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());    
    }  
    //	System.out.println(ts);
}}
