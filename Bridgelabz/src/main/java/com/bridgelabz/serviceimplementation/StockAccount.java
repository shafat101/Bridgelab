package com.bridgelabz.serviceimplementation;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.oop.utility.Utiltiy;
import com.bridgelabz.service.FuncInterface;





public class StockAccount implements FuncInterface{
	JSONArray arr = new JSONArray();
	    public String name;     
	    public double cash;           
	    public int n;                 
	    public int[] shares;          
	    public String[] stocks;       
	@Override
	public void stockAccount(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double valueOf() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public void buy(int amount, String symbol) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void sell(int amount, String symbol) {
		// TODO Auto-generated method stub
		
	}
    
	@Override
	public void save(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Name :");
		String name = Utiltiy.scannerString();
		System.out.println("Enter the amount of Cash :");
		double cash = Utiltiy.scannerDouble();
		
	//	Utiltiy.createFile(name);
	}

	@Override
	public double printReport() {
		// TODO Auto-generated method stub
		double inv=0;
        
		JSONArray arr= Utiltiy.readfile("/home/mobicom/Documents/stock.json");
		for (int i = 0; i < arr.size(); i++) 
		{ 
			
			JSONObject stock=(JSONObject) arr.get(i);
			JSONObject obj=(JSONObject) stock.get("stock");
		
			Double sharePrice=(Double) obj.get("sharePrice");
			Long numberOfShares =(Long) obj.get("numberOfShares");
			String symbol =(String) obj.get("name");
		
			
			inv = numberOfShares*sharePrice;
			System.out.println("Name : "+symbol+"\n"+"Number Of Shares : "+numberOfShares+"\n Share Price : "+sharePrice 
					+"\n Total Stock Value : "+inv);
			System.out.println();
		}
	return inv;
	}




}
