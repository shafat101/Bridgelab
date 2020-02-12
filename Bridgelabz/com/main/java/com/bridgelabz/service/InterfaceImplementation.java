package com.bridgelabz.service;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.model.Dataassign;
import com.bridgelabz.util.Utility;

public class InterfaceImplementation implements Interface{
	JSONArray arr=new JSONArray();
public boolean createFile() {
	 boolean flag = false;
	  try {
	      File myObj = new File("/home/mobicom/Documents/inventory.json");
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
public void insertIntoFile() {
	 try {
		 Dataassign inventory=new Dataassign();

			JSONObject jo=new JSONObject();
			System.out.println("enter product name");
			inventory.setName(Utility.scannerString());//set product name
			jo.put("name",inventory.getName());
			System.out.println("enter weight");
			inventory.setWeight(Utility.scannerDouble());
			jo.put("weight",inventory.getWeight());
			System.out.println("enter price");
			inventory.setPrice(Utility.scannerDouble());
			jo.put("price",inventory.getPrice());
			JSONObject newobj=new JSONObject();
			newobj.put("Inventory",jo);
			arr.add(newobj);
		  
	      FileWriter myWriter = new FileWriter("/home/mobicom/Documents/inventory.json");
	      myWriter.write(arr.toString());
	     // arr.clear();
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

}

public void UpdateFile() {
	System.out.println("enter product name to edit");
	String edit=Utility.scannerString();
	JSONArray arr=readFile();
	String name="";
	double weight=0.0,price=0.0;
	for (int i = 0; i < arr.size(); i++) 
	{
		JSONObject obj=(JSONObject) arr.get(i);
		JSONObject inventory=(JSONObject) obj.get("Inventory");
		name=(String) inventory.get("name");
		if(name.equalsIgnoreCase(edit))
		{
			System.out.println("r u want to change the name of product\npress Y for yes N for no");
			char ch=Utility.scannerChar();
			if(ch=='Y' || ch=='y')
			{
				System.out.println("enter name");
				name=(String)inventory.get("name");
				name=Utility.scannerString();
			}
			else
			{
				name=(String)inventory.get("name");
			}
			System.out.println("r u want to change the weight of product\npress Y for yes N for no");
			ch=Utility.scannerChar();
			if(ch=='Y' || ch=='y')
			{
				System.out.println("enter weight");
				weight=(double) inventory.get("weight");
				weight=Utility.scannerDouble();
			}
			else
			{
				weight=(double) inventory.get("weight");
			}
			System.out.println("r u want to change the price of product\npress Y for yes N for no");
			ch=Utility.scannerChar();
			if(ch=='Y' || ch=='y')
			{
				System.out.println("enter price");
				price=(double) inventory.get("price");
				price=Utility.scannerDouble();
			}
			else
				price=(double) inventory.get("price");
			JSONObject newobj=new JSONObject();
			newobj.put("name",name);
			newobj.put("weight", weight);
			newobj.put("price",price);
			JSONObject newassign=new JSONObject();
			newassign.put("Inventory",newobj);
			arr=readFile();
			arr.remove(i);
			arr.add(i, newassign);
			try
			{
			FileWriter fw=new FileWriter("/home/mobicom/Documents/inventory.json");
			fw.write(arr.toString());
			fw.close();
			} catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			break;	
		}
	}
}
public void deleteinInvantary() {
	System.out.println("enter name of product:");
	String remove=Utility.scannerString();
	JSONArray arr=readFile();
	for (int i = 0; i < arr.size(); i++) 
	{
		JSONObject obj=(JSONObject) arr.get(i);
		JSONObject inventory=(JSONObject) obj.get("Inventory");
		String name=(String) inventory.get("name");
		if(name.equalsIgnoreCase(remove))
		{
			System.out.println("in");
			arr.remove(i);
			try {
				FileWriter fw=new FileWriter("/home/mobicom/Documents/inventory.json");
				fw.write(arr.toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	} 	
}
@Override
public JSONArray readFile() {
	// TODO Auto-generated method stub
	try {
		FileReader fr=new FileReader("/home/mobicom/Documents/inventory.json");
		JSONParser pars=new JSONParser();
		Object obj=pars.parse(fr);
		JSONArray arr=(JSONArray)obj;
	return arr;
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	JSONArray empty=new JSONArray();
	return empty;
	
}
public void showinventory() 
{
		JSONArray arr=readFile();
		arr.forEach(emp -> displayInventory((JSONObject)emp));
}
@Override
public void displayInventory(JSONObject emp) {
	// TODO Auto-generated method stub
	JSONObject inventory=(JSONObject) emp.get("Inventory");
	String name=(String) inventory.get("name");
	String weight=String.valueOf(inventory.get("weight"));
	String price=String.valueOf(inventory.get("price"));
	System.out.println("name:"+name+"\nweight:"+weight+"\nprice:"+price+"\n");	
}
@Override
public double calculateInventory() {
	// TODO Auto-generated method stub
	double inv=0;
	System.out.println("enter product name to calulate");
	String cal= Utility.scannerString();
	JSONArray arr=readFile();
	for (int i = 0; i < arr.size(); i++) 
	{
		JSONObject inventory=(JSONObject) arr.get(i);
		JSONObject obj=(JSONObject) inventory.get("Inventory");
		String name=(String) obj.get("name");
		if(cal.equalsIgnoreCase(name))
		{
		double weight=(double) obj.get("weight");
		double price=(double) obj.get("price");
		inv=weight*price;
		}
	}
	return inv;
}
@Override
public double totalWeight() {
	// TODO Auto-generated method stub
	double total=0;
	JSONArray arr=readFile();
	for (int i = 0; i < arr.size(); i++) 
	{
		JSONObject obj=(JSONObject) arr.get(i);
		JSONObject inventory=(JSONObject) obj.get("Inventory");
		double weight=(double) inventory.get("weight");
		total=total+weight;
	}
	return total;
}
@Override
public double totalPrice() {
	// TODO Auto-generated method stub
	double total=0;
	JSONArray arr=readFile();
	for (int i = 0; i < arr.size(); i++) 
	{
		JSONObject obj=(JSONObject) arr.get(i);
		JSONObject inventory=(JSONObject) obj.get("Inventory");
		double weight=(double) inventory.get("weight");
		double price=(double)inventory.get("price");
		total=total+(weight*price);
	}
	return total;
}

	
}
