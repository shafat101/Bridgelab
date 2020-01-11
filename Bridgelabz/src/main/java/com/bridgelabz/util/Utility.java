package com.bridgelabz.util;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utility {


     // Get Input from the user     
	public static String scannerString() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}


	// Validating the Input FOR UserInput
	public static String validatingInputforUserInput() {
		 String input;
		  if(((input = Utility.scannerString() ) != null) && input.length() >= 3) {
			 return input; 
		  }else {
			 return null;
		  }
	}

	// Random Number generator for coin flip
	public static double rNumberGenerator() {
		return Math.random();
	}

	//Takes  User input -n-  
	public static int scannerInt() {
		Scanner input = new Scanner(System.in);
		input.hasNext();
		return input.nextInt();
	}

	//Takes two arguments X and Y gives us Percentage
	public static double percentage(double x,double y) {
		return (x / y) * 100;
	}

	//Whether Year is a Leap year or not
	public static boolean leapOrNot(int year) {
		boolean flag = false;
		if (year % 400 == 0) {
			flag = true;
		}else if(year % 100 == 0) {
			flag = false;
		}else if (year % 4 == 0) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}

	//Returns Power of X^y  in integer
	public static int powerof(int x,int y) {
	 return (int) Math.pow(x, y);	
	}

	//Returns Power of X^y  in double
	public static double powerof(double x,double y) {
	 return  Math.pow(x, y);	
	}

	//Validates if input is Integer 
	public static boolean numberOrNot(String input){
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex) {
			return false;
		}
		return true;
	}

	//if true returns Integer 
	public static int numberOrNotReturn(String input){
		return Integer.parseInt(input);
	}

	//Logger to log output 
	public static void output(String value) {
		Logger logger = Logger.getLogger(Utility.class.getName());
		logger.log(Level.INFO,value);
	}

	//Logger to log output 
		public static void outputError() {
			Logger logger = Logger.getLogger(Utility.class.getName());
			logger.log(Level.INFO,"! Invalid Input");
		}
		
	//Converts double into String
	public static String StringOf(double value) {
		return String.valueOf(value);		
	}
	
	//Converts int into String
	public static String StringOf(int value) {
		return String.valueOf(value);	
	}
    
	//Returns Nth Harmonic number 
	public static double harmonicNumber(int n) {
		double x = 1, j = 1;
		//core logic
		for(double i = 2;i <= n;i++) {
			
			x += j/i;
			
		}
		return x;
	}
	
	//
	
	
	
	
	

}
