package com.chainsys.unittest;

import com.chainsys.variables.Bank;

public class BankAccountTesting {
	public static void main(String args[]) {
		testDeposit();
		testWithdraw();
		testOpenaccount();
	}
	public static void testDeposit() {
	    System.out.println("Balance is :"+Bank.currentBalance);
	    Bank.deposit(5000);
	   // System.out.println(Bank.deposit(5000));
	    System.out.println("Balance is :"+Bank.currentBalance);
	    System.out.println("Withdraw amount is :"+Bank.withdraw(2000));
	    System.out.println("After Balance is :"+Bank.currentBalance);
	}

	public static void testWithdraw() {
		System.out.println("Before Balance :"+Bank.currentBalance);
    	int withdraw =Bank.withdraw(2000);
    	System.out.println("Withdraw Amount is :"+withdraw);
    	System.out.println("After Balance :"+Bank.currentBalance);
	}

	public static void testOpenaccount() {
		Bank.openAccount("Jhon", 1436887668);
    	System.out.println("Customer Name is :"+Bank.customerName);
    	System.out.println("Customer Account Number is :"+Bank.accountNumber);
	}
}
