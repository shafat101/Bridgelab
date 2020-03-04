package com.bridgelabz.oop.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class AdressBookUtility {
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
}
