package com.bridgelabz.util;
import java.util.Scanner;
public class Utility {
    

     // Get Input from the user     
	public static String scannerString() {
		Scanner Input = new Scanner(System.in);
		return Input.next();
		
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


}
