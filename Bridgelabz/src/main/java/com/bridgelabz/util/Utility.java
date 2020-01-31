/*****************************************************
 * purpose : validates and returns logical part     **
 *                                                  **                                                                  **   
 * @author SHAFAT BASHIR                            **                                                                     **
 * @version 1.0                                     **                                                                     **
 * @since 11/01/2020                                **                                                                     **
 * ***************************************************        
 */
package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.objectorientedprograms.Food;
import com.bridgelabz.util.SinglyLinkedListUtility.ListNode;

public class Utility {


     // Get Input from the user     
	public static String scannerString() {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		return s;
	}
    //input boolean
	public static boolean scannerBoolean() {
		Scanner input = new Scanner(System.in);
		boolean s = input.hasNext();
		
		return s;
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
	
	//Returns Current time in mills
	public static long timeInMills() {
		long time = System.currentTimeMillis(); 
		return time;
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
		
	// Validating Input is a char
		public static boolean validatinginputChar(String s) {
			
			char letter = s.charAt(0);
			if (Character.toString(letter).matches("^[a-pA-P0-9]*$")) {
		         return true;
		    }else{
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
 
    
    //jUnit temperature Conversion
    public static double tempConversion(double inputTemp,char converTo) {
    	double result;
    	if (converTo == 'f' || converTo == 'F') {
    		result = (inputTemp * (9/5)) + 32;
    	}else if(converTo == 'c' || converTo == 'C') {
    		result = (inputTemp - 32) * 5/9;
    	}else {
    		result = Double.MAX_VALUE;
    	}
    	return result;
    }
    
    //jUnit monthlyPayment
    public static double payment(double _P,double _Y,double _R) {
    	double paymentt = Double.MIN_VALUE;
    	try {
    		double r = _R / (12 * 100);
    		double n = 12 * _Y;
			paymentt = (_P * r) / Math.pow((1 - (1 + r)), -n);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	return paymentt;
    }    
    
    //jUnit toBinary
    public static ArrayList<Integer> toBinary(int n) {
         int rem;
         ArrayList<Integer> arr = new ArrayList<Integer>();
         
     	while(n > 0) {
    		rem = n % 2;
    		n = n / 2;
    		arr.add(rem);
    		
    	//	System.out.println(rem);
    	}
     	return arr;
    }
    
    //reverse an Array
    public static ArrayList<Integer> reverseArr(ArrayList<Integer> arr){
    	int i;
    	for (int j = 0;j < arr.size() / 2;j++) {
    		i = arr.get(arr.size() - (j + 1));
    		arr.set(arr.size() - (j + 1), arr.get(j));
    		arr.set(j, i);		
    	}
    	return arr;
    }
    
    //returns sqrt using newtons method
    public static double sqrtNewtonsMethod(double c) {
    	double t = c;
    	double EPSILON = 1E-15;
    	while (Math.abs(t - c/t) > EPSILON*t)
            t = (c/t + t) / 2.0;
        return t;
    }
    
   //returns sqrt using newtons method error tolerance
    public static double sqrtNewtonsMethod(double c,double epsilon) {
    	double t = c;
    	while (Math.abs(t - c/t) > epsilon*t)
            t = (c/t + t) / 2.0;
        return t;
    }
    
   //returns word from word list
    public static int binarySearch(String[] arr,String word) {
    	
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int result = word.compareTo(arr[mid]);
			if (result == 0) {
				return mid;
			}
			if (result > 0) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}

		return -1;
	}
    
     //Insertion sort to sort a String
   public static String[] insertionSortForString(String[] arr) {
	   String key;int i;
	   for(int j = 1;j < arr.length - 1;j++) {
		   key = arr[j];
		   i = j - 1;
		   
		   while(i >= 0 && arr[i].charAt(0) > key.charAt(0)) {
			   arr[i+1] = arr[i];
			   i = i - 1;
			   
		   }
		   arr[i + 1] = key;
	   }
	   for (String string : arr) {
		System.out.println(string);
	}
	   return arr;
   }
   
   //Bubble sort
  public static  int[] bubbleSort(int arr[]){
   
       int n = arr.length;
       for (int i = 0; i < n-1; i++) {
    	   
       
           for (int j = 0; j < n-i-1; j++) {
        	   
           
               if (arr[j] > arr[j+1])
               {
                   
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
           }
       return arr;
   }
    
  //Read a file
  public static String readFile(String str) {
	  File file = new File(str); 
	  String tt = ""; 
	  try {
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  String st;
	  while ((st = br.readLine()) != null) {
		//  System.out.print(st); 
		  tt += st;
	  }
	   
	  }catch (Exception e) {
		e.printStackTrace();
	}
	 // System.out.print(tt); 
	  return tt;
  }
  
  //Create a file
  public static boolean createFile() {
	  boolean flag = false;
	  try {
	      File myObj = new File("filename1.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	        return true;
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	return flag;
	  
  }
  
  //Write to a file
  public static void writeFile(String str) {
	  try {
		  
		  
	      FileWriter myWriter = new FileWriter("/home/mobicom/Documents/filename.txt");
	      myWriter.write(str);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
  }
  
  //Update a file 
  public static void upDateFile(String[] data) {
	  try { 
		  
          // Get the name of the contact to be updated 
          // from the Command line argument 
          String newName = data[0]; 
           
          

          String nameNumberString; 
          String name; 
          long number; 
          int index; 

          // Using file pointer creating the file. 
          File file = new File("friendsContact.txt"); 

          if (!file.exists()) { 

              // Create a new file if not exists. 
              file.createNewFile(); 
          } 

          // Opening file in reading and write mode. 
          RandomAccessFile raf 
              = new RandomAccessFile(file, "rw"); 
          boolean found = false; 

          // Checking whether the name 
          // of contact already exists. 
          // getFilePointer() give the current offset 
          // value from start of the file. 
          while (raf.getFilePointer() < raf.length()) { 

              // reading line from the file. 
              nameNumberString = raf.readLine(); 

              // finding the position of '!' 
              index = nameNumberString.indexOf('!'); 

              // separating name and number. 
              name = nameNumberString 
                         .substring(0, index); 
              number = Long 
                           .parseLong(nameNumberString 
                                          .substring(index + 1)); 

              // if condition to find existence of record. 
              if (name == newName) { 
                  found = true; 
                  break; 
              } 
          } 

          // Update the contact if record exists. 
          if (found == true) { 

              // Creating a temporary file 
              // with file pointer as tmpFile. 
              File tmpFile = new File("temp.txt"); 

              // Opening this temporary file 
              // in ReadWrite Mode 
              RandomAccessFile tmpraf 
                  = new RandomAccessFile(tmpFile, "rw"); 

              // Set file pointer to start 
              raf.seek(0); 

              // Traversing the friendsContact.txt file 
              while (raf.getFilePointer() < raf.length()) { 

                  // Reading the contact from the file 
                  nameNumberString = raf.readLine(); 

                  index = nameNumberString.indexOf('!'); 
                  name = nameNumberString.substring(0, index); 

                  // Check if the fetched contact 
                  // is the one to be updated 
                  if (name.equals("")) { 

                      // Update the number of this contact 
                      nameNumberString 
                          = name ;
                  } 

                  // Add this contact in the temporary file 
                  tmpraf.writeBytes(nameNumberString); 

                  // Add the line separator in the temporary file 
                  tmpraf.writeBytes(System.lineSeparator()); 
              } 

              // The contact has been updated now 
              // So copy the updated content from 
              // the temporary file to original file. 

              // Set both files pointers to start 
              raf.seek(0); 
              tmpraf.seek(0); 

              // Copy the contents from 
              // the temporary file to original file. 
              while (tmpraf.getFilePointer() < tmpraf.length()) { 
                  raf.writeBytes(tmpraf.readLine()); 
                  raf.writeBytes(System.lineSeparator()); 
              } 

              // Set the length of the original file 
              // to that of temporary. 
              raf.setLength(tmpraf.length()); 

              // Closing the resources. 
              tmpraf.close(); 
              raf.close(); 

              // Deleting the temporary file 
              tmpFile.delete(); 

              System.out.println(" Friend updated. "); 
          } 

          // The contact to be updated 
          // could not be found 
          else { 

              // Closing the resources. 
              raf.close(); 

              // Print the message 
              System.out.println(" Input name"
                                 + " does not exists. "); 
          } 
      } 

      catch (IOException ioe) { 
          System.out.println(ioe); 
      } 

      catch (NumberFormatException nef) { 
          System.out.println(nef); 
      } 
  } 
  
  //practice
  public static JSONObject jsonaddd(String name,String weight,double price) {
	  JSONObject food = new JSONObject();
	  food.put("name",name);
	  food.put("weight",weight);
	  food.put("price",price);
	  
	return food;
  }
  
  //Write JSON to file
  public static JSONObject writeJson(String[] args) {
	  Food food = new Food();
	  JSONArray foodList = new JSONArray();
	  System.out.println("Enter total number of items : ");
	  String num = Utility.scannerString();
	  if(Utility.numberOrNot(num)) {
		  int n = Utility.numberOrNotReturn(num);
		 
	  for(int i = 0;i < n;i++) {
	    	//  food.clear();	  
	  System.out.println("Enter the name of "+args[0]);
	  food.setName(Utility.scannerString());
	  System.out.println("Enter the weight of "+args[0]);
	  food.setWeight(Utility.scannerString());
	  System.out.println("Enter the price of "+args[0]);
	  food.setPrice(Utility.scannerInt());
	  System.out.println("************************");
	
	 foodList.add(Utility.jsonaddd(food.getName(),food.getWeight(),food.getPrice()));
	  
	  }
	  }else {
		 return null;
	  }
	  
	  JSONObject obj = new JSONObject();
	  obj.put(args[0], foodList);
	 
	 return obj; 
  }
  
  //json creator
  public static JSONArray createJson(String[] args) {
	  Food food = new Food();
	  JSONArray foodList = new JSONArray();
	  System.out.println("Enter total number of items : ");
	  String num = Utility.scannerString();
	  if(Utility.numberOrNot(num)) {
		  int n = Utility.numberOrNotReturn(num);
		 
	  for(int i = 0;i < n;i++) {
	    	//  food.clear();	  
	  System.out.println("Enter the name of "+args[0]);
	  food.setName(Utility.scannerString());
	  System.out.println("Enter the weight of "+args[0]);
	  food.setWeight(Utility.scannerString());
	  System.out.println("Enter the price of "+args[0]);
	  food.setPrice(Utility.scannerInt());
	  System.out.println("************************");
	
	 foodList.add(Utility.jsonaddd(food.getName(),food.getWeight(),food.getPrice()));
	  
	  }
	  }else {
		 return null;
	  }
	 
	 return foodList; 
  }
  //write it into the file
  public static void insertIntoFile(String obj ,String str) {
	  String s = "/home/mobicom/Documents/"+str+".json";
		//  System.out.println(s);
		  try (FileWriter file = new FileWriter(s)) {
			  
	          file.write(obj);
	          file.flush();

	      } catch (IOException e) {
	          e.printStackTrace();
	      }
  }
  
  //Read JSON file
  public static JSONArray readJson(String str) {
	  String s = "/home/mobicom/Documents/"+str+".json";
   //   System.out.println(s);
      try (FileReader reader = new FileReader(s))
      {    
    	  JSONParser parser = new JSONParser();
        
    	  Object ob  = parser.parse(reader);
    	  JSONObject obj = (JSONObject) ob;
    	  JSONArray arr = (JSONArray) obj.get(str);
//    	  JSONObject objects;
//    	  for(int i = 0; i < arr.size(); i++)
//    	  {
//    		   objects = (JSONObject) arr.get(i); 
//    		  System.out.println(objects.get("name"));
//    		  System.out.println(objects.get("price"));
//    		  System.out.println(objects.get("weight"));
//    		  System.out.println("********************");
//    	  }
    	  
    //	 System.out.println(arr);

    	 
    	 return arr;
    	  
      } catch (FileNotFoundException e) {
          e.printStackTrace();
         
          return null;
      } catch (IOException e) {
          e.printStackTrace();
         
          return null;
      } catch (ParseException e) {
    	  
          e.printStackTrace();
          return null;
      }
	
  }
  
  

  
  //SLL to String
  public static String sLLtoString(ListNode head) {
		if(head == null) {
			return null;
		}
	 ListNode current = head;
	 String str = "";
	 while(current != null) {
		// System.out.println(current.data );
		 str += current.data + " ";
		 current = current.next;
		 
	 }
	return str;  
  }
  // (dayOfWeek) Returns 0 for Sunday, 1 for Monday, and so forth.
  public static int day(int month, int day, int year) {
      int y = year - (14 - month) / 12;
      int x = y + y/4 - y/100 + y/400;
      int m = month + 12 * ((14 - month) / 12) - 2;
      int d = (day + x + (31*m)/12) % 7;
      return d;
  }
  
  //calendar function
  public static void calenderPrint(int month,int year) {
	  
	  //Name of Months
	  String[] months = {""+"janury","February","March","April","May","June",
			  "July","August","September","October","November","December"};
	  //Number of days in month var
	  int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  //check leap year or not
	  if (month == 2 && leapOrNot(year)) {
		  days[month] = 29;
	  }
	  System.out.println("   "+months[month]+" "+year);
	  System.out.println(" S  M Tu  W Th  F  S");
	  
	  // starting day
      int d = day(month, 1, year);

      // print the calendar
      for (int i = 0; i < d; i++)
          System.out.println("   ");
      for (int i = 1; i <= days[month]; i++) {
    	  System.out.printf("%2d ", i);
          if (((i + d) % 7 == 0) || (i == days[month])) {
        	  System.out.println();
          } 
      }
  }
  
  //palndrome function using deque
  public static boolean palandromeFunction(String str) {
		Deque deque = new Deque(str.length());
		boolean flag = false;
		for(int i = 0;i < str.length();i++) {
			deque.insertrear(Utility.StringOf(str.charAt(i)));
		}
		 while(! deque.isEmpty())  {
	    	//  System.out.println("rear element : "+ deque.getRear() +" Front Element : "+deque.getFront());
	    	  if(deque.getRear().equals(deque.getFront())) {
	    		  deque.deleterear();
		    	  deque.deletefront();
		    	  flag = true;
	    	  }else {
	    		  flag = false;
	    		  break;
	    	  }
	    	  
	      }
		return flag;
	}
  
  //PrimeNumbers in particular range
  public static int[] rangePrineNumbers(int low,int high) {
	int[] arr = new int[high  / 4];
	int j = 0;
	arr[j] = high;
        while (low < high) {
        	if(low < 3){
        	 low = 3;
        	}
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
            	
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
              //  System.out.println(low + " ");
                arr[j+1] = low;
                j++;     
            }
            ++low;
        }
		return arr;  
  }
  
 
  
    }

	
	























