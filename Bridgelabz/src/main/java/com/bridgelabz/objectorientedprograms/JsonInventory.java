package com.bridgelabz.objectorientedprograms;

import org.json.simple.JSONObject;

import com.bridgelabz.util.Utility;

public class JsonInventory {

	public static void main(String[] args) {
		
		
		
//	  String s =  Utility.readFile("/home/mobicom/Desktop/Bridgelabzsolutions/gitin/Bridgelabz/src/main/java/com/bridgelabz/util/inventory.json");
//     System.out.println(s);
		String[] arr = new String[5];
		arr[0] = "wheat";
		
		JSONObject jO =	Utility.writeJson(arr);
		
          Utility.insertIntoFile(jO,arr[0]);
		Utility.readJson("wheat");
		
		
	}

}
