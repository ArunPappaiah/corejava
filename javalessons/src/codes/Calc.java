package codes;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Calc {
	public static void main(String args[]) {
       Properties prp =System.getProperties();
       Set set =prp.entrySet();
       Iterator itr =set.iterator();
       while(itr.hasNext()) {
    	   Map.Entry entry =(Map.Entry)itr.next();
    	   System.out.println(entry.getKey()+" = "+entry.getValue());
       }
	}
}