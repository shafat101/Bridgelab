package com.bridgelabz.oop.utility;

import java.util.Scanner;



public class Utility {
	 // Get Input from the user     
		public static String scannerString() {
			Scanner input = new Scanner(System.in);
			String s = input.next();
			
			return s;
		}
		
		//return int
		public static int retint() {
			Scanner input = new Scanner(System.in);
			int s = input.nextInt();
			
			return s;
		}
		//next line 
		public static String nextLine() {
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			
			return s;
		}
	    //input boolean
		public static boolean scannerBoolean() {
			Scanner input = new Scanner(System.in);
			boolean s = input.hasNext();
			
			return s;
		}
		//char scanner
		public static char scannerChar() {
			Scanner input = new Scanner(System.in);
			char c = input.next().charAt(0);
			
			return c;
		}
		//double scanner
		public static double scannerDouble() {
			Scanner input = new Scanner(System.in);
			double c = input.nextDouble();
			
			return c;
		}
		
		//scannerArray to take multiple int values
		public static int[] scannerArray(int len) {
			
			String s;int[] n = new int[len];
			for(int i =0;i < len;i++) {
				System.out.println("Enter the number : ");
				s = Utility.scannerString();
				if (Utility.numberOrNot(s)) {
					n[i] = Utility.numberOrNotReturn(s);
				}else {
					i--;
					continue;
				}
			}
			return n;
		}
	     
		//
		//check for Zero
		public static boolean checkZero(double x) {
			if(x == 0) {
				return true;
			}
			return false;
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
	    
		// Validating the Input FOR UserInput
			public static boolean validatingInputRange(int t,int v) {
				 int x = 50;int v1 = 120;int v2 = 3; 
				  if((t < x) && (v < v1) && (v > v2)) {
					 return true; 
				  }else {
					 return false;
				  }
			}
			
		// Validating Input is a char
			public static boolean validatinginputChar(String s) {
				
				char letter = s.charAt(0);
				if (Character.toString(letter).matches("^[a-pA-P0-9]*$")) {
			         return true;
			    }else{
			        return false;
			    }
			}
			//Takes  User input -n-  
			public static int scannerInt() {
				Scanner input = new Scanner(System.in);
				input.hasNext();
				return input.nextInt();
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

}
