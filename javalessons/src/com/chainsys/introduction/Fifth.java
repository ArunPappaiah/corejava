package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		
	//	 printNumberOneToHundred();
	//	 printNumberTenToOne();
	//	 printMatrix();
	//	  printTriangle(); 
		  printTriangleB();
		 
	//	Pattern3();
	//	EvenNumbers();
	}
	
    public static void printNumberOneToHundred() {
    	int count=0;
    	for(count=0;count<=10;count++) {
    	System.out.print(count+" ");
    	}
    }
    
     public static void printNumberTenToOne() {
    	    	int count=0;
    	    	for(count=10;count>=0;count--) {
    	    	System.out.print(count+" ");
    	    	}
	}
    //nested for loop
     public static void printMatrix() {
    	 int countA=0;
    	 for(countA=1;countA<=5;countA++) {
    		 for(int countB=11;countB<=20;countB++) {
    			 System.out.print(countB+" ");
    		 }
    		 System.out.println();
    	 }
     }
    	  public static void printTriangle() {
    	    	 int countA=0;
    	    	 for(countA=1;countA<=10;countA++) {
    	    		 for(int countB=1;countB<=countA;countB++) {
    	    			 System.out.print(countB+" ");
    	    		 }
    	    		 System.out.println();
    	    	 }
    	  }
    	  public static void printTriangleB() {
    	    	 int countA=0;
    	    	 for(countA=1;countA<=10;countA++) {
    	    		 for(int countB=1;countB<=countA;countB++) {
    	    			 System.out.print(".");
    	    		 }
    	    		 for(int countC=countA;countC>=1;countC--) {
    	    			 System.out.print(countC);
    	    		 }
    	    		 System.out.println();
    	    	 }
     }  
	
	
	public static void Pattern3() {
		for (int countA = 1; countA <= 5; countA++) {
			int n = 5;

			for (int countB = 1; countB <= n - countA; countB++) {
				System.out.print("  ");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC+" ");
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD+" ");
			}
			System.out.println();
		}
		for (int countA = 4; countA >= 1; countA--) {
			int n = 4;

			for (int countB = 0; countB <= n - countA; countB++) {
				System.out.print("  ");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC+" ");
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD+" ");
			}

			System.out.println();
		}

	}
	public static void EvenNumbers() {
		for(int countA=0;countA<=100;countA++) {
			if(countA%2==1)
				continue;
			System.out.print(countA+" ");
		}
	}

}