package com.bridgelabz.oop.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.model.UserAccessVAr;




public class Utiltiy {
	// Get Input from the user
	public static String scannerString() {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		return s;
	}

	// input boolean
	public static boolean scannerBoolean() {
		Scanner input = new Scanner(System.in);
		boolean s = input.hasNext();
		input.close();
		return s;
	}

	// char scanner
	public static char scannerChar() {
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		input.close();
		return c;
	}

	// double scanner
	public static double scannerDouble() {
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		input.close();
		return c;
	}
	//Takes  User input -n-  
	public static int scannerInt() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		return n;
	}
	
	//create account on file
	public static JSONArray toJSONUserAccount(String name,double cash,int n,int share,String stock) {
	
			 UserAccessVAr inventory=new UserAccessVAr();
                JSONArray arr = new JSONArray();
				JSONObject jo=new JSONObject();
				
				inventory.setName(name);
				jo.put("name",inventory.getName());
				
				inventory.setCash(cash);
				jo.put("cash",inventory.getCash());
				
				inventory.setN(n);
				jo.put("n",inventory.getN());
				
				inventory.setShares(share);
				jo.put("share",inventory.getShares());
				
				inventory.setName(name);//set Symbol
				jo.put("name",inventory.getName());
				
				inventory.setStocks(stock);
				jo.put("stock",inventory.getStocks());
				
				JSONObject newobj=new JSONObject();
				newobj.put("account",jo);
				arr.add(newobj);
				return arr;   
	}
	
	//Update json file
	
	// Create a file
	public static boolean createFile(String file) {
		boolean flag = false;
		try {
			File myObj = new File("/home/mobicom/Documents/" + file + ".json");
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
	  public static void writeFile(String str,String path) {
		  try {
			  
			  
		      FileWriter myWriter = new FileWriter("/home/mobicom/Documents/"+path+".json");
		      myWriter.write(str);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	  }
	  
	//Read File   
	public static JSONArray readfile(String filename) {
		// TODO Auto-generated method stub
		/// home/mobicom/Documents/stock.json
		try {
			FileReader fr = new FileReader(filename);
			JSONParser pars = new JSONParser();
			Object obj = pars.parse(fr);
			JSONArray arr = (JSONArray) obj;
			// System.out.println(arr);
			return arr;
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONArray empty = new JSONArray();
		return empty;
	}
	
	//Get current Date Time
    public static String getCurrentDateTime() {
    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    	   LocalDateTime now = LocalDateTime.now(); 
    	   return dtf.format(now);
    }
	
	  public static String[] avaliableStocks() {
			
				JSONArray arr=readfile("/home/mobicom/Documents/stock.json");
				String[] strarr;
				strarr = new String[arr.size()];
				for (int i = 0; i < arr.size(); i++) 
				{
					JSONObject inventory=(JSONObject) arr.get(i);
					JSONObject obj=(JSONObject) inventory.get("stock");
					String name=(String) obj.get("name");
					
					strarr[i] = name;
					
				}
				return strarr;
	  }
	  
	 
}
