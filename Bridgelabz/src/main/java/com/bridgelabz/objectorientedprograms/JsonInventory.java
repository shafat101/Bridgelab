package com.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.Utility;

public class JsonInventory {

	public static void main(String[] args) throws FileNotFoundException{
		
		String[] arr = new String[5];
		arr[0] = "wheat";
		 String s = "";  
     try {
    	  s = Utility.readJson("wheat").toString();
    	  s = "{\""+arr[0]+"\":" + s;
    //	 System.out.println("this -> "+s);
    	 
    	 
    	 
    	 JSONArray jArr = Utility.createJson(arr);
    	 String sec = jArr.toJSONString();
    	 StringBuilder  str = new StringBuilder(sec); 
    	 sec = str.deleteCharAt(0).toString();
    	 sec = "}," + sec;
    	 String b = s.replaceFirst("}]",sec);
    	
    	 System.out.println(b);
    	 Utility.insertIntoFile(b,arr[0]);
    	 
     }catch (NullPointerException e) {
    	 if(s.isEmpty()) {
    		// System.out.println("happy to see"+s);
    		 
    		 JSONObject jO =	Utility.writeJson(arr);
    		 Utility.insertIntoFile(jO.toString(),arr[0]);
    	 }	
    	
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		
		
		
	}

}
