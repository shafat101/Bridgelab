package com.bridgelabz.model;

public class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private String dateTime;
    private int sharePrice;
    
   
    
    
	public CompanyShares(String stockSymbol, int numberOfShares, String dateTime ,int sharePrice) {
		super();
		this.stockSymbol = stockSymbol;
		this.numberOfShares = numberOfShares;
		this.dateTime = dateTime;
		this.sharePrice = sharePrice;
	}
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
	
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public int getValue() {
		return (int) (numberOfShares * sharePrice);
	}
	@Override
	public String toString() {
		return "CompanyShares [stockSymbol=" + stockSymbol + ", numberOfShares=" + numberOfShares + ", dateTime="
				+ dateTime + "]";
	}
    
	
	
	
}
