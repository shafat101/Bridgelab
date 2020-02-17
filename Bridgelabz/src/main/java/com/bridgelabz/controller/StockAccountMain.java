package com.bridgelabz.controller;


import com.bridgelabz.oop.utility.Utiltiy;
import com.bridgelabz.serviceimplementation.StockAccount;
import com.bridgelabz.util.Utility;

public class StockAccountMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Enter your bank balance : ");
//		double amount = Utiltiy.scannerDouble();
	    int flag = 7;
	    StockAccount sA = new StockAccount();
	    while(flag != 0) {
	    	{
				System.out.println("1.stockAccount 2.printReport 3.valueOf\n"
						+ "4.buy  5.sell 6.save   8.exit");
				System.out.println("Stocks Avilable  : ");
				System.out.println();
				String[] array = Utiltiy.avaliableStocks();
				for (String string : array) {
					System.out.println(string);
				}
				System.out.println();
				System.out.println("enter choice");
				int choice=Utility.scannerInt();
				switch(choice)
				{
				case 1:
					
					break;
				case 2:
					sA.printReport();
					break;
				case 3:
					
					break;
				case 4:
					System.out.println("Enter the stock name to buy : ");
					String nameOfStock = Utiltiy.scannerString();
					System.out.println("Enter Number of Stocks You want to Buy : ");
					int numOfStocks = Utiltiy.scannerInt();
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 8:
					
					break;
				       
				default:System.out.println("enter correct choice");
						break;
				}
				
			}
}
		
		
		
		
		
		
	}
}
