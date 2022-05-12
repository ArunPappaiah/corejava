package com.chainsys.variables;
/**
 * 
 * @author arun3117
 *
 */
public class Bank {
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;

	public static void deposit(int paramAmount) {
		currentBalance = currentBalance + paramAmount;

	}

	public static int withdraw(int paramAmount) {
		currentBalance = currentBalance - paramAmount;
		return paramAmount;

	}

	public static void openAccount(String paramName, int paramAccountNumber) {

		customerName = paramName;
		accountNumber = paramAccountNumber;      
	}
}