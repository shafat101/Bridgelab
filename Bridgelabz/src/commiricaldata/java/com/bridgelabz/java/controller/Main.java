package com.bridgelabz.java.controller;

import com.bridgelabz.java.serviceImplementation.InterfaceImplementation;
import com.bridgelabz.util.Utility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation  iim = new InterfaceImplementation();
		  //  iim.inputStock();
		    int flag = 7;
		    while(flag != 0) {
		    	{
					System.out.println("1.Add inventory 2.show inventory 3.calculate inventory\n"
							+ "4. show inventory    8.exit");
					System.out.println("enter choice");
					int choice=Utility.scannerInt();
					switch(choice)
					{
					case 1:iim.inputStock();
					break;
					case 2:  iim.totalStockValue();
					break;
					case 3:double d=iim.stockValue();
							System.out.println("inventory cost is:"+d);
							break;
					case 4:iim.showinventory();
					break;
					case 8:flag = 0;
					       break;
					       
					default:System.out.println("enter correct choice");
							break;
					}
					
				}
	}

}
}
