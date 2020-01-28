package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.util.Utility;

public class JsonInventory {

	public static void main(String[] args) {
		
		
		
//	  String s =  Utility.readFile("/home/mobicom/Desktop/Bridgelabzsolutions/gitin/Bridgelabz/src/main/java/com/bridgelabz/util/inventory.json");
//     System.out.println(s);
		String[] arr = new String[5];
		arr[0] = "basmiti";
		arr[1] = "1 kg";
		arr[2] = "150 rs";
		arr[3] = "Rice";
		Utility.writeJson(arr);
		
		Utility.readJson();
		
		
	}

}
