package com.bridgelabz.model;

public class DataAssign {
  public String stockName;
  public int numberOfShares;
  public double sharePrice;
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public int getNumberOfShares() {
	return numberOfShares;
}
public void setNumberOfShares(int numberOfShares) {
	this.numberOfShares = numberOfShares;
}
public DataAssign() {
	
}
public DataAssign(String stockName, int numberOfShares, double sharePrice) {
	super();
	this.stockName = stockName;
	this.numberOfShares = numberOfShares;
	this.sharePrice = sharePrice;
}
public double getSharePrice() {
	return sharePrice;
}
public void setSharePrice(double sharePrice) {
	this.sharePrice = sharePrice;
}
	
	
}
