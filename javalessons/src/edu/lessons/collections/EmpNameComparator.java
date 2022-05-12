package edu.lessons.collections;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmpComparable> {
   @Override
public
  int compare(EmpComparable e1,EmpComparable e2) {
	   int result=0;
	   result =e1.Name.compareTo(e2.Name);
	   return result;
   }
}
