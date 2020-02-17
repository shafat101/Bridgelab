package com.bridgelabz.serviceimplementation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.model.AssignValues;
import com.bridgelabz.model.DataAssign;
import com.bridgelabz.oop.utility.Utility;
import com.bridgelabz.service.Interface;




public class InterfaceImplementationInventory implements Interface {
      AssignValues assig = new AssignValues();
      JSONArray arr=new JSONArray();
	@Override
	public void inputStock() {
		// TODO Auto-generated method stub
		/*
		 * assig.setStockNames(Utility.scannerString());
		 * assig.setNumberOfShares(Utility.scannerInt());
		 * assig.setSharePrice(Utility.scannerDouble());
		 */
		 try {
			 DataAssign inventory=new DataAssign();

				JSONObject jo=new JSONObject();
				System.out.println("enter Shock name");
				inventory.setStockName(Utility.scannerString());//set product name
				jo.put("name",inventory.getStockName());
				System.out.println("enter Number of Share");
				inventory.setNumberOfShares(Utility.scannerInt());
				jo.put("numberOfShares",inventory.getNumberOfShares());
				System.out.println("enter Share price");
				inventory.setSharePrice(Utility.scannerDouble());
				jo.put("sharePrice",inventory.getSharePrice());
				JSONObject newobj=new JSONObject();
				newobj.put("stock",jo);
				arr.add(newobj);
			  
		      FileWriter myWriter = new FileWriter("/home/mobicom/Documents/stock.json");
		      myWriter.write(arr.toString());
		     // arr.clear();
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	
	@Override
	public JSONArray readFile() {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("/home/mobicom/Documents/stock.json");
			JSONParser pars=new JSONParser();
			Object obj=pars.parse(fr);
			JSONArray arr=(JSONArray)obj;
			//System.out.println(arr);
		return arr;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		JSONArray empty=new JSONArray();
		return empty;
		
	}
	@Override
	public double totalStockValue() {
		double inv=0;

		JSONArray arr=readFile();
		for (int i = 0; i < arr.size(); i++) 
		{ 
			
			JSONObject stock=(JSONObject) arr.get(i);
			JSONObject obj=(JSONObject) stock.get("stock");
		
			Double sharePrice=(Double) obj.get("sharePrice");
			Long numberOfShares =(Long) obj.get("numberOfShares");
			String name=(String) obj.get("name");
		
			
			inv = numberOfShares*sharePrice;
			System.out.println("Name : "+name+"\n"+"Number Of Shares : "+numberOfShares+"\n Share Price : "+sharePrice 
					+"\n Total Stock Value : "+inv);
			System.out.println();
		}
	return inv;
		
	}
	@Override
	public double stockValue() {
		double inv=0;
		System.out.println("enter stock name to calulate");
		String cal= Utility.scannerString();
		JSONArray arr=readFile();
		for (int i = 0; i < arr.size(); i++) 
		{
			JSONObject inventory=(JSONObject) arr.get(i);
			JSONObject obj=(JSONObject) inventory.get("stock");
			String name=(String) obj.get("name");
			if(cal.equalsIgnoreCase(name))
			{
				
				Long numberOfShares = (Long) obj.get("numberOfShares");
				Double sharePrice=(Double) obj.get("sharePrice");
				
			inv= numberOfShares * sharePrice;
			}
		}
		return inv;
		
	}
	public void showinventory() 
	{
			JSONArray arr=readFile();
			arr.forEach(emp -> displayStock((JSONObject)emp));
	}
	@Override
	public void displayStock(JSONObject emp) {
		// TODO Auto-generated method stub
		JSONObject inventory=(JSONObject) emp.get("stock");
		String name=(String) inventory.get("name");
		String numberOfShares=String.valueOf(inventory.get("numberOfShares"));
		String price=String.valueOf(inventory.get("sharePrice"));
		System.out.println("name:"+name+"\nnumberOfShares:"+numberOfShares+"\nprice:"+price+"\n");	
	}
      
}
