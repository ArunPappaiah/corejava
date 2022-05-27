package com.chainsys.miniproject.commonutil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException {
		boolean result = false;
		for (int i = 0; i < data.length(); i++) {
			int c = (int) data.charAt(i);
			if (!(c >= 48 && c <= 58)) {
				throw new InvalidInputDataException("The value in string must contain only numbers ");
			}
		}
		return result;
	}

	public static boolean checkNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		boolean result = false;
		if(data <= 0) {
			throw new InvalidInputDataException("The value must be greater then zero");
		}
		return result;
	}

	public static boolean checkCharLessThanTwenty(String data) throws InvalidInputDataException {
		boolean result = false;
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != ' ') {
				count++;
			}
			if (count >= 20) {
				throw new InvalidInputDataException("The value of character must be less then twenty digit");
			}
		}
		return result;
	}

	public static boolean checkMailContainsAtsymbol(String data) throws InvalidInputDataException {
		boolean result = false;
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		Matcher m = p.matcher(data);

		if (!m.find()) {
			throw new InvalidInputDataException("The Input Data is not valid ");
		}
		return result;
	}

	public static boolean checkSalaryLessThanTenDigit(Float data) throws InvalidInputDataException {
		boolean result = false;
		String d = Float.toString(data);
		int count = 0;
		for (int i = 0; i < d.length(); i++) {
			if (d.charAt(i) != ' ') {
				count++;
			}
			if (count >= 10) {
				throw new InvalidInputDataException("The Digits of Number must be less then ten digit");
			}
		}
		return result;
	}
    public static boolean checkNumberLessThanTenDigits(int data) throws InvalidInputDataException{
    	boolean result =false;
    	int count =0;
    	while(data !=0) {
    		data =data/10;
    		count++;
    	}
    	if(count >10) {
    		throw new InvalidInputDataException("The Digits of Number must be less then ten digit");
    	}
    	return result;
    }
         
   public static boolean checkPhoneNumberLessThanTenDigits(String data) throws InvalidInputDataException {
		boolean result = false;
		int len= data.length();
			if (!(len ==10)) {
				throw new InvalidInputDataException("The value of Numbers must be Equal of ten digit");
			}
		return result;
	}   
    
	public static boolean checkDataOnlyString(String data) throws InvalidInputDataException {
		boolean result = false;
		for (int i = 0; i < data.length(); i++) {
			int c = (int) data.charAt(i);
			if (!((c >= 65 && c <= 90) || (c >= 97 && c < 122))) {
				throw new InvalidInputDataException("The value in string must contain only characters ");
			}
		}
		return result;
	}

	public static boolean checkSalaryOnlyNumbers(int data) throws InvalidInputDataException {
		boolean result = false;
		String d = Integer.toString(data);
		for (int i = 0; i < d.length(); i++) {
			int c = (int) d.charAt(i);
			if (!(c >= 48 && c <= 58)) {
				throw new InvalidInputDataException("The value in value should must contain only numbers ");
			}
		}
		return result;
	}
	
	public static boolean checkDateIsValid(String data) throws InvalidInputDataException {
		boolean result = false;
		
		String date ="";
		for(int i=0;i<data.length()-1;i++) {
			date =date+data.charAt(i);
		}    
		int d= Integer.parseInt(data);
		if(!(d<=31)) {
			throw new InvalidInputDataException("The value of date must be less than 31 :");
		}    
	/*	String month ="";
		for(int i=3;i<data.length()-5;i++) {
			month =month+month.charAt(i);
		}
		int m= Integer.parseInt(month);
		if(!(m<=12)) {
			throw new InvalidInputDataException("The value of month must be less than 12 :");
		}   */
		return result;
	}   
	
	public static boolean checkMonthIsValid(String data) throws InvalidInputDataException {
		boolean result = false;
		String date ="";
		for(int i=0;i<=data.length()-1;i++) {
			date =date+data.charAt(i);
		}
		int d= Integer.parseInt(date);
		if(d>12) {
			throw new InvalidInputDataException("The value of date must be less than 31 :");
		}
		return result;
	}
	
	public static boolean isDateValid(String data) throws InvalidInputDataException
	{
	        try {
	            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	            df.setLenient(false);
	            df.parse(data);
	            return true;
	        } catch (ParseException e) {
	            return false;
	        }
	}
}
