/*****************************************************
 * purpose : validates and returns logical part     **
 *                                                  **                                                                  **   
 * @author SHAFAT BASHIR                            **                                                                     **
 * @version 1.0                                     **                                                                     **
 * @since 11/01/2020                                **                                                                     **
 * ***************************************************        
 */
package com.bridgelabz.util;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utility {


     // Get Input from the user     
	public static String scannerString() {
		Scanner input = new Scanner(System.in);
		return input.next();
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
    //Subtraction of 2 numbers
	public static double sun2Numbers(double x,double y) {
		x = x - y;
		return x;		
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
	
	//Returns Factors of a number
    public static ArrayList<Integer> factors(int n){
    	   ArrayList<Integer> arr = new ArrayList<Integer>();
  	     while(n > 1) {
  	    	 for(int i = 2;i <= n;i++) {
  	    		 if(n % i == 0) {
  	              arr.add(i);
  	              n = n / i;
  	              break;	    			 
  	    		 }
  	    	 }
  	     }
    	return arr;
    	
    }
	
    //will log array elements of an array
    public static void arrayPrint(ArrayList<Integer> arr) {
    	for (int i = 0; i < arr.size(); i++) {
			Utility.output(Utility.StringOf(arr.get(i)));
		}
    }
    
    /*A program with cubic running time. 
     * Read in N integers and counts the 
     * number of triples that sum to exactly 0.
     * prints the distinct triplets.
     */
    
    public static void nOfTriples(int[] n) {
    	int count = 0;
        for(int i = 0;i < n.length;i++ ) {
       	 for(int j = 0;i < n.length ;i++) {
       		 for(int k = 0;k < n.length;k++) {
       			if ((n[i] + n[j] + n[k]) == 0) {
       				count++;
       				Utility.output("Found the number "+"Count : "+count +" Distinct triplets : "+n[i]+" "+n[j]+" "+n[k]);
       			
       			} 
       		 }
       	 }
        }
    }
    
    //root one quadratic equation formula
    public static double rootOne(double a,double b,double c) {
    	double delta = (b*b) - (4*a*c);
    	double root1 = (-b + Math.sqrt(delta))/(2*a);
         return root1;
    }
    
    //root two quadratic equation formula
    public static double rootTwo(double a,double b,double c) {
    	double delta = (b*b) - (4*a*c);
    	double root2 = (-b - Math.sqrt(delta))/(2*a);
         return root2;
    }
    
    //formulae to calculate distance
    public static double cDistance(double x,double y) {
    	double distance = x*x + y*y;
    	x = Math.pow(distance,0.5);
    	return x;    	
    }
    
    //the wind chill
    public static double windChill(double t,double v) {
    	double w = 35.74 + 0.6215 * t +(0.4275 * t - 35.75)*(Math.pow(v, 0.16));
    	return w;
    }
    
    //Generating random number for a particular range
    public static String generatingRandom(int x) {
    	char[] chars = "a123456789bcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    	Random random = new SecureRandom();
    	StringBuffer sb = new StringBuffer();
    	while(x > 0) {
    	sb.append(chars[(int) (random.nextInt(chars.length))]);
    	x--;
    	}
    	
    	String couponCode = sb.toString();
    	
    	return couponCode;
    }
    
    //Comparing two numbers and returns true if same
    public static boolean comparingNums(int x,int y) {
    	if(x == y) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //Returns total seconds in a given time
    public static int timeInSeconds(int h,int m,int s) {
    	int totalSeconds = (h * 60 * 60) + m * 60 + s;
    	return totalSeconds;
    }
	
    //TicTacToe winning logic using 2D array
    public static boolean winningLogic(int[][] arr) {
    	if((arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) || (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) || 
    			(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) || (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) ||
    			(arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) || (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) ||
    			(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) || (arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2]))
    	{
    		return true;
    	}
    	return false;
    }
    //Returns two random values
    public static double duelrandomiser() {
    	
    double	randno = Math.random();
    	
    	
    	return randno;
    }
    
    // Gambling function 
    public static double[] roundN(int stake1,int goal,int num) {
    	 int temp = num;double[] arr = new double[4];
		 int n = 0;int stake = stake1;
    	
    		
    		 while(stake < goal && num > 0 && stake > 0) {
    			 double rand = Utility.duelrandomiser();
    			
    			 if(rand > 0.5) {
    				 n++;
    				 stake +=  40;
    				 if( goal >= stake && num >0) {
    					 Utility.roundN(stake - 1, goal, num--);
    				 }else{
    					 break;
    				 }
    			 }
    				 else if(rand < 0.5) {
    					 if(stake > 0 && goal >= stake && num > 0) {
    						 Utility.roundN(stake - 3, goal, num--);
    					 }
    				 }
    	                			 
    				 
    			 }
    		 arr[0] = n;arr[1] = temp;arr[2] = num;arr[3] = stake;
  		
    		   return arr;
    	 

    }
    
    //
    
}
	
	


