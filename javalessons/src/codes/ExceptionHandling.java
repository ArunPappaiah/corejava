package codes;

import java.util.Scanner;

import com.chainsys.variables.Calculator;

public class ExceptionHandling {
	public static void main(String args[]) {
	//	taskA();
	//	testDivide();
	//	testDevideWithTry();
	//	tryCatch();
	//	tryFinally();
		multipleTry();
	}
    public static void taskA() {
    	System.out.println("Before try");
    try {
    	System.out.println();
    }
    catch(Exception err) {
    	System.out.println("Inside catch");
    }
    finally {
    	System.out.println("Inside Finally");
    }
    }
    
    //----------------------------------------------------
    public static void testDivide() {
    	Calculator calculator =null;
    	int args1=100;
    	Scanner scanner =new Scanner(System.in);
    	System.out.println("Enter a number less than 100 ");
    	int args2=scanner.nextInt();
    	int result=0;
    	System.out.println("Before");
    	calculator =new Calculator();
    	result =Calculator.devide(args1,args2);
    	System.out.println("Result ="+result);
    	System.out.println("After");
    	scanner.close();
    }
    //-----------------------------------------------------
    public static void testDevideWithTry() {
    	Calculator calculator=null;
    	int args1=100,args2=0,result=0;
    	Scanner scanner=null;
    	System.out.println("Before Try");
    	//Before try
    	try {
    		int localWithinTry=123;
    		System.out.println("Inside try");
    		 scanner=new Scanner(System.in);
    		 System.out.println("Enter a number less than 100 ");
    		 args2=scanner.nextInt();
    		 calculator =new Calculator();
    		 result=calculator.devide(args1, args2);
    		 System.out.println("Result ="+result);
    		 System.out.println(localWithinTry);
    	}
    	catch(Exception e) {
    		//local within try=2000
    		System.out.println("Inside catch :"+e.getMessage());
    		//e.printStackTrace();
    	}
    	finally {  //finally will run when there is error or no error
    		System.out.println("Inside finally");
    		scanner.close();
    	}
    	System.out.println("After try-catch-finally");
    }
    //----------------------------------------------------------
    public static void tryCatch() {
    	System.out.println("Before try");
    	try {
    		System.out.println("Inside try");
    	}
    	catch(Exception err) {
    		System.out.println("Inside catch "+err.getMessage());
    	}
    	System.out.println("After try-catch");
    }
   // ------------------------------------------------------------- 
    public static void tryFinally() {
    	System.out.println("Before try");
    	try {
    		System.out.println("Inside try");
    	}
    	finally {
    		System.out.println("Inside finally");
    	}
    	System.out.println("After try-finally");
    }
   // ------------------------------------------------------------- 
    public static void multipleTry() {
    	int x=0;
    	int y=0;
    	System.out.println("Before try");
    	Scanner sc =null;
    	try {  //try1
    		sc=new Scanner(System.in);
    	}
    	catch(Exception err) {
    		System.out.println("Error while creating Scanner "+err.getMessage());
    	
    	return;
    	}
    	System.out.println("After finally");
    	System.out.println("Before try2");
    	
    	try {  //try2
    		System.out.println("Inside try2");
    		System.out.println("Enter value for x");
    		x=sc.nextInt();
    	}
    	catch(Exception err) {
    		System.out.println("Inside catch Invalid value for x"+err.getMessage());
    		return;
    	}  //end try2
    	System.out.println("After finally 2");
    	try {  //try3
    		System.out.println("Inside try3");
    		System.out.println("Enter value for y");
    		y=sc.nextInt();
    	}
    	catch(Exception err) {
    		System.out.println("Inside catch -Invalid value for y"+err.getMessage());
    		return;  
    	}
       finally {
    	System.out.println("Inside finally 3");
    	sc.close();
        }
    	System.out.println("After finally 3");
    	
    	try {  //try4
    		int z=x/y;
    		System.out.println("z= "+z);
    	}
    	catch(Exception e) {
    		System.out.println("Error in Block4 :"+e.getMessage());
    	}
    	System.out.println("After try4");
    }
}
