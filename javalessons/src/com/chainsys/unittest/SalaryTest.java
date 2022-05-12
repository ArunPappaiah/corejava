package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class SalaryTest {
	public static void test() {
		testEmpName();
		testCity();
		testSalary();
	}
   public static void testEmpName() {
	   Employee firstEmployee= new Employee(2244);
	   firstEmployee.setName("Kalai");
	   System.out.println(firstEmployee.getName());
   }
   public static void  testCity() {
	   Employee firstEmployee= new Employee(2244);
	   firstEmployee.setCity("Chennai");
	   System.out.println(firstEmployee.getCity());
   }
  public static void  testSalary() {
	  Employee firstEmployee= new Employee(2244);
	   firstEmployee.setSalary(27000);
	   System.out.println(firstEmployee.getSalary());
   }
	
}
