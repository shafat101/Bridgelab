package com.bridgelabz.commercialdp.service;



public interface FuncInterface {
    
	public void stockAccount(String filename);
	public double valueOf();
	public void buy(int amount,String symbol);
	public void sell(int amount,String symbol);
	public void save(String filename);
	public double printReport();
	
	
	
}
