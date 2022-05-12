package edu.lessons.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class DictionaryPropDemo {

	public static void main(String[] args) {
		Properties capitals=new Properties();
		String str;
        Set <Object> states;//Set<String> states
        capitals.put("Iilinois "," Springfield");
        capitals.put("Florida "," Tailahassee");
        capitals.put("Missourl "," Jefferson City");
        capitals.put("Washington "," Olympia");
        capitals.put("California "," Sacramento");
        capitals.put("Indiana "," Indianpolis");
        states =capitals.keySet();//get set-view if keys
        Iterator <Object> itr=states.iterator();
        while(itr.hasNext()) {
        	str=(String ) itr.next();
        	System.out.println("The capital of "+str+"is"+capitals.getProperty(str)+".");
            
        }
        //look for state 
        str =capitals.getProperty("TamilNadu","Not Found");
        System.out.println("The capital of TamilNadu is "+str);
	}

}
