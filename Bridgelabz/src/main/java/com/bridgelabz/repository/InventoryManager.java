package com.bridgelabz.repository;

import org.json.simple.JSONObject;

import com.bridgelabz.model.Dataassign;
import com.bridgelabz.serviceimplementation.InterfaceImplementationJSONinventory;
import com.bridgelabz.util.Utility;

public class InventoryManager  {
	static Dataassign inventory=new Dataassign();
	static JSONObject obj=new JSONObject();
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceImplementationJSONinventory imi = new InterfaceImplementationJSONinventory();
		System.out.println("Enter the name : ");
		inventory.setName(Utility.scannerString());
		obj.put("name",inventory.getName());
		System.out.println("Enter the Weight : ");
		inventory.setWeight(Utility.scannerDouble());
		obj.put("weight", inventory.getWeight());
		System.out.println("Enter the price : ");
		inventory.setPrice(Utility.scannerDouble());
		obj.put("price",inventory.getPrice());
		
		
		System.out.println(imi.readFile());
		
	}

	
	public static void stock() {
		
		
	}

}
