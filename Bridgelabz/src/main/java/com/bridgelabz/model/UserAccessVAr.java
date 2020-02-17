package com.bridgelabz.model;

public class UserAccessVAr {
	 public String name;     
	    public double cash;           
	    public int n;                 
	    public int shares;          
	    public String stocks;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getCash() {
			return cash;
		}
		public void setCash(double cash) {
			this.cash = cash;
		}
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
		public int getShares() {
			return shares;
		}
		public void setShares(int shares) {
			this.shares = shares;
		}
		public String getStocks() {
			return stocks;
		}
		public void setStocks(String stocks) {
			this.stocks = stocks;
		}
		@Override
		public String toString() {
			return "UserAccessVAr [name=" + name + ", cash=" + cash + ", n=" + n + ", shares=" + shares + ", stocks="
					+ stocks + "]";
		}  
}
