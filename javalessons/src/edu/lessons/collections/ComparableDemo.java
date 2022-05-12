package edu.lessons.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class ComparableDemo {
	public static void main(String args[]) {
		sortComparableEmp();
	}
	
	public static void sortComparableEmp()
    {
        EmpComparable e1=new EmpComparable(100);
        e1.Name="Sam";
        e1.setAge(25);
        EmpComparable e2=new EmpComparable(200);
        e2.Name ="Musk";
        e2.setAge(50);
        EmpComparable e3=new EmpComparable (300);
        e3.Name ="Jobs";
        e3.setAge(70);
        List<EmpComparable> empList =new ArrayList <>();
        empList.add(e2);
        empList.add(e3);
        empList.add(e1);
        // System.out.println(empList);
 //----------------------------------------------------------------------------       
        Iterator<EmpComparable> empIterator =empList.iterator();
        while(empIterator.hasNext())
        {
            System.out.println(empIterator.next().getID());
        }  
        Collections.sort(empList);
        System.out.println("----");
  //----------------------------------------------------------------------------       
        empIterator=empList.iterator();
        while(empIterator.hasNext())
        {
            System.out.println(empIterator.next().getID());
        }   
        EmpNameComparator empComparator =new EmpNameComparator();
        Collections.sort(empList,empComparator);
        System.out.println("----");
  //----------------------------------------------------------------------------       
        empIterator=empList.iterator();
        while(empIterator.hasNext())
        {
        	EmpComparable emp=empIterator.next();
            System.out.println(emp.getID()+" "+emp.Name+", Age is :"+emp.getAge());
        }
       /* EmpAgeComparator empAgeComparator=new EmpAgeComparator();
        Collections.sort(empList,empComparator,empAgeComparator);
        System.out.println("----");
        empIterator=empList.iterator();
        while(empIterator.hasNext())
        {
        	EmpComparable emp=empIterator.next();
            System.out.println(emp.getID()+" "+emp.Name);
        }  */
    }  
	
}
