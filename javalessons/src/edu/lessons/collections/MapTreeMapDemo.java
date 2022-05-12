package edu.lessons.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class MapTreeMapDemo {
   public static void main(String args[]) {
	   TreeMap<String,Double> tm=new TreeMap();
	   tm.put("Jhon Doe", 3434.34);
	   tm.put("Tom Smith", 123.22);
	   tm.put("Jane Baker", 1378.00);
	   tm.put("Tod Hall", 99.22);
	   tm.put("Ralph Smith", -19.08);
	   
	   Set<Map.Entry<String,Double>> set=tm.entrySet();
	   Iterator<Map.Entry<String,Double>> i=set.iterator();
	   while(i.hasNext()) {
		   Map.Entry<String,Double> me=i.next();
		   System.out.println(me.getKey());
		   System.out.println(me.getValue());
	   }
	   System.out.println();
	   //Deposit 1000 into Jhon Doe's account
	   double balance=tm.get("Jhon Doe");
	   tm.put("Jhon Doe",(balance+1000));
	   System.out.println("Jhon Doe's new balance :"+tm.get("Jhon Doe"));
   }
}
