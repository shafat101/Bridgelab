package com.bridgelabz.model;

public class AssignValues {
	private String stockNames;
	private int numberOfShares;
	private double sharePrice;
	
	public AssignValues(String stockNames, int numberOfShares, double sharePrice) {
		
		this.stockNames = stockNames;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}
	public AssignValues() {
		//AssignValues("TAta",1,1.0);
		}
	public String getStockNames() {
		return stockNames;
	}
	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	

}
