package com.bridgelabz.commercialdp.model;

public class CompanyShares {
    public String stockSymbol;
    public int numberOfShares;
    public String dateTime;
    public double sharePrice;
    
   
    
    
//	public CompanyShares(String stockSymbol, int numberOfShares, String dateTime ,double sharePrice) {
//		super();
//		this.stockSymbol = stockSymbol;
//		this.numberOfShares = numberOfShares;
//		this.dateTime = dateTime;
//		this.sharePrice = sharePrice;
//	}
	public String isStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "CompanyShares [stockSymbol=" + stockSymbol + ", numberOfShares=" + numberOfShares + ", dateTime="
				+ dateTime + "]";
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
    
    
    
	
	
	
}
