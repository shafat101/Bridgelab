package com.bridgelabz.util;

import java.util.Scanner;

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
	
	//
}
