package codes;

import java.util.Scanner;

public class Code {
	public static void main(String args[]) {
		DemoA();
	}
	public static void DemoA() {
		int x=0;int y=0;
		int z=0;
		String s1=null,s2=null;
		java.util.Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Inside Try");
			System.out.println("Enter value for X");
			s1=sc.nextLine();
			System.out.println("Enter value for Y");
			s2=sc.nextLine();
			x=Integer.parseInt(s1);
			y=Integer.parseInt(s2);
			z=x/y;
			System.out.println("Result "+z);
		}
		catch(ArithmeticException err) {
			System.out.println("Inside Catch1 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
			sc.close();
		}
		catch(NumberFormatException err) {
			System.out.println("Inside Catch1 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		catch(Exception err) {
			System.out.println("Inside Catch1 "+err.getMessage());
			System.out.println("Error Type "+err.getClass().getName());
		}
		finally {
			System.out.println("Inside Finally ");
			sc.close();
		}
	}
}
