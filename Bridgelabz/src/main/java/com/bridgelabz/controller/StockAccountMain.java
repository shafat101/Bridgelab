package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.StockAccount;

public class StockAccountMain {
	public static void main(String[] args) {
		StockAccount stockAccount = new StockAccount("hello");	//	class object
		stockAccount.addOrRemoveStock();
}
		
	}

