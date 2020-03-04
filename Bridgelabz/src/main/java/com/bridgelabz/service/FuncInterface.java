package com.bridgelabz.service;



public interface FuncInterface {
    
	
	public double valueOf();
	public void buy(int amount,String symbol,int price);
	public void sell(int amount,String symbol,int price);
	public void save(String filename);
	public double printReport();
	
	
	
}
